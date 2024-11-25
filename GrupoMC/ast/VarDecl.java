package ast;

public class VarDecl extends ASTNode {
    private String id;
    // private Expression initExpr;
    private String typeName; // Puede ser null si no hay inicialización

    public VarDecl(String id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public String getId() {
        return id;
    }

    // public Expression getInitExpr() {
    //     return initExpr;
    // }

    public String getTypeName() { return typeName; }

    // @Override
    // public void print(String indent) {
    //     printIndent(indent);
    //     System.out.print("VarDecl: " + id);
    //     if (initExpr != null) {
    //         System.out.print(" = ");
    //         initExpr.print("");
    //     }
    //     System.out.println();
    // }
    public void print(String indent) {
        System.out.println(indent + "VarDecl: " + typeName + " " + id);
    }
}
