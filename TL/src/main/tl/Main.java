package tl;
import org.antlr.runtime.*;  
import tl.parser.*;  
public class Main {  
  public static void main(String[] args) throws Exception {  
    // create an instance of the lexer  
    TLLexer lexer = new TLLexer(new ANTLRFileStream(args[0]));  
          
    // wrap a token-stream around the lexer  
    CommonTokenStream tokens = new CommonTokenStream(lexer);  
          
    // create the parser  
    TLParser parser = new TLParser(tokens);  
     
    // invoke the 'parse' rule
    parser.parse();
  }  
}  
