import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class If extends ASTNode {
	private ASTNode conditional;
	private ASTNode ifbody;
	private ASTNode elsebody;

	public If(ASTNode conditional, ASTNode ifbody, ASTNode elsebody) {
		super();
		this.conditional = conditional;
		this.ifbody = ifbody;
		this.elsebody = elsebody;
	}

	public Object execute(Map <String, Object> symbolTable) {
		if ((boolean)conditional.execute(symbolTable)) {
			ifbody.execute(symbolTable);
		} else {
			elsebody.execute(symbolTable);
		}
		return null;
	}
}
