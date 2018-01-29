import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Constante extends ASTNode {
	private Object value;

	public Constante (Object value) {
		super();
		this.value = value;
	}

	public Object execute(Map <String, Object> symbolTable) {
		return (int)value;
	}
}
