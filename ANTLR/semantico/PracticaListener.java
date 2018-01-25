// Generated from Practica.g4 by ANTLR 4.7.1

	package tools;
	import java.util.*;

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
	 * Enter a parse tree produced by {@link PracticaParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(PracticaParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(PracticaParser.SentenceContext ctx);
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
	 * Enter a parse tree produced by {@link PracticaParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(PracticaParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(PracticaParser.PrintContext ctx);
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
	 * Enter a parse tree produced by {@link PracticaParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(PracticaParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(PracticaParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(PracticaParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(PracticaParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(PracticaParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(PracticaParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(PracticaParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(PracticaParser.DivContext ctx);
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
	 * Enter a parse tree produced by {@link PracticaParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(PracticaParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(PracticaParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PracticaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PracticaParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PracticaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PracticaParser.NumberContext ctx);
}