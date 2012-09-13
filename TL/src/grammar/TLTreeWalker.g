tree grammar TLTreeWalker;

options {
  tokenVocab=TL;
  ASTLabelType=CommonTree;
}

@header {
  package tl.parser;
  import tl.*;
  import tl.tree.*;
  import java.util.Map;
  import java.util.HashMap;
}

@members {
  public Map<String, Function> functions = null;
  Scope currentScope = null;
  
  public TLTreeWalker(CommonTreeNodeStream nodes, Map<String, Function> fns) {
    this(nodes, null, fns);
  }
  
  public TLTreeWalker(CommonTreeNodeStream nds, Scope sc, Map<String, Function> fns) {
    super(nds);
    currentScope = sc;
    functions = fns;
  }
}

walk returns [TLNode node]
  :  block {node = null;}
  ;

block
  :  ^(BLOCK ^(STATEMENTS statement*) ^(RETURN expression?))
  ;

statement
  :  assignment
  |  functionCall
  |  ifStatement
  |  forStatement
  |  whileStatement
  ;

assignment
  :  ^(ASSIGNMENT Identifier indexes? expression)
  ;

functionCall
  :  ^(FUNC_CALL Identifier exprList?)
  |  ^(FUNC_CALL Println expression?)
  |  ^(FUNC_CALL Print expression)
  |  ^(FUNC_CALL Assert expression)
  |  ^(FUNC_CALL Size expression)
  ;

ifStatement
  :  ^(IF ifStat elseIfStat* elseStat?)
  ;

ifStat
  :  ^(EXP expression block)
  ;

elseIfStat
  :  ^(EXP expression block)
  ;

elseStat
  :  ^(EXP block)
  ;
   
forStatement
  :  ^(For Identifier expression expression block)
  ;

whileStatement
  :  ^(While expression block)
  ;

idList
  :  ^(ID_LIST Identifier+)
  ;

exprList
  :  ^(EXP_LIST expression+)
  ;

expression
  :  ^(TERNARY expression expression expression)
  |  ^(In expression expression)
  |  ^('||' expression expression)
  |  ^('&&' expression expression)
  |  ^('==' expression expression)
  |  ^('!=' expression expression)
  |  ^('>=' expression expression)
  |  ^('<=' expression expression)
  |  ^('>' expression expression)
  |  ^('<' expression expression)
  |  ^('+' expression expression)
  |  ^('-' expression expression)
  |  ^('*' expression expression)
  |  ^('/' expression expression)
  |  ^('%' expression expression)
  |  ^('^' expression expression)
  |  ^(UNARY_MIN expression)
  |  ^(NEGATE expression)
  |  Number
  |  Bool
  |  Null
  |  lookup           
  ;

list
  :  ^(LIST exprList?)
  ;

lookup
  :  ^(LOOKUP functionCall indexes?)
  |  ^(LOOKUP list indexes?)
  |  ^(LOOKUP expression indexes?) 
  |  ^(LOOKUP Identifier indexes?)
  |  ^(LOOKUP String indexes?)
  ;

indexes
  :  ^(INDEXES expression+)
  ;
