import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Assignment implements ASTNode {
  private String name;
  private ASTNode expression;

  public Assignment (String name, ASTNode expression){
    super();
    this.name = name;
    this.expression = expression;
  }
  public Object execute (Map <String, Object> symbolTable) {
    symbolTable.put(name, expression.execute(symbolTable));
    return null;
  }
}
