package irt;

public class IRTParam extends IRTNode {
    private String name;
    private String type;

    public IRTParam(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toDot() {
        return "\"" + hashCode() + "\" [label=\"Param: " + name + " (" + type + ")\"];\n";
    }

    @Override
    public String toStringIndented(String indent) {
        return indent + "Param: " + name + " (" + type + ")\n";
    }
}
