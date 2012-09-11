import org.antlr.runtime.*;
import java.util.List;

public class Main {
  public static void main(String[] args) throws Exception {
    // the input source
    String source = 
        "aaa,bbb,ccc" + "\n" + 
        "\"d,\"\"d\",eee,fff";
    
    // create an instance of the lexer
    CSVLexer lexer = new CSVLexer(new ANTLRStringStream(source));
        
    // wrap a token-stream around the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer);
        
    // create the parser
    CSVParser parser = new CSVParser(tokens);
    
    // invoke the entry point of our grammar
    List<List<String>> data = parser.file();
    
    // display the contents of the CSV source
    for(int r = 0; r < data.size(); r++) {
      List<String> row = data.get(r);
      for(int c = 0; c < row.size(); c++) {
        System.out.println("(row=" + (r+1) + ",col=" + (c+1) + ") = " + row.get(c));
      }
    }
  }
}
