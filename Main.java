import org.antlr.runtime.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // the input source
    String source = 
        "value1,value2,\"value3.1,\"\",value3.2\"" + "\n" + 
        "\"line\nbreak\",Bbb,end";
    //source= "val1,val2,val4";
    // create an instance of the lexer
    CSVLexer lexer = new CSVLexer(new ANTLRStringStream(source));
        
    // wrap a token-stream around the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    
    // when using ANTLR v3.3 or v3.4, un-comment the next line:
    tokens.fill();

    // traverse the tokens and print them to see if the correct tokens are created
    int n = 1;
    
    for(Object o : tokens.getTokens()) {
      CommonToken token = (CommonToken)o;
      System.out.println("token(" + n + ") = " + token.getText().replace("\n", "\\n"));
      n++;
    }
  }
}