// Generated from Practica.g4 by ANTLR 4.7

	import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PracticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PracticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PracticaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(PracticaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(PracticaParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PracticaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(PracticaParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalue(PracticaParser.RvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(PracticaParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(PracticaParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(PracticaParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(PracticaParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#bucle_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle_if(PracticaParser.Bucle_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PracticaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(PracticaParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(PracticaParser.NumberContext ctx);
}