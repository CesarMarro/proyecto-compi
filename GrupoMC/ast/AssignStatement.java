package ast;

import semantic.ASTVisitor;

public class AssignStatement extends Statement {
    private Location location;
    private String operator;
    private Expression expression;

    public AssignStatement(Location location, String operator, Expression expression) {
        this.location = location;
        this.operator = operator;
        this.expression = expression;
    }

    public Location getLocation() {
        return location;
    }

    public String getOperator() {
        return operator;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("AssignStatement: " + operator);
        printIndent(indent + "  ");
        System.out.println("Location:");
        location.print(indent + "    ");
        printIndent(indent + "  ");
        System.out.println("Expression:");
        expression.print(indent + "    ");
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
