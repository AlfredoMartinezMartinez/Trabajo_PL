import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Division implements ASTNode {
	private ASTNode oper1;
	private ASTNode oper2;

	public Division(ASTNode oper1, ASTNode oper2) {
		super();
		this.oper1 = oper1;
		this.oper2 = oper2;
	}

	@Override
	public Object execute(Map <String, Object> symbolTable) {
		return (int)oper1.execute(symbolTable) / (int)oper2.execute(symbolTable);
	}

}
