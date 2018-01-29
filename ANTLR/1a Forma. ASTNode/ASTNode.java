import java.util.Map;

public abstract class ASTNode {
	abstract public Object execute(Map <String, Object> symbolTable);
}
