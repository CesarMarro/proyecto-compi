package ast;

import semantic.ASTVisitor;

public class VarDecl extends ASTNode {
    private Type type;
    private String id;
    private Expression initExpr; // Puede ser null si no hay inicialización

    // Constructor existente que acepta Type, String y Expression
    public VarDecl(Type type, String id, Expression initExpr) {
        this.type = type;
        this.id = id;
        this.initExpr = initExpr;
    }

    // Constructor adicional que acepta solo String y Expression
    public VarDecl(String id, Expression initExpr) {
        this.type = null; // Tipo se asignará posteriormente
        this.id = id;
        this.initExpr = initExpr;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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
        if (type != null) {
            System.out.print(" : ");
            type.print("");
        }
        if (initExpr != null) {
            System.out.print(" = ");
            initExpr.print("");
        }
        System.out.println();
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
