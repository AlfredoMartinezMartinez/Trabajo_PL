import java.util.*;

public class SentenceList extends ASTNode {
    ArrayList<Sentence> list;

    public SentenceList(ASTNode r){
        list=new ArrayList<Sentence>();
        list.add((Sentence) r);
    }
    public SentenceList(ASTNode r, ASTNode lista){
        list=new ArrayList<Sentence>();
        list.add((Sentence) r);
        for (Sentence i : ((SentenceList)lista).getlist()) {
            list.add(i);
        }
    }

    public Object execute(Map <String, Object> symbolTable) {
        for(Sentence sent: list){
                sent.execute(symbolTable);
        }
        return null;
    }
    public ArrayList<Sentence> getlist() {
    return list;
}


}
