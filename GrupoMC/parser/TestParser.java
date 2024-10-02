package parser;

import java.io.FileReader;
import java.io.BufferedReader;
import java_cup.runtime.Symbol;

public class TestParser {
    public static void main(String[] args) {
        try {
            // Open the input file
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            
            // Create an instance of your Lexer
            Lexer lexer = new Lexer(reader);
            
            // Create an instance of the CUP Parser
            Parser parser = new Parser(lexer);
            
            // Parse the input
            Symbol parseResult = parser.parse();
            
            // You can now inspect the result (parse tree or program)
            System.out.println("Parsing completed successfully!");
            System.out.println("Parse result: " + parseResult.value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
