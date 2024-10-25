package ast;

public class VarDecl extends ASTNode {
    private String id;
    private Expression initExpr; // Puede ser null si no hay inicialización

    public VarDecl(String id, Expression initExpr) {
        this.id = id;
        this.initExpr = initExpr;
    }

    public String getId() {
        return id;
    }

    public Expression getInitExpr() {
        return initExpr;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.print("VarDecl: " + id);
        if (initExpr != null) {
            System.out.print(" = ");
            initExpr.print("");
        }
        System.out.println();
    }
}
