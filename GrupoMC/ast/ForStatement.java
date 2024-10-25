package ast;

public class ForStatement extends Statement {
    private String id;
    private Expression initExpr;
    private Expression conditionExpr;
    private Expression updateExpr;
    private Statement body;

    public ForStatement(String id, Expression initExpr, Expression conditionExpr, Expression updateExpr, Statement body) {
        this.id = id;
        this.initExpr = initExpr;
        this.conditionExpr = conditionExpr;
        this.updateExpr = updateExpr;
        this.body = body;
    }

    public String getId() {
        return id;
    }

    public Expression getInitExpr() {
        return initExpr;
    }

    public Expression getConditionExpr() {
        return conditionExpr;
    }

    public Expression getUpdateExpr() {
        return updateExpr;
    }

    public Statement getBody() {
        return body;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("ForStatement");
        printIndent(indent + "  ");
        System.out.println("Initialization:");
        initExpr.print(indent + "    ");
        printIndent(indent + "  ");
        System.out.println("Condition:");
        conditionExpr.print(indent + "    ");
        printIndent(indent + "  ");
        System.out.println("Update:");
        updateExpr.print(indent + "    ");
        printIndent(indent + "  ");
        System.out.println("Body:");
        body.print(indent + "    ");
    }
}
