// Generated from Practica.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PracticaParser}.
 */
public interface PracticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PracticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PracticaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PracticaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(PracticaParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(PracticaParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PracticaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PracticaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterDiv(PracticaParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitDiv(PracticaParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comp}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterComp(PracticaParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comp}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitComp(PracticaParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterMinus(PracticaParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitMinus(PracticaParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterMul(PracticaParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitMul(PracticaParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterId(PracticaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitId(PracticaParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterInt(PracticaParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitInt(PracticaParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterPlus(PracticaParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitPlus(PracticaParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterAssign(PracticaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitAssign(PracticaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#bucle_if}.
	 * @param ctx the parse tree
	 */
	void enterBucle_if(PracticaParser.Bucle_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#bucle_if}.
	 * @param ctx the parse tree
	 */
	void exitBucle_if(PracticaParser.Bucle_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#cons_unless}.
	 * @param ctx the parse tree
	 */
	void enterCons_unless(PracticaParser.Cons_unlessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#cons_unless}.
	 * @param ctx the parse tree
	 */
	void exitCons_unless(PracticaParser.Cons_unlessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#cons_if}.
	 * @param ctx the parse tree
	 */
	void enterCons_if(PracticaParser.Cons_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#cons_if}.
	 * @param ctx the parse tree
	 */
	void exitCons_if(PracticaParser.Cons_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#bucle_while}.
	 * @param ctx the parse tree
	 */
	void enterBucle_while(PracticaParser.Bucle_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#bucle_while}.
	 * @param ctx the parse tree
	 */
	void exitBucle_while(PracticaParser.Bucle_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PracticaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PracticaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(PracticaParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(PracticaParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#terminator}.
	 * @param ctx the parse tree
	 */
	void enterTerminator(PracticaParser.TerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#terminator}.
	 * @param ctx the parse tree
	 */
	void exitTerminator(PracticaParser.TerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#crlf}.
	 * @param ctx the parse tree
	 */
	void enterCrlf(PracticaParser.CrlfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#crlf}.
	 * @param ctx the parse tree
	 */
	void exitCrlf(PracticaParser.CrlfContext ctx);
}