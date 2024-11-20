package irt;

import ast.Expression;

public class IRTVarDecl extends IRTDecl {
    private String id;
    private IRTExpr initExpr; // Can be null if no initialization

    public IRTVarDecl(String id, IRTExpr initExpr) {
        this.id = id;
        this.initExpr = initExpr;
    }

    public String getId() {
        return id;
    }

    public IRTExpr getInitExpr() {
        return initExpr;
    }

    @Override
    public void generateCode(CodeGenerator gen) {
        if (initExpr != null) {
            initExpr.generateCode(gen);
            String temp = gen.getLastTemp();
            gen.emit(id + " = " + temp);
        }
    }
}