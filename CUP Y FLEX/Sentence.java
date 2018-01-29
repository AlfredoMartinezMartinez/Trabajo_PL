import java.util.*;

public class Sentence extends ASTNode {
    ASTNode node;
    public Sentence(ASTNode n){
        node=n;
    }

    @Override
    public Object execute (Map <String, Object> symbolTable) {
        node.execute(symbolTable);
        return null;
    }
}
