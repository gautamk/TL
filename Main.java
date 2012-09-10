import org.antlr.runtime.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // the input source
    String source = 
        "value1,value2,\"value3.1,\"\",value3.2\"" + "\n" + 
        "\"line\nbreak\",Bbb,end";
    source = "a,\"b,c";  
    // create an instance of the lexer
    CSVLexer lexer = new CSVLexer(new ANTLRStringStream(source));
        
    // wrap a token-stream around the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    tokens.fill();
    // create the parser
    CSVParser parser = new CSVParser(tokens);
    
    // invoke the entry point of our grammar
    parser.file();
  }
}
