package ast;

import semantic.ASTVisitor;

public class ArrayLocation extends Location {
    private String id;
    private Expression index;

    public ArrayLocation(String id, Expression index) {
        this.id = id;
        this.index = index;
    }

    public String getId() {
        return id;
    }

    public Expression getIndex() {
        return index;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("ArrayLocation: " + id + "[");
        index.print(indent + "  ");
        printIndent(indent);
        System.out.println("]");
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
