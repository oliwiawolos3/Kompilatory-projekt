// Intro to ANTLR+LLVM
// sawickib, 2014-2023

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ANTLRFileStream input = new ANTLRFileStream(args[0]);

        boolean[] syntaxError = { false };

        BaseErrorListener errors = new BaseErrorListener() {
            @Override
            public void syntaxError(
                    Recognizer<?, ?> recognizer,
                    Object offendingSymbol,
                    int line,
                    int charPositionInLine,
                    String msg,
                    RecognitionException e) {
                syntaxError[0] = true;
                if (recognizer instanceof Lexer
                        && msg != null
                        && msg.contains("token recognition error")) {
                    String tail = msg.contains("at: ")
                            ? msg.substring(msg.indexOf("at: ") + 4).trim()
                            : msg;
                    System.err.println(
                            "error: nierozpoznany symbol leksykalny "
                                    + tail
                                    + " (linia "
                                    + line
                                    + ", kolumna "
                                    + (charPositionInLine + 1)
                                    + ")");
                } else if (recognizer instanceof Parser) {
                    System.err.println(
                            "error: blad skladniowy — linia "
                                    + line
                                    + ":"
                                    + (charPositionInLine + 1)
                                    + " — "
                                    + msg);
                } else {
                    System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
                }
            }
        };

        LangXLexer lexer = new LangXLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errors);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangXParser parser = new LangXParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errors);

        ParseTree tree = parser.prog();

        if (syntaxError[0] || parser.getNumberOfSyntaxErrors() > 0) {
            System.exit(1);
        }

        //System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMActions(), tree);

    }
}
