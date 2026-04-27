#!/usr/bin/env bash
# Kompilacja kompilatora (Main + LLVM + wygenerowany ANTLR) do build/classes/
set -euo pipefail
ROOT="$(cd "$(dirname "$0")" && pwd)"
cd "$ROOT"

JAR="${ANTLR_JAR:-$ROOT/antlr-4.13.2-complete.jar}"

JAR="/opt/homebrew/Cellar/antlr/4.13.2/antlr-4.13.2-complete.jar"

mkdir -p build/classes
javac -d build/classes -cp "$JAR" \
  Main.java LLVMActions.java LLVMGenerator.java \
  output/LangXLexer.java output/LangXParser.java \
  output/LangXBaseListener.java output/LangXListener.java

