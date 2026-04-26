set -euo pipefail
ROOT="$(cd "$(dirname "$0")" && pwd)"
cd "$ROOT"

SRC="${1:-array_test.x}"
if [[ ! -f "$SRC" ]]; then
  echo "Brak pliku: $SRC" >&2
  exit 1
fi

JAR="${ANTLR_JAR:-$ROOT/antlr-4.13.2-complete.jar}"
JAR="/opt/homebrew/Cellar/antlr/4.13.2/antlr-4.13.2-complete.jar"

BASE="$(basename "$SRC" .x)"
LL="${BASE}.ll"
EXE="${BASE}.out"

java -cp "$JAR:build/classes" Main "$SRC" > "$LL"
clang "$LL" -o "$EXE"
"./$EXE"
