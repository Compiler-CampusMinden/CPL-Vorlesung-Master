import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Simple {
  static void main(String... args) {
    // result99 = acc_2*ACC_2 + spillover7 + bonus_1*3 + inc_0;
    // calc_42 = __9 * zZ_1 + 5 + FooBar_42 * bar_7 + q0;
    // _ExprLine + A_1 * bB_2 + cc3 * 7 +      11;
    // 2+3*4;

    CharStream input = CharStreams.fromString(IO.readln("expr?> "));
    MyLangLexer lexer = new MyLangLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    MyLangParser parser = new MyLangParser(tokens);

    ParseTree tree = parser.start();

    IO.println(tree.toStringTree(parser));
  }
}
