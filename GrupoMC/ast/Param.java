package ast;

public class Param extends ASTNode {
    private Type type;
    private String id;
    private int line;

    public Param(Type type, String id, int line) {
        this.type = type;
        this.id = id;
        this.line = line;
        
    }



    public Type getType() {
        return type;
    }

    public String getId() {
        return id;
    }
    public int getLine() {
        return line;
    }


    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("Param: " + id);
        type.print(indent + "  ");
    }

    
}
