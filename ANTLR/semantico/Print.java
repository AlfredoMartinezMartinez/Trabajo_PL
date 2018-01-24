package.semantico

public class Print implements ASTNode {
	private ASTNode text;

	public Print(ASTNode text) {
		this.text = text;
	}

	public Object execute() {
		System.out.println(text);
		return null;
	}
}
