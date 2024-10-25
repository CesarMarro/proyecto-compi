package ast;

public class Param extends ASTNode {
    private Type type;
    private String id;

    public Param(Type type, String id) {
        this.type = type;
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("Param: " + id);
        type.print(indent + "  ");
    }
}
