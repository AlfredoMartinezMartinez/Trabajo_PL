// Generated from Practica.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by {@link PracticaParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(PracticaParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rvalor}
	 * labeled alternative in {@link PracticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalor(PracticaParser.RvalorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code b_if}
	 * labeled alternative in {@link PracticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_if(PracticaParser.B_ifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code b_while}
	 * labeled alternative in {@link PracticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_while(PracticaParser.B_whileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link PracticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(PracticaParser.BooleanoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imprime}
	 * labeled alternative in {@link PracticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprime(PracticaParser.ImprimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(PracticaParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comp}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(PracticaParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(PracticaParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(PracticaParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(PracticaParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(PracticaParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(PracticaParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link PracticaParser#rvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(PracticaParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#bucle_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle_if(PracticaParser.Bucle_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#cons_unless}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCons_unless(PracticaParser.Cons_unlessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#cons_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCons_if(PracticaParser.Cons_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#bucle_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle_while(PracticaParser.Bucle_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PracticaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impID}
	 * labeled alternative in {@link PracticaParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpID(PracticaParser.ImpIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impNum}
	 * labeled alternative in {@link PracticaParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpNum(PracticaParser.ImpNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impString}
	 * labeled alternative in {@link PracticaParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpString(PracticaParser.ImpStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(PracticaParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PracticaParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminator(PracticaParser.TerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PracticaParser#crlf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrlf(PracticaParser.CrlfContext ctx);
}