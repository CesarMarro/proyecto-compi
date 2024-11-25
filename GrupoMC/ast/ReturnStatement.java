package ast;

import semantic.ASTVisitor;

public class ReturnStatement extends Statement {
    private Expression expression;

    public ReturnStatement(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("ReturnStatement");
        expression.print(indent + "  ");
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
