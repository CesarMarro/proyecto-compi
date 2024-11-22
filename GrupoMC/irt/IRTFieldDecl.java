package irt;

public class IRTFieldDecl extends IRTNode {
    private String name;
    private String type;

    public IRTFieldDecl(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toDot() {
        return "\"" + hashCode() + "\" [label=\"Field: " + name + " (" + type + ")\"];\n";
    }

    @Override
    public String toStringIndented(String indent) {
        return indent + "FieldDecl: " + name + " (" + type + ")\n";
    }
}
