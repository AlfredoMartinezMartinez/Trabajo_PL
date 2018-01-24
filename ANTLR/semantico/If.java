

public class If implements ASTNode {
	private ASTNode conditional;
	private List<ASTNode> ifbody;
	private List<ASTNode> elsebody;

	public If(ASTNode conditional, List<ASTNode> ifbody, List<ASTNode> elsebody) {
		super();
		this.conditional = conditional;
		this.ifbody = ifbody;
		this.elsebody = elsebody;
	}

	public Object execute(Map <String, Object> symbolTable) {
		if ((boolean)conditional.execute(symbolTable)) {
			for(ASTNode n : ifbody) {
				n.execute(symbolTable);
			}
		} else {
			for(ASTNode n : elsebody) {
				n.execute(symbolTable);
			}
		}
		return null;
	}
}
