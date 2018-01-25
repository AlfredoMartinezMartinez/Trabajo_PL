import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Print extends ASTNode {
	private ASTNode text;

	public Print(ASTNode text) {
		this.text = text;
	}

	public Object execute(Map <String, Object> symbolTable) {
		System.out.println(text);
		return null;
	}
}
