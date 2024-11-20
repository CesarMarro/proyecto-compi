package irt;

import ast.Type;
import java.util.ArrayList;

public class IRTMethodDecl extends IRTDecl {
    private Type returnType;
    private String id;
    private ArrayList<IRTParam> params;
    private IRTBlock body;

    public IRTMethodDecl(Type returnType, String id, ArrayList<IRTParam> params, IRTBlock body) {
        this.returnType = returnType;
        this.id = id;
        this.params = params;
        this.body = body;
    }

    @Override
    public void generateCode(CodeGenerator gen) {
        // Generate code for method declarations
    }
}