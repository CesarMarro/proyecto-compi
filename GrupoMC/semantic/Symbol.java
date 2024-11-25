package semantic;

import ast.Type;

public class Symbol {
    private String name;
    private Type type;
    private SymbolKind kind;

    public Symbol(String name, Type type, SymbolKind kind) {
        this.name = name;
        this.type = type;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public SymbolKind getKind() {
        return kind;
    }
}
