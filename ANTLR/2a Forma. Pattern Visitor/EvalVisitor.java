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
		String id = ctx.lvalue().getText();  // toma texto de lvalue que contiene un identificador
        Value value = this.visit(ctx.rvalue());   // evalua la expresion de rvalue
		return memory.put(id, value);          // almacena en memoria
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
		Value left = visit(ctx.rvalue(0));  // toma valor de la subexpresion izquierda
        Value right = visit(ctx.rvalue(1)); // toma valor de la subexpresion derecha  
		return new Value(left.asInteger() / right.asInteger());       
		}
	
	@Override
	public Value visitMinus(PracticaParser.MinusContext ctx) { 	
		Value left = visit(ctx.rvalue(0));  // toma valor de la subexpresion izquierda
        Value right = visit(ctx.rvalue(1)); // toma valor de la subexpresion derecha
		return new Value(left.asInteger() - right.asInteger());   
		}

	@Override 
	public Value visitMul(PracticaParser.MulContext ctx) {
		Value left = visit(ctx.rvalue(0));  // toma valor de la subexpresion izquierda
        Value right = visit(ctx.rvalue(1)); // toma valor de la subexpresion derecha
		return new Value(left.asInteger() * right.asInteger());   
	}
	
		
	@Override
	public Value visitPlus(PracticaParser.PlusContext ctx) {
		Value left = visit(ctx.rvalue(0));  // toma valor de la subexpresion izquierda
        Value right = visit(ctx.rvalue(1)); // toma valor de la subexpresion derecha
		return new Value(left.asInteger() + right.asInteger());   
		}    
		
	@Override
	public Value visitImpID(PracticaParser.ImpIDContext ctx) {
		String id = ctx.lvalue().getText();
		if ( memory.containsKey(id) )
			System.out.println(id +"="+memory.get(id)); // imprime identificador y  resultado 
        return null;
		}
	
	@Override
	public Value visitImpNum(PracticaParser.ImpNumContext ctx) {
		Value value = visit(ctx.rvalue()); // evalua rvalue
        System.out.println(value);         // imprime el resultado
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
			return left.isInteger() && right.isInteger()? new Value(Math.abs(left.asInteger() - right.asInteger()) < 1) : new Value(left.equals(right));
			}
			else if (id.equals("!=")) {				
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
		    
		boolean evaluatedExpression = false;
		
		
        Value evaluated = this.visit(ctx.expression());			

            if(evaluated.asBoolean()) {
                evaluatedExpression = true;                
                this.visit(ctx.expression_list());
                //break;
            }        

        if(!evaluatedExpression && ctx.cons_if() != null) {
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
