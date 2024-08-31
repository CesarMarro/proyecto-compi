# Makefile para compilar el proyecto del compilador

# Nombre del proyecto
PROJECT = Compiler

# Directorios y archivos
SRC_DIR = "C:/Users/Javier\ C/OneDrive\ -\ Universidad\ Francisco\ Marroquin/Clases/Cloud/Proyecto-Compi/class/compiler/scanner"
BIN_DIR = .

# Archivo fuente específico a compilar
SOURCE = "$(SRC_DIR)\lexer.java"

# Ruta completa para el compilador de Java (con comillas)
JAVAC = "C:\Program Files\Java\jdk-17\bin\javac"
JFLAGS = -d "$(BIN_DIR)"

# Regla de compilación
all:
	$(JAVAC) $(JFLAGS) $(SOURCE)

# Regla para limpiar archivos compilados
clean:
	del /Q $(BIN_DIR)\*.class

# Documentación del uso del makefile
help:
	@echo "Uso del Makefile:"
	@echo "  make        - Compila el archivo fuente lexer.java"
	@echo "  make clean  - Elimina todos los archivos .class generados"