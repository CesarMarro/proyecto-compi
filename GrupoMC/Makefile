# Nombre del archivo ejecutable (sin extensión)
EXEC = Compiler

# Directorios
COMPILER_DIR = compiler
SCANNER_DIR = scanner
BIN_DIR = .

# Archivos fuente
COMPILER_SRC = $(COMPILER_DIR)/Compiler.java
LEXER_SRC = $(SCANNER_DIR)/Lexer.java
TOKENS_SRC = $(SCANNER_DIR)/Tokens.java

# Compilar los archivos del scanner y el compilador
build:
	javac -d $(BIN_DIR) $(LEXER_SRC) $(TOKENS_SRC) $(COMPILER_SRC)

# Ejecutar la compilación por defecto
all: build

# Limpiar los archivos compilados
clean:
	rm -f $(BIN_DIR)/*.class

