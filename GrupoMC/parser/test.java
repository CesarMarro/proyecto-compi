package parser;

import java.io.FileReader;
import java_cup.runtime.Symbol;
import ast.*;
import semantic.SemanticAnalyzer;

public class test {
    public static void main(String[] args) {
        try {
            // Ruta al archivo de prueba
            // Asegúrate de que esta ruta apunta al archivo de prueba que deseas analizar
            FileReader fileReader = new FileReader("test.txt");

            // Crear una instancia del lexer
            LexerParser lexer = new LexerParser(fileReader);

            // Crear una instancia del parser
            parser parser = new parser(lexer);

            // Parsear la entrada y obtener la raíz del AST
            Symbol parseResult = parser.parse();
            Program astRoot = (Program) parseResult.value;

            // Imprimir el AST
            System.out.println("Parsing completado.");
            astRoot.print("");

            // Ejecutar el análisis semántico
            SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer();
            astRoot.accept(semanticAnalyzer);

            // Verificar si hay errores semánticos
            if (semanticAnalyzer.getErrors().isEmpty()) {
                System.out.println("Análisis semántico completado sin errores.");
            } else {
                System.out.println("Errores de análisis semántico encontrados:");
                for (String error : semanticAnalyzer.getErrors()) {
                    System.out.println(error);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
