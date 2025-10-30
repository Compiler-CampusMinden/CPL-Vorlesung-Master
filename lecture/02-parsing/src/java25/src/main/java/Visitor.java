import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Visitor {
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

    MyVisitor eval = new MyVisitor();
    IO.println(eval.visit(tree));
  }

  static class MyVisitor extends MyLangBaseVisitor<Integer> {
    public Integer visitMul(MyLangParser.MulContext ctx) {
      IO.println("visitMul: lhs=" + ctx.lhs.getText() + ", rhs=" + ctx.rhs.getText());
      return visit(ctx.lhs) * visit(ctx.rhs);
    }

    public Integer visitAdd(MyLangParser.AddContext ctx) {
      IO.println("visitAdd:  lhs=" + ctx.lhs.getText() + ", rhs=" + ctx.rhs.getText());
      return visit(ctx.lhs) + visit(ctx.rhs);
    }

    public Integer visitNumber(MyLangParser.NumberContext ctx) {
      IO.println("visitNumber: NUM=" + ctx.NUM().getText());
      return Integer.parseInt(ctx.NUM().getText());
    }

    // thx, antlr! *grml*
    protected Integer aggregateResult(Integer agg, Integer next) {
      return next != null ? next : agg;
    }
  }
}
