public class Constante implements ASTNode {
	int value;

	public Constante (int value) {
		super();
		this.value = value;
	}

	@Override
	public Object execute() {
		return value;
	}
