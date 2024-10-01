package parser;


public class Expr {
    public String value;

    public Expr(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Expr: " + value;
    }
}