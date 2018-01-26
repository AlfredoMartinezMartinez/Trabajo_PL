import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends PracticaBaseVisitor<Object> {
    
    Map<String, Object> memory = new HashMap<String, Object>();
	
	@Override
	public Object visitInt(PracticaParser.IntContext ctx) {  
		return Integer.valueOf(ctx.INT().getText()); }
	
	@Override
	public Object visitId(PracticaParser.IdContext ctx) {
		return visitChildren(ctx);
		}
	@Override
	public Object visitAssign(PracticaParser.AssignContext ctx) { return visitChildren(ctx); }
	
	@Override
	public Object visitAssi(PracticaParser.AssiContext ctx) {
		String id = ctx.lvalue().getText();  // id is left-hand side of '='
        int c = (int)visit(ctx.rvalue());   // compute value of expression on right
		Object value =(Integer) c;
        memory.put(id, value);           // store it in our memory
        return value;
		}
	
	@Override 
	public Object visitDiv(PracticaParser.DivContext ctx) {
		int left = (int)visit(ctx.rvalue(0));  // get value of left subrvalueession
        int right = (int)visit(ctx.rvalue(1)); // get value of right subrvalueession  
		Object x =(Integer) left / right;
        return x; // must be DIV
		}
	
	@Override
	public Object visitMinus(PracticaParser.MinusContext ctx) { 	
		int left = (int)visit(ctx.rvalue(0));  // get value of left subrvalueession
        int right = (int)visit(ctx.rvalue(1)); // get value of right subrvalueession
		Object x =(Integer) left - right;
        return x;
		}

	@Override 
	public Object visitMul(PracticaParser.MulContext ctx) {
		int left = (int)visit(ctx.rvalue(0));  // get value of left subrvalueession
        int right = (int)visit(ctx.rvalue(1)); // get value of right subrvalueession
		Object x=(Integer) left * right;
        return x;
	}
	
		
	@Override
	public Object visitPlus(PracticaParser.PlusContext ctx) {
		int left = (int)visit(ctx.rvalue(0));  // get value of left subrvalueession
        int right = (int)visit(ctx.rvalue(1)); // get value of right subrvalueession
		Object x=(Integer) left + right;
        return x;
		}
	
	 
    @Override
	public Object visitLvalue(PracticaParser.LvalueContext ctx) {
		String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return memory.get(id);
        return 0; }
		
	@Override
	public Object visitImpID(PracticaParser.ImpIDContext ctx) {
		String id = ctx.lvalue().getText();
		if ( memory.containsKey(id) )
			System.out.println(memory.get(id));         // print the result
        return 0;
		}
	
	@Override
	public Object visitImpNum(PracticaParser.ImpNumContext ctx) {
		Object value = visit(ctx.rvalue()); // evaluate the expr child
        System.out.println(value);         // print the result
        return 0; 
		}
	
	@Override
	public Object visitImpString(PracticaParser.ImpStringContext ctx) {
		String id = ctx.string().getText();
		System.out.println(id);
		return 0;
		}
	@Override
	public Object visitBooleano(PracticaParser.BooleanoContext ctx) {
		return Boolean.valueOf(ctx.getText()); }
	@Override	
	public Object visitBool(PracticaParser.BoolContext ctx) {
    return (boolean)visit(ctx);
  }
		
	@Override
	public Object visitComp(PracticaParser.CompContext ctx) {
		String id = ctx.OPCOMP().getText();
		if (ctx.OPCOMP() != null) {
		  if (id.equals("==") ) {
			return this.visit(ctx.rvalue(0)).equals(this.visit(ctx.rvalue(1)));
			}
			else if (id.equals("!=")) {
				return !this.visit(ctx.rvalue(0)).equals(this.visit(ctx.rvalue(1)));
				}
				else if (id.equals(">=")) {
					return this.visit(ctx.rvalue(0)).equals(this.visit(ctx.rvalue(1)));
					}
					else if (id.equals("<") ){
						return this.visit(ctx.rvalue(0)).equals(this.visit(ctx.rvalue(1)));
						}
						else if (id.equals(">")) {
							return this.visit(ctx.rvalue(0)).equals(this.visit(ctx.rvalue(1)));
							}
		}
		throw new RuntimeException("not implemented: comparator operator " + ctx.OPCOMP().getText());
		}
   
   
}
