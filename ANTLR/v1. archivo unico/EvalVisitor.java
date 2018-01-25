import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends PracticaBaseVisitor<Integer> {
    /** "memory" for our calculator; variable/value pairs go here */
    Map<String, Integer> memory = new HashMap<String, Integer>();
	
	/*@Override
	public Integer visitFloat(PracticaParser.FloatContext ctx) {
		return Float.valueOf(ctx.Float().getText()); }*/
	
	@Override
	public Integer visitInt(PracticaParser.IntContext ctx) {  
		return Integer.valueOf(ctx.INT().getText()); }
	
	@Override
	public Integer visitId(PracticaParser.IdContext ctx) {
		return visitChildren(ctx);
		}
	
	@Override 
	public Integer visitDiv(PracticaParser.DivContext ctx) {
		int left = visit(ctx.expr(0));  // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression        
        return left / right; // must be DIV
		}
	
	//@Override public T visitComp(PracticaParser.CompContext ctx) { return visitChildren(ctx); }
	
	@Override
	public Integer visitMinus(PracticaParser.MinusContext ctx) { 	
		int left = visit(ctx.expr(0));  // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        return left - right;
		}

	@Override 
	public Integer visitMul(PracticaParser.MulContext ctx) {
		int left = visit(ctx.expr(0));  // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        return left * right;
	}
	
		
	@Override
	public Integer visitPlus(PracticaParser.PlusContext ctx) {
		int left = visit(ctx.expr(0));  // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        return left + right;
		}
	
	 
    @Override
	public Integer visitLvalue(PracticaParser.LvalueContext ctx) {
		String id = ctx.ID().getText();  // id is left-hand side of '='
        int value = visit(ctx.expr());   // compute value of expression on right
        memory.put(id, value);           // store it in our memory
        return value; }
   
    /* expr NEWLINE 
    @Override
    public Integer visitPrintExpr(PracticaParser.PrintExprContext ctx) {
        Integer value = visit(ctx.expr()); // evaluate the expr child
        System.out.println(value);         // print the result
        return 0;                          // return dummy value
    }
    
    @Override
    public Integer visitParens(PracticaParser.ParensContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }*/
}
