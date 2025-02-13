# Variables
JAVAC = javac
JAR = jar
SRC_DIR = P1
BIN_DIR = bin
MAIN_CLASS = Principal

# Reglas
.PHONY: all clean run

all: $(BIN_DIR)/$(MAIN_CLASS).class

$(BIN_DIR)/%.class: $(SRC_DIR)/%.java
    mkdir -p $(BIN_DIR)
    $(JAVAC) -d $(BIN_DIR) $<

run: all
    java -cp $(BIN_DIR) $(MAIN_CLASS)

clean:
    rm -rf $(BIN_DIR)
