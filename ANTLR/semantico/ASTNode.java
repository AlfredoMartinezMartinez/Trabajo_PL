import java.util.Map;

public abstract class ASTNode extends PracticaBaseVisitor<T>{
	abstract public Object execute(Map <String, Object> symbolTable);
}
