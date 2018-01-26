import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Cadena extends ASTNode {
	private Object value;

	public Cadena (Object value) {
		super();
		this.value = value;
	}

	public Object execute(Map <String, Object> symbolTable) {
		return (String)value;
	}
}
