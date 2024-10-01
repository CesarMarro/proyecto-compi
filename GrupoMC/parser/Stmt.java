package parser;

public class Stmt {
    public String value;

    public Stmt(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Stmt: " + value;
    }
}