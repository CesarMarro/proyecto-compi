package irt;

import java.util.List;

public class IRTMethodDecl extends IRTNode {
    private String name;
    private List<IRTParam> parameters;
    private IRTBlock body;

    public IRTMethodDecl(String name, List<IRTParam> parameters, IRTBlock body) {
        this.name = name;
        this.parameters = parameters;
        this.body = body;
    }

    @Override
    public String toDot() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"").append(hashCode()).append("\" [label=\"Method: " + name + "\"];\n");
        for (IRTParam param : parameters) {
            sb.append("\"").append(hashCode()).append("\" -> \"").append(param.hashCode()).append("\";\n");
            sb.append(param.toDot());
        }
        sb.append("\"").append(hashCode()).append("\" -> \"").append(body.hashCode()).append("\";\n");
        sb.append(body.toDot());
        return sb.toString();
    }

    @Override
    public String toStringIndented(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("MethodDecl: ").append(name).append("\n");
        sb.append(indent).append("  Parameters:\n");
        for (IRTParam param : parameters) {
            sb.append(param.toStringIndented(indent + "    "));
        }
        sb.append(indent).append("  Body:\n");
        sb.append(body.toStringIndented(indent + "    "));
        return sb.toString();
    }
}
