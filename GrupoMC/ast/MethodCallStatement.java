package ast;

import semantic.ASTVisitor;

public class MethodCallStatement extends Statement {
    private MethodCall methodCall;

    public MethodCallStatement(MethodCall methodCall) {
        this.methodCall = methodCall;
    }

    public MethodCall getMethodCall() {
        return methodCall;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("MethodCallStatement:");
        methodCall.print(indent + "  ");
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
