package parser;

import java.util.HashMap;
import java.util.Stack;

class SymbolTable {
    private Stack<HashMap<String, Symbol>> scopes;

    public SymbolTable() {
        scopes = new Stack<>();
        enterScope(); // Start with a global scope
    }

    // Represents a symbol in the symbol table
    public static class Symbol {
        public String type;
        public boolean isInitialized;

        public Symbol(String type) {
            this.type = type;
            this.isInitialized = false;
        }
    }

    // Enter a new scope
    public void enterScope() {
        scopes.push(new HashMap<>());
    }

    // Exit the current scope
    public void exitScope() {
        if (!scopes.isEmpty()) {
            scopes.pop();
        }
    }

    // Insert a symbol in the current scope
    public boolean insert(String name, String type) {
        if (scopes.peek().containsKey(name)) {
            return false; // Symbol already exists in this scope
        }
        scopes.peek().put(name, new Symbol(type));
        return true;
    }

    // Lookup a symbol in the scopes, starting from the innermost scope
    public Symbol lookup(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            if (scopes.get(i).containsKey(name)) {
                return scopes.get(i).get(name);
            }
        }
        return null; // Symbol not found
    }
}

