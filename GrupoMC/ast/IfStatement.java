package ast;

public class IfStatement extends Statement {
    private Expression condition;
    private Statement thenStmt;
    private Statement elseStmt; // Puede ser null si no hay else

    public IfStatement(Expression condition, Statement thenStmt, Statement elseStmt) {
        this.condition = condition;
        this.thenStmt = thenStmt;
        this.elseStmt = elseStmt;
    }

    public Expression getCondition() {
        return condition;
    }

    public Statement getThenStmt() {
        return thenStmt;
    }

    public Statement getElseStmt() {
        return elseStmt;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("IfStatement");
        printIndent(indent + "  ");
        System.out.println("Condition:");
        condition.print(indent + "    ");
        printIndent(indent + "  ");
        System.out.println("Then:");
        thenStmt.print(indent + "    ");
        if (elseStmt != null) {
            printIndent(indent + "  ");
            System.out.println("Else:");
            elseStmt.print(indent + "    ");
        }
    }
}
