import java.util.*;

public class Logic_comp extends ASTNode {
    ASTNode node1;
    String token;
    ASTNode node2;
    public Logic_comp(ASTNode n1,String t,ASTNode n2){
        node1=n1;
        token=t;
        node2=n2;
    }

    @Override
    public Object execute (Map <String, Object> symbolTable) {

      switch(token){
        case "and":
        case "&&":
          return (boolean)node1.execute(symbolTable) && (boolean)node2.execute(symbolTable);
        case "or":
        case "||":
          return (boolean)node1.execute(symbolTable) || (boolean)node2.execute(symbolTable);
      }
      return null;
    }
}
