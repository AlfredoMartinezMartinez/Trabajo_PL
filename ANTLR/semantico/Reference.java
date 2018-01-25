import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Reference extends ASTNode {
  private String name;

  public Reference (String name){
    super();
    this.name = name;
  }
  public Object execute (Map <String, Object> symbolTable) {
    return symbolTable.get(name);
  }
}
