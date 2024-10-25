package ast;

public class VariableLocation extends Location {
    private String id;

    public VariableLocation(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public void print(String indent) {
        printIndent(indent);
        System.out.println("VariableLocation: " + id);
    }
}
