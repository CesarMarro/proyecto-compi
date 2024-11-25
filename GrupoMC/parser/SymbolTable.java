package parser;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import ast.Type;

class SymbolTable {
    private Stack<HashMap<String, Symbol>> scopes;
    private Scope currentScope;

    

    public SymbolTable() {
        currentScope = new Scope(null); // Start with a global scope
        declaredMethods = new HashSet<>();// Start with a global scope
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
public void enterScope() {
    Scope newScope = new Scope(currentScope);
    currentScope = newScope;
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



    // Exit the current scope
    public void exitScope() {
        currentScope = currentScope.getParent();
    }

    // Insert a symbol in the current scope
    public boolean insert(String name, String paramType) {
        return currentScope.insert(name, paramType);
    }

    // Lookup a symbol in the scopes, starting from the innermost scope
   public boolean lookup(String id) {
    return currentScope.lookup(id);  
    }
public void insertParameters(List<ParameterNode> parameters) {
    for (ParameterNode param : parameters) {
        boolean success = insert(param.getName(), param.getType());
        if (!success) {
            // Handle duplicate parameter names
            System.err.println("Semantic Error at line " + param.getLine() + ": Parameter '" + param.getName() + "' is already declared.");
        }
    }
}
}



