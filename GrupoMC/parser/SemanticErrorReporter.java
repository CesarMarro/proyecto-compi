package parser;

import java.util.ArrayList;

class SemanticErrorReporter {
    private ArrayList<String> errors = new ArrayList<>();

    public void reportError(String message) {
        errors.add(message);
    }

    public void printErrors() {
        for (String error : errors) {
            System.err.println(error);
        }
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }
}