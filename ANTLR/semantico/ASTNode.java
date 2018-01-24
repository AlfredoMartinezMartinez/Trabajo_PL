import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public interface ASTNode {
	public Object execute(Map <String, Object> symbolTable);
}
