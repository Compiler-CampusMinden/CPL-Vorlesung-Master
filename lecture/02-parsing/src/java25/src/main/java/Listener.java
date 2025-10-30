import java.util.Stack;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Listener {
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

    ParseTreeWalker walker = new ParseTreeWalker();
    MyListener eval = new MyListener();
    walker.walk(eval, tree);

    IO.println(eval.erg.peek());
  }

  static class MyListener extends MyLangBaseListener {
    public Stack<Integer> erg = new Stack<>();

    public void exitMul(MyLangParser.MulContext ctx) {
      IO.println("exitMul: lhs=" + ctx.lhs.getText() + ", rhs=" + ctx.rhs.getText());
      erg.push(erg.pop() * erg.pop());
    }

    public void exitAdd(MyLangParser.AddContext ctx) {
      IO.println("exitAdd:  lhs=" + ctx.lhs.getText() + ", rhs=" + ctx.rhs.getText());
      erg.push(erg.pop() + erg.pop());
    }

    public void exitNumber(MyLangParser.NumberContext ctx) {
      IO.println("exitNumber: NUM=" + ctx.NUM().getText());
      erg.push(Integer.parseInt(ctx.NUM().getText()));
    }
  }
}
