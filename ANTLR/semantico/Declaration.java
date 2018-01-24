public class Declaration implements ASTNode {
  private String name;
  private ASTNode expression;

  public Declaration (String name){
    super();
    this.name = name;
  }
  public Object execute (Map <String, Object> symbolTable) {
    symbolTable.put(name, new Object());
    return null;
  }
}
