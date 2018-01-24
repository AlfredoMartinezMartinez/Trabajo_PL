public class Reference implements ASTNode {
  private String name;

  public Reference (String name, ASTNode expression){
    super();
    this.name = name;
  }
  public Object execute (Map <String, Object> symbolTable) {
    symbolTable.get(name);
  }
}
