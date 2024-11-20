package irt;

import java.util.ArrayList;

public class IRTProgram extends IRTNode {
    private ArrayList<IRTDecl> declarations;

    public IRTProgram(ArrayList<IRTDecl> declarations) {
        this.declarations = declarations;
    }

    @Override
    public void generateCode(CodeGenerator gen) {
        for (IRTDecl decl : declarations) {
            decl.generateCode(gen);
        }
    }
}