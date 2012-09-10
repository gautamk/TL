lexer grammar CSVLexer;

Comma 
  :  ','
  ;

LineBreak
  :  '\r'? '\n'
  |  '\r'
  ;

SimpleValue
  :  ~(',' | '\r' | '\n' | '"')+
  ;

QuotedValue
  :  '"' ('""' | ~'"')* '"'
  ;
