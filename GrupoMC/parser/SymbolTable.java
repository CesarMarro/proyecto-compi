package parser;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

class SymbolTable {
    private Stack<HashMap<String, Symbol>> scopes;

    public SymbolTable() {
        scopes = new Stack<>();
        scopes.push(new HashMap<>());

        declaredMethods = new HashSet<>();
        enterScope(); // Start with a global scope
    }

    private Set<String> declaredMethods = new HashSet<>();

public boolean insertMethod(String id) {
        if (declaredMethods.contains(id)) {
            return false; // Method already declared
        } else {
            declaredMethods.add(id);
            return true;
        }
    }

public boolean isMethodDeclared(String id) {
    return declaredMethods.contains(id);
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
   public boolean lookup(String id) {
    for (int i = scopes.size() - 1; i >= 0; i--) {
        Map<String, Symbol> scope = scopes.get(i);
        if (scope.containsKey(id)) {
            return true; // Found the identifier in one of the scopes
        }
    }
    return false; // Not found in any scope
}
}

