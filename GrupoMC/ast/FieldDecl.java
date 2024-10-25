package ast;

import java.util.ArrayList;

public class FieldDecl extends Declaration {
    private Type type;
    private ArrayList<VarDecl> varDecls;

    public FieldDecl(Type type, ArrayList<VarDecl> varDecls) {
        this.type = type;
        this.varDecls = varDecls;
    }

    public Type getType() {
        return type;
    }

    public ArrayList<VarDecl> getVarDecls() {
        return varDecls;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("FieldDecl");
        type.print(indent + "  ");
        for (VarDecl varDecl : varDecls) {
            varDecl.print(indent + "  ");
        }
    }
}
