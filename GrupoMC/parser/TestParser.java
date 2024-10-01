package parser;

import java.io.FileReader;
import java.io.BufferedReader;

public class TestParser {
    public static void main(String[] args) {
        try {
            // Initialize the lexer using your input file
            Lexer lexer = new Lexer(new BufferedReader(new FileReader("input.txt")));
            
            // Create an instance of the parser with the lexer
            Parser parser = new Parser(lexer);
            
            // Parse the input
            parser.parse();
            
            System.out.println("Parsing completed successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
