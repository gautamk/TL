package tl;

import tl.parser.*;
import tl.tree.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // create an instance of the lexer
    TLLexer lexer = new TLLexer(new ANTLRFileStream("test.tl"));
        
    // wrap a token-stream around the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer);
        
    // create the parser
    TLParser parser = new TLParser(tokens);
    
    // walk the tree
    CommonTree tree = (CommonTree)parser.parse().getTree();
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
    
    // pass the reference to the Map of functions to the tree walker
    TLTreeWalker walker = new TLTreeWalker(nodes, parser.functions);
    
    // get the returned node 
    TLNode returned = walker.walk();
    System.out.println(returned == null ? "null" : returned.evaluate());
  }
}