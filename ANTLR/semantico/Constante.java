import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Constante implements ASTNode {
	private Object value;

	public Constante (Object value) {
		super();
		this.value = value;
	}

	@Override
	public Object execute(Map <String, Object> symbolTable) {
		return value;
	}
}
