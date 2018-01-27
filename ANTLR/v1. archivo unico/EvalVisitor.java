import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvalVisitor extends PracticaBaseVisitor<Value> {
    
    Map<String, Value> memory = new HashMap<String, Value>();
	
	@Override
	public Value visitAssign(PracticaParser.AssignContext ctx) { return visitChildren(ctx); }
	
	@Override
	public Value visitAssi(PracticaParser.AssiContext ctx) {
		String id = ctx.lvalue().getText();  // id is left-hand side of '='
        Value value = this.visit(ctx.rvalue());   // compute value of expression on right
		return memory.put(id, value);          // store it in our memory
    }
	
	@Override
	public Value visitInt(PracticaParser.IntContext ctx) {  
		return new Value (Integer.valueOf(ctx.getText()));
		}
		
	@Override	
	public Value visitBool(PracticaParser.BoolContext ctx) {
    return new Value(Boolean.valueOf(ctx.getText()));
  }
	
	@Override
	public Value visitId(PracticaParser.IdContext ctx) {
		return visitChildren(ctx);
		}
	
	@Override
	public Value visitLvalue(PracticaParser.LvalueContext ctx) {
		String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return memory.get(id);
        return null;
		}
		
	@Override 
	public Value visitDiv(PracticaParser.DivContext ctx) {
		Value left = visit(ctx.rvalue(0));  // get value of left subrvalueession
        Value right = visit(ctx.rvalue(1)); // get value of right subrvalueession  
		return new Value(left.asInteger() / right.asInteger());       
		}
	
	@Override
	public Value visitMinus(PracticaParser.MinusContext ctx) { 	
		Value left = visit(ctx.rvalue(0));  // get value of left subrvalueession
        Value right = visit(ctx.rvalue(1)); // get value of right subrvalueession  
		return new Value(left.asInteger() - right.asInteger());   
		}

	@Override 
	public Value visitMul(PracticaParser.MulContext ctx) {
		Value left = visit(ctx.rvalue(0));  // get value of left subrvalueession
        Value right = visit(ctx.rvalue(1)); // get value of right subrvalueession  
		return new Value(left.asInteger() * right.asInteger());   
	}
	
		
	@Override
	public Value visitPlus(PracticaParser.PlusContext ctx) {
		Value left = visit(ctx.rvalue(0));  // get value of left subrvalueession
        Value right = visit(ctx.rvalue(1)); // get value of right subrvalueession  
		return new Value(left.asInteger() + right.asInteger());   
		}    
		
	@Override
	public Value visitImpID(PracticaParser.ImpIDContext ctx) {
		String id = ctx.lvalue().getText();
		if ( memory.containsKey(id) )
			System.out.println(id +"="+memory.get(id));         // print the result
        return null;
		}
	
	@Override
	public Value visitImpNum(PracticaParser.ImpNumContext ctx) {
		Value value = visit(ctx.rvalue()); // evaluate the expr child
        System.out.println(value);         // print the result
        return null; 
		}
	
	@Override
	public Value visitImpString(PracticaParser.ImpStringContext ctx) {
		String id = ctx.string().getText();
		System.out.println(id);
		return null;
		}
	
		
	@Override
	public Value visitComp(PracticaParser.CompContext ctx) {		
		String id = ctx.OPCOMP().getText();
		Value left = this.visit(ctx.rvalue(0));
        Value right = this.visit(ctx.rvalue(1));
		
		if (ctx.OPCOMP() != null) {
		  if (id.equals("==") ) {
			//return new Value(this.visit(ctx.rvalue(0)).equals(this.visit(ctx.rvalue(1))));
			return left.isInteger() && right.isInteger()? new Value(Math.abs(left.asInteger() - right.asInteger()) < 1) : new Value(left.equals(right));
			}
			else if (id.equals("!=")) {
				//return new Value(!this.visit(ctx.rvalue(0)).equals(this.visit(ctx.rvalue(1))));
				return left.isInteger() && right.isInteger()?
						new Value(Math.abs(left.asInteger() - right.asInteger()) > 0) :
						new Value(!left.equals(right));
				}
				else if (id.equals(">=")) {
					return new Value(left.asInteger()>= right.asInteger());
					}
					else if (id.equals("<") ){
						return new Value(left.asInteger()< right.asInteger());
						}
						else if (id.equals(">")) {
							return new Value(left.asInteger()> right.asInteger());
							}
							else if (id.equals("<=")) {
								return new Value(left.asInteger() <= right.asInteger());
							}
		}
		throw new RuntimeException("not implemented: comparator operator " + ctx.OPCOMP().getText());
	}
	
	@Override
	public Value visitIfthen(PracticaParser.IfthenContext ctx) {
		    
		//List<PracticaParser.Expression_listContext> conditions = ctx.expression_list();
		boolean evaluatedExpression = false;
		
		//for(PracticaParser.Expression_listContext condition : conditions) {
        Value evaluated = this.visit(ctx.expression());	
		
		

            if(evaluated.asBoolean()) {
                evaluatedExpression = true;
                // evaluate this block whose expr==true
                this.visit(ctx.expression_list());
                //break;
            }
        //}

        if(!evaluatedExpression && ctx.cons_if() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.cons_if());
        }

        return Value.VOID;
	}
	
@Override
	public Value visitBucle_while(PracticaParser.Bucle_whileContext ctx) {
		Value value = this.visit(ctx.expression());
				
        while(value.asBoolean()) {	            
            this.visit(ctx.expression_list());            
            value = this.visit(ctx.expression());			
        }

        return Value.VOID;
	}
	
}
