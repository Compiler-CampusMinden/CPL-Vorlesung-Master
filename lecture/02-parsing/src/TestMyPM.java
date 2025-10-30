import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class TestMyPM {
  static class PatternMatching {
    static Integer eval(calcParser.ExprContext e) {
      return switch (e) {
        case calcParser.MULTContext m -> eval(m.e1) * eval(m.e2);
        case calcParser.ADDContext a -> eval(a.e1) + eval(a.e2);
        case calcParser.ZAHLContext n -> Integer.parseInt(n.DIGIT().getText());
        default ->
            throw new IllegalStateException("Unhandled expr: " + e.getClass().getSimpleName());
      };
    }
  }

  public static void main(String[] args) throws Exception {
    CharStream input = CharStreams.fromString(IO.readln("expr?> "));
    calcLexer lexer = new calcLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    calcParser parser = new calcParser(tokens);

    calcParser.SContext tree = parser.s(); // Start-Regel

    IO.println(PatternMatching.eval(tree.expr()));
  }
}
