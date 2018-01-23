// Generated from Practica.g4 by ANTLR 4.7.1
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
	 * Enter a parse tree produced by {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(PracticaParser.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(PracticaParser.RvalueContext ctx);
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