import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Reference implements ASTNode {
  private String name;

  public Reference (String name, ASTNode expression){
    super();
    this.name = name;
  }
  public Object execute (Map <String, Object> symbolTable) {
    symbolTable.get(name);
    return null;
  }
}
