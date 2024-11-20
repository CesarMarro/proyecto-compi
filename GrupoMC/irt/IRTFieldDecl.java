package irt;

import ast.Type;
import java.util.ArrayList;

public class IRTFieldDecl extends IRTDecl {
    private Type type;
    private ArrayList<IRTVarDecl> varDecls;

    public IRTFieldDecl(Type type, ArrayList<IRTVarDecl> varDecls) {
        this.type = type;
        this.varDecls = varDecls;
    }

    @Override
    public void generateCode(CodeGenerator gen) {
        // Generate code for field declarations
    }
}