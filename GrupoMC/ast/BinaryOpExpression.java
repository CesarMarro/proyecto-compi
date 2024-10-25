package ast;

public class BinaryOpExpression extends Expression {
    private Expression left;
    private String operator;
    private Expression right;

    public BinaryOpExpression(Expression left, String operator, Expression right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public String getOperator() {
        return operator;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("BinaryOpExpression: " + operator);
        printIndent(indent + "  ");
        System.out.println("Left:");
        left.print(indent + "    ");
        printIndent(indent + "  ");
        System.out.println("Right:");
        right.print(indent + "    ");
    }
}
