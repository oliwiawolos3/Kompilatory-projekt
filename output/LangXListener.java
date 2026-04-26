// Generated from LangX.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangXParser}.
 */
public interface LangXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangXParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LangXParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LangXParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code write}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWrite(LangXParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWrite(LangXParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LangXParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LangXParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignElem}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignElem(LangXParser.AssignElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignElem}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignElem(LangXParser.AssignElemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayDecl}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterArrayDecl(LangXParser.ArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayDecl}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitArrayDecl(LangXParser.ArrayDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRead(LangXParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRead(LangXParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readElem}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReadElem(LangXParser.ReadElemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readElem}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReadElem(LangXParser.ReadElemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSingle(LangXParser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSingle(LangXParser.SingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(LangXParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(LangXParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(LangXParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(LangXParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neg}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNeg(LangXParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNeg(LangXParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(LangXParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(LangXParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(LangXParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(LangXParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(LangXParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(LangXParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(LangXParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(LangXParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(LangXParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(LangXParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xor}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterXor(LangXParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xor}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitXor(LangXParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangXParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LangXParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LangXParser.ValueContext ctx);
}