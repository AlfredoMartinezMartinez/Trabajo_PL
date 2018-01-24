

public class Addition implements ASTNode {

	private ASTNode oper1;
	private ASTNode oper2;

	public Addition(ASTNode oper1, ASTNode oper2) {
		super();
		this.oper1 = oper1;
		this.oper2 = oper2;
	}

	@Override
	public Object execute() {
		return (int)oper1.execute() - (int)oper2.execute();
	}

}
