package irt;

import ast.Type;

public class IRTParam extends IRTNode {
    private Type type;
    private String id;

    public IRTParam(Type type, String id) {
        this.type = type;
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    @Override
    public void generateCode(CodeGenerator gen) {
        // No code generation needed for parameters
    }
}