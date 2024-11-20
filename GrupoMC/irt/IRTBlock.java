package irt;

import java.util.ArrayList;

public class IRTBlock extends IRTNode {
    private ArrayList<IRTVarDecl> varDecls;
    private ArrayList<IRTStatement> statements;

    public IRTBlock(ArrayList<IRTVarDecl> varDecls, ArrayList<IRTStatement> statements) {
        this.varDecls = varDecls;
        this.statements = statements;
    }

    @Override
    public void generateCode(CodeGenerator gen) {
        // Generate code for block
    }
}