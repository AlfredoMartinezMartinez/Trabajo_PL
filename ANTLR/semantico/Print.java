

public class Print implements ASTNode {
	private ASTNode text;

	public Print(ASTNode text) {
		this.text = text;
	}

	public Object execute(Map <String, Object> symbolTable) {
		System.out.println(text);
		return null;
	}
}
