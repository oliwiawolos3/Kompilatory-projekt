set -euo pipefail
ROOT="$(cd "$(dirname "$0")" && pwd)"
cd "$ROOT"

antlr -Dlanguage=Java -o output -listener LangX.g4

