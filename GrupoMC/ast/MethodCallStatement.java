package ast;

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
}
