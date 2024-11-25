package ast;

import semantic.ASTVisitor;
import java.util.ArrayList;

public class MethodCall extends Expression {
    private String id;
    private ArrayList<Expression> arguments;

    public MethodCall(String id, ArrayList<Expression> arguments) {
        this.id = id;
        this.arguments = arguments;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Expression> getArguments() {
        return arguments;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("MethodCall: " + id);
        if (!arguments.isEmpty()) {
            printIndent(indent + "  ");
            System.out.println("Arguments:");
            for (Expression arg : arguments) {
                arg.print(indent + "    ");
            }
        }
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

