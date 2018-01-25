import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ruby {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        PracticaLexer lexer = new PracticaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PracticaParser parser = new PracticaParser(tokens);
        ParseTree tree = parser.prog(); // parse

        ASTNode eval = new ASTNode();
        eval.visit(tree);
    }
}