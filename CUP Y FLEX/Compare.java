import java.util.*;

public class Compare extends ASTNode {
    ASTNode node1;
    String token;
    ASTNode node2;
    public Compare(ASTNode n1,String t,ASTNode n2){
        node1=n1;
        token=t;
        node2=n2;
    }

    @Override
    public Object execute (Map <String, Object> symbolTable) {

      switch(token){
        case ">":
          return (int)node1.execute(symbolTable) > (int)node2.execute(symbolTable);
        case ">=":
          return (int)node1.execute(symbolTable) >= (int)node2.execute(symbolTable);
        case "<":
          return (int)node1.execute(symbolTable) < (int)node2.execute(symbolTable);
        case "<=":
          return (int)node1.execute(symbolTable) <= (int)node2.execute(symbolTable);
        case "==":
          return (int)node1.execute(symbolTable) == (int)node2.execute(symbolTable);
        case "!=":
          return (int)node1.execute(symbolTable) != (int)node2.execute(symbolTable);

      }
      return null;
    }
}
