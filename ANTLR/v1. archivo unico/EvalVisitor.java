import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends PracticaBaseVisitor<Integer> {
    
    Map<String, Integer> memory = new HashMap<String, Integer>();
	
	/*@Override
	public Integer visitFloat(PracticaParser.FloatContext ctx) {
		return Float.valueOf(ctx.Float().getText()); }
	@Override
	public Integer visitImprime(PracticaParser.ImprimeContext ctx) {        
        System.out.println(visitChildren(ctx));         // print the result
        return 0;                          // return dummy value
    }*/
	@Override
	public Integer visitInt(PracticaParser.IntContext ctx) {  
		return Integer.valueOf(ctx.INT().getText()); }
	
	@Override
	public Integer visitId(PracticaParser.IdContext ctx) {
		return visitChildren(ctx);
		}
	
	@Override 
	public Integer visitDiv(PracticaParser.DivContext ctx) {
		int left = visit(ctx.rvalue(0));  // get value of left subrvalueession
        int right = visit(ctx.rvalue(1)); // get value of right subrvalueession        
        return left / right; // must be DIV
		}
	
	//@Override public T visitComp(PracticaParser.CompContext ctx) { return visitChildren(ctx); }
	
	@Override
	public Integer visitMinus(PracticaParser.MinusContext ctx) { 	
		int left = visit(ctx.rvalue(0));  // get value of left subrvalueession
        int right = visit(ctx.rvalue(1)); // get value of right subrvalueession
        return left - right;
		}

	@Override 
	public Integer visitMul(PracticaParser.MulContext ctx) {
		int left = visit(ctx.rvalue(0));  // get value of left subrvalueession
        int right = visit(ctx.rvalue(1)); // get value of right subrvalueession
        return left * right;
	}
	
		
	@Override
	public Integer visitPlus(PracticaParser.PlusContext ctx) {
		int left = visit(ctx.rvalue(0));  // get value of left subrvalueession
        int right = visit(ctx.rvalue(1)); // get value of right subrvalueession
        return left + right;
		}
	
	 
    @Override
	public Integer visitLvalue(PracticaParser.LvalueContext ctx) {
		String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return memory.get(id);
        return 0; }
		
	@Override
	public Integer visitImpID(PracticaParser.ImpIDContext ctx) {
		String id = ctx.lvalue().getText();
		System.out.println(id);         // print the result
        return 0;
		}
	
	@Override
	public Integer visitImpNum(PracticaParser.ImpNumContext ctx) {
		Integer value = visit(ctx.rvalue()); // evaluate the expr child
        System.out.println(value);         // print the result
        return 0; 
		}
	
	@Override
	public Integer visitImpString(PracticaParser.ImpStringContext ctx) {
		String id = ctx.string().getText();
		System.out.println(id);
		return 0;
		}
	@Override
	public Integer visitBooleano(PracticaParser.BooleanoContext ctx) {
		return visitChildren(ctx); }
   
    /* rvalue NEWLINE 
    @Override
    public Integer visitPrintrvalue(PracticaParser.PrintrvalueContext ctx) {
        Integer value = visit(ctx.rvalue()); // evaluate the rvalue child
        System.out.println(value);         // print the result
        return 0;                          // return dummy value
    }
    
    @Override
    public Integer visitParens(PracticaParser.ParensContext ctx) {
        return visit(ctx.rvalue()); // return child rvalue's value
    }*/
}
