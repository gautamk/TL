package tl;
import org.antlr.runtime.*;  
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import tl.parser.*;

public class Main {  
  public static void main(String[] args) throws Exception {  
    // create an instance of the lexer  
    TLLexer lexer = new TLLexer(new ANTLRFileStream(args[0]));
          
    // wrap a token-stream around the lexer  
    CommonTokenStream tokens = new CommonTokenStream(lexer);  
          
    // create the parser  
    TLParser parser = new TLParser(tokens);

    // invoke the entry point of our parser 
    // and generate a DOT image of the tree
    CommonTree tree = (CommonTree) parser.parse().getTree();
    DOTTreeGenerator gen = new DOTTreeGenerator();
    StringTemplate st = gen.toDOT(tree);
    System.out.println(st);
  }  
}  
