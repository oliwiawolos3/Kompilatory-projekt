// Generated from LangX.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangXParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangXVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangXParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LangXParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code write}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(LangXParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LangXParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignElem}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignElem(LangXParser.AssignElemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayDecl}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDecl(LangXParser.ArrayDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(LangXParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readElem}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadElem(LangXParser.ReadElemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle(LangXParser.SingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(LangXParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(LangXParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(LangXParser.NegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(LangXParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(LangXParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(LangXParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(LangXParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(LangXParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xor}
	 * labeled alternative in {@link LangXParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor(LangXParser.XorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangXParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LangXParser.ValueContext ctx);
}