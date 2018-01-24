

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

	public Object execute() {
		if ((boolean)conditional.execute()) {
			for(ASTNode n : ifbody) {
				n.execute();
			}
		} else {
			for(ASTNode n : elsebody) {
				n.execute();
			}
		}
		return null;
	}
}
