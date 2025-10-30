import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class AstBuilder {
  static void main(String... args) {
    // result99 = acc_2*ACC_2 + spillover7 + bonus_1*3 + inc_0;
    // calc_42 = __9 * zZ_1 + 5 + FooBar_42 * bar_7 + q0;
    // _ExprLine + A_1 * bB_2 + cc3 * 7 +      11;
    // 2+3*4;

    CharStream input = CharStreams.fromString(IO.readln("expr?> "));
    MyLangLexer lexer = new MyLangLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    MyLangParser parser = new MyLangParser(tokens);

    MyLangParser.StartContext tree = parser.start();

    IO.println(toAst(tree));
  }

  static List<Stmt> toAst(MyLangParser.StartContext s) {
    return s.stmt().stream()
        .map(AstBuilder::toAst)
        .collect(Collectors.toCollection(ArrayList::new));
  }

  static Stmt toAst(MyLangParser.StmtContext s) {
    return switch (s) {
      case MyLangParser.AssignContext a -> new Stmt.Assign(a.id.getText(), toAst(a.value));
      case MyLangParser.ExprStmtContext e -> new Stmt.ExprStmt(toAst(e.expr()));
      default -> throw new IllegalStateException("Unhandled stmt: " + s.getClass().getSimpleName());
    };
  }

  static Expr toAst(MyLangParser.ExprContext e) {
    return switch (e) {
      case MyLangParser.MulContext m -> new Expr.Mul(toAst(m.lhs), toAst(m.rhs));
      case MyLangParser.AddContext a -> new Expr.Add(toAst(a.lhs), toAst(a.rhs));
      case MyLangParser.NameContext n -> new Expr.Name(n.ID().getText());
      case MyLangParser.NumberContext n -> new Expr.Number(Integer.parseInt(n.NUM().getText()));
      default -> throw new IllegalStateException("Unhandled expr: " + e.getClass().getSimpleName());
    };
  }
}

sealed interface Stmt permits Stmt.Assign, Stmt.ExprStmt {
  record Assign(String id, Expr value) implements Stmt {}

  record ExprStmt(Expr expr) implements Stmt {}
}

sealed interface Expr permits Expr.Mul, Expr.Add, Expr.Name, Expr.Number {
  record Mul(Expr lhs, Expr rhs) implements Expr {}

  record Add(Expr lhs, Expr rhs) implements Expr {}

  record Name(String id) implements Expr {}

  record Number(int value) implements Expr {}
}
