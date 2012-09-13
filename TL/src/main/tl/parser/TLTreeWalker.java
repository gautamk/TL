// $ANTLR 3.4 src/grammar/TLTreeWalker.g 2012-09-13 19:38:47

  package tl.parser;
  import tl.*;
  import tl.tree.*;
  import java.util.Map;
  import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TLTreeWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT", "Add", "And", "Assert", "Assign", "BLOCK", "Bool", "CBrace", "CBracket", "CParen", "Colon", "Comma", "Comment", "Def", "Digit", "Divide", "Do", "EXP", "EXP_LIST", "Else", "End", "Equals", "Excl", "FUNCTION", "FUNC_CALL", "For", "GT", "GTEquals", "ID_LIST", "IF", "INDEXES", "Identifier", "If", "In", "Int", "LIST", "LOOKUP", "LT", "LTEquals", "Modulus", "Multiply", "NEGATE", "NEquals", "Null", "Number", "OBrace", "OBracket", "OParen", "Or", "Pow", "Print", "Println", "QMark", "RETURN", "Return", "SColon", "STATEMENTS", "Size", "Space", "String", "Subtract", "TERNARY", "To", "UNARY_MIN", "While"
    };

    public static final int EOF=-1;
    public static final int ASSIGNMENT=4;
    public static final int Add=5;
    public static final int And=6;
    public static final int Assert=7;
    public static final int Assign=8;
    public static final int BLOCK=9;
    public static final int Bool=10;
    public static final int CBrace=11;
    public static final int CBracket=12;
    public static final int CParen=13;
    public static final int Colon=14;
    public static final int Comma=15;
    public static final int Comment=16;
    public static final int Def=17;
    public static final int Digit=18;
    public static final int Divide=19;
    public static final int Do=20;
    public static final int EXP=21;
    public static final int EXP_LIST=22;
    public static final int Else=23;
    public static final int End=24;
    public static final int Equals=25;
    public static final int Excl=26;
    public static final int FUNCTION=27;
    public static final int FUNC_CALL=28;
    public static final int For=29;
    public static final int GT=30;
    public static final int GTEquals=31;
    public static final int ID_LIST=32;
    public static final int IF=33;
    public static final int INDEXES=34;
    public static final int Identifier=35;
    public static final int If=36;
    public static final int In=37;
    public static final int Int=38;
    public static final int LIST=39;
    public static final int LOOKUP=40;
    public static final int LT=41;
    public static final int LTEquals=42;
    public static final int Modulus=43;
    public static final int Multiply=44;
    public static final int NEGATE=45;
    public static final int NEquals=46;
    public static final int Null=47;
    public static final int Number=48;
    public static final int OBrace=49;
    public static final int OBracket=50;
    public static final int OParen=51;
    public static final int Or=52;
    public static final int Pow=53;
    public static final int Print=54;
    public static final int Println=55;
    public static final int QMark=56;
    public static final int RETURN=57;
    public static final int Return=58;
    public static final int SColon=59;
    public static final int STATEMENTS=60;
    public static final int Size=61;
    public static final int Space=62;
    public static final int String=63;
    public static final int Subtract=64;
    public static final int TERNARY=65;
    public static final int To=66;
    public static final int UNARY_MIN=67;
    public static final int While=68;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public TLTreeWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public TLTreeWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return TLTreeWalker.tokenNames; }
    public String getGrammarFileName() { return "src/grammar/TLTreeWalker.g"; }


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



    // $ANTLR start "walk"
    // src/grammar/TLTreeWalker.g:31:1: walk returns [TLNode node] : block ;
    public final TLNode walk() throws RecognitionException {
        TLNode node = null;


        try {
            // src/grammar/TLTreeWalker.g:32:3: ( block )
            // src/grammar/TLTreeWalker.g:32:6: block
            {
            pushFollow(FOLLOW_block_in_walk50);
            block();

            state._fsp--;


            node = null;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return node;
    }
    // $ANTLR end "walk"



    // $ANTLR start "block"
    // src/grammar/TLTreeWalker.g:35:1: block : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
    public final void block() throws RecognitionException {
        try {
            // src/grammar/TLTreeWalker.g:36:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
            // src/grammar/TLTreeWalker.g:36:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_block67); 

            match(input, Token.DOWN, null); 
            match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block70); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // src/grammar/TLTreeWalker.g:36:27: ( statement )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==ASSIGNMENT||(LA1_0 >= FUNC_CALL && LA1_0 <= For)||LA1_0==IF||LA1_0==While) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // src/grammar/TLTreeWalker.g:36:27: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_block72);
                	    statement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input,RETURN,FOLLOW_RETURN_in_block77); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // src/grammar/TLTreeWalker.g:36:48: ( expression )?
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= Add && LA2_0 <= And)||LA2_0==Bool||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==In||(LA2_0 >= LOOKUP && LA2_0 <= Number)||(LA2_0 >= Or && LA2_0 <= Pow)||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||LA2_0==UNARY_MIN) ) {
                    alt2=1;
                }
                switch (alt2) {
                    case 1 :
                        // src/grammar/TLTreeWalker.g:36:48: expression
                        {
                        pushFollow(FOLLOW_expression_in_block79);
                        expression();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "block"



    // $ANTLR start "statement"
    // src/grammar/TLTreeWalker.g:39:1: statement : ( assignment | functionCall | ifStatement | forStatement | whileStatement );
    public final void statement() throws RecognitionException {
        try {
            // src/grammar/TLTreeWalker.g:40:3: ( assignment | functionCall | ifStatement | forStatement | whileStatement )
            int alt3=5;
            switch ( input.LA(1) ) {
            case ASSIGNMENT:
                {
                alt3=1;
                }
                break;
            case FUNC_CALL:
                {
                alt3=2;
                }
                break;
            case IF:
                {
                alt3=3;
                }
                break;
            case For:
                {
                alt3=4;
                }
                break;
            case While:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // src/grammar/TLTreeWalker.g:40:6: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement96);
                    assignment();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // src/grammar/TLTreeWalker.g:41:6: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_statement103);
                    functionCall();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // src/grammar/TLTreeWalker.g:42:6: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement110);
                    ifStatement();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // src/grammar/TLTreeWalker.g:43:6: forStatement
                    {
                    pushFollow(FOLLOW_forStatement_in_statement117);
                    forStatement();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // src/grammar/TLTreeWalker.g:44:6: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement124);
                    whileStatement();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "assignment"
    // src/grammar/TLTreeWalker.g:47:1: assignment : ^( ASSIGNMENT Identifier ( indexes )? expression ) ;
    public final void assignment() throws RecognitionException {
        try {
            // src/grammar/TLTreeWalker.g:48:3: ( ^( ASSIGNMENT Identifier ( indexes )? expression ) )
            // src/grammar/TLTreeWalker.g:48:6: ^( ASSIGNMENT Identifier ( indexes )? expression )
            {
            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment139); 

            match(input, Token.DOWN, null); 
            match(input,Identifier,FOLLOW_Identifier_in_assignment141); 

            // src/grammar/TLTreeWalker.g:48:30: ( indexes )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==INDEXES) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // src/grammar/TLTreeWalker.g:48:30: indexes
                    {
                    pushFollow(FOLLOW_indexes_in_assignment143);
                    indexes();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_assignment146);
            expression();

            state._fsp--;


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "functionCall"
    // src/grammar/TLTreeWalker.g:51:1: functionCall : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) );
    public final void functionCall() throws RecognitionException {
        try {
            // src/grammar/TLTreeWalker.g:52:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) )
            int alt7=5;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==FUNC_CALL) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case Identifier:
                        {
                        alt7=1;
                        }
                        break;
                    case Println:
                        {
                        alt7=2;
                        }
                        break;
                    case Print:
                        {
                        alt7=3;
                        }
                        break;
                    case Assert:
                        {
                        alt7=4;
                        }
                        break;
                    case Size:
                        {
                        alt7=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // src/grammar/TLTreeWalker.g:52:6: ^( FUNC_CALL Identifier ( exprList )? )
                    {
                    match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall162); 

                    match(input, Token.DOWN, null); 
                    match(input,Identifier,FOLLOW_Identifier_in_functionCall164); 

                    // src/grammar/TLTreeWalker.g:52:29: ( exprList )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==EXP_LIST) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // src/grammar/TLTreeWalker.g:52:29: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_functionCall166);
                            exprList();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    // src/grammar/TLTreeWalker.g:53:6: ^( FUNC_CALL Println ( expression )? )
                    {
                    match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall176); 

                    match(input, Token.DOWN, null); 
                    match(input,Println,FOLLOW_Println_in_functionCall178); 

                    // src/grammar/TLTreeWalker.g:53:26: ( expression )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0 >= Add && LA6_0 <= And)||LA6_0==Bool||LA6_0==Divide||LA6_0==Equals||(LA6_0 >= GT && LA6_0 <= GTEquals)||LA6_0==In||(LA6_0 >= LOOKUP && LA6_0 <= Number)||(LA6_0 >= Or && LA6_0 <= Pow)||(LA6_0 >= Subtract && LA6_0 <= TERNARY)||LA6_0==UNARY_MIN) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // src/grammar/TLTreeWalker.g:53:26: expression
                            {
                            pushFollow(FOLLOW_expression_in_functionCall180);
                            expression();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    // src/grammar/TLTreeWalker.g:54:6: ^( FUNC_CALL Print expression )
                    {
                    match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall190); 

                    match(input, Token.DOWN, null); 
                    match(input,Print,FOLLOW_Print_in_functionCall192); 

                    pushFollow(FOLLOW_expression_in_functionCall194);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 4 :
                    // src/grammar/TLTreeWalker.g:55:6: ^( FUNC_CALL Assert expression )
                    {
                    match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall203); 

                    match(input, Token.DOWN, null); 
                    match(input,Assert,FOLLOW_Assert_in_functionCall205); 

                    pushFollow(FOLLOW_expression_in_functionCall207);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 5 :
                    // src/grammar/TLTreeWalker.g:56:6: ^( FUNC_CALL Size expression )
                    {
                    match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall216); 

                    match(input, Token.DOWN, null); 
                    match(input,Size,FOLLOW_Size_in_functionCall218); 

                    pushFollow(FOLLOW_expression_in_functionCall220);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "functionCall"



    // $ANTLR start "ifStatement"
    // src/grammar/TLTreeWalker.g:59:1: ifStatement : ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
    public final void ifStatement() throws RecognitionException {
        try {
            // src/grammar/TLTreeWalker.g:60:3: ( ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
            // src/grammar/TLTreeWalker.g:60:6: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
            {
            match(input,IF,FOLLOW_IF_in_ifStatement236); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_ifStat_in_ifStatement238);
            ifStat();

            state._fsp--;


            // src/grammar/TLTreeWalker.g:60:18: ( elseIfStat )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==EXP) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==DOWN) ) {
                        int LA8_3 = input.LA(3);

                        if ( ((LA8_3 >= Add && LA8_3 <= And)||LA8_3==Bool||LA8_3==Divide||LA8_3==Equals||(LA8_3 >= GT && LA8_3 <= GTEquals)||LA8_3==In||(LA8_3 >= LOOKUP && LA8_3 <= Number)||(LA8_3 >= Or && LA8_3 <= Pow)||(LA8_3 >= Subtract && LA8_3 <= TERNARY)||LA8_3==UNARY_MIN) ) {
                            alt8=1;
                        }


                    }


                }


                switch (alt8) {
            	case 1 :
            	    // src/grammar/TLTreeWalker.g:60:18: elseIfStat
            	    {
            	    pushFollow(FOLLOW_elseIfStat_in_ifStatement240);
            	    elseIfStat();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // src/grammar/TLTreeWalker.g:60:30: ( elseStat )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==EXP) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // src/grammar/TLTreeWalker.g:60:30: elseStat
                    {
                    pushFollow(FOLLOW_elseStat_in_ifStatement243);
                    elseStat();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ifStatement"



    // $ANTLR start "ifStat"
    // src/grammar/TLTreeWalker.g:63:1: ifStat : ^( EXP expression block ) ;
    public final void ifStat() throws RecognitionException {
        try {
            // src/grammar/TLTreeWalker.g:64:3: ( ^( EXP expression block ) )
            // src/grammar/TLTreeWalker.g:64:6: ^( EXP expression block )
            {
            match(input,EXP,FOLLOW_EXP_in_ifStat260); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_ifStat262);
            expression();

            state._fsp--;


            pushFollow(FOLLOW_block_in_ifStat264);
            block();

            state._fsp--;


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ifStat"



    // $ANTLR start "elseIfStat"
    // src/grammar/TLTreeWalker.g:67:1: elseIfStat : ^( EXP expression block ) ;
    public final void elseIfStat() throws RecognitionException {
        try {
            // src/grammar/TLTreeWalker.g:68:3: ( ^( EXP expression block ) )
            // src/grammar/TLTreeWalker.g:68:6: ^( EXP expression block )
            {
            match(input,EXP,FOLLOW_EXP_in_elseIfStat280); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_elseIfStat282);
            expression();

            state._fsp--;


            pushFollow(FOLLOW_block_in_elseIfStat284);
            block();

            state._fsp--;


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "elseIfStat"



    // $ANTLR start "elseStat"
    // src/grammar/TLTreeWalker.g:71:1: elseStat : ^( EXP block ) ;
    public final void elseStat() throws RecognitionException {
        try {
            // src/grammar/TLTreeWalker.g:72:3: ( ^( EXP block ) )
            // src/grammar/TLTreeWalker.g:72:6: ^( EXP block )
            {
            match(input,EXP,FOLLOW_EXP_in_elseStat300); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_block_in_elseStat302);
            block();

            state._fsp--;


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "elseStat"



    // $ANTLR start "forStatement"
    // src/grammar/TLTreeWalker.g:75:1: forStatement : ^( For Identifier expression expression block ) ;
    public final void forStatement() throws RecognitionException {
        try {
            // src/grammar/TLTreeWalker.g:76:3: ( ^( For Identifier expression expression block ) )
            // src/grammar/TLTreeWalker.g:76:6: ^( For Identifier expression expression block )
            {
            match(input,For,FOLLOW_For_in_forStatement321); 

            match(input, Token.DOWN, null); 
            match(input,Identifier,FOLLOW_Identifier_in_forStatement323); 

            pushFollow(FOLLOW_expression_in_forStatement325);
            expression();

            state._fsp--;


            pushFollow(FOLLOW_expression_in_forStatement327);
            expression();

            state._fsp--;


            pushFollow(FOLLOW_block_in_forStatement329);
            block();

            state._fsp--;


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "forStatement"



    // $ANTLR start "whileStatement"
    // src/grammar/TLTreeWalker.g:79:1: whileStatement : ^( While expression block ) ;
    public final void whileStatement() throws RecognitionException {
        try {
            // src/grammar/TLTreeWalker.g:80:3: ( ^( While expression block ) )
            // src/grammar/TLTreeWalker.g:80:6: ^( While expression block )
            {
            match(input,While,FOLLOW_While_in_whileStatement345); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_whileStatement347);
            expression();

            state._fsp--;


            pushFollow(FOLLOW_block_in_whileStatement349);
            block();

            state._fsp--;


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "whileStatement"



    // $ANTLR start "idList"
    // src/grammar/TLTreeWalker.g:83:1: idList : ^( ID_LIST ( Identifier )+ ) ;
    public final void idList() throws RecognitionException {
        try {
            // src/grammar/TLTreeWalker.g:84:3: ( ^( ID_LIST ( Identifier )+ ) )
            // src/grammar/TLTreeWalker.g:84:6: ^( ID_LIST ( Identifier )+ )
            {
            match(input,ID_LIST,FOLLOW_ID_LIST_in_idList365); 

            match(input, Token.DOWN, null); 
            // src/grammar/TLTreeWalker.g:84:16: ( Identifier )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Identifier) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/grammar/TLTreeWalker.g:84:16: Identifier
            	    {
            	    match(input,Identifier,FOLLOW_Identifier_in_idList367); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "idList"



    // $ANTLR start "exprList"
    // src/grammar/TLTreeWalker.g:87:1: exprList : ^( EXP_LIST ( expression )+ ) ;
    public final void exprList() throws RecognitionException {
        try {
            // src/grammar/TLTreeWalker.g:88:3: ( ^( EXP_LIST ( expression )+ ) )
            // src/grammar/TLTreeWalker.g:88:6: ^( EXP_LIST ( expression )+ )
            {
            match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList384); 

            match(input, Token.DOWN, null); 
            // src/grammar/TLTreeWalker.g:88:17: ( expression )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= Add && LA11_0 <= And)||LA11_0==Bool||LA11_0==Divide||LA11_0==Equals||(LA11_0 >= GT && LA11_0 <= GTEquals)||LA11_0==In||(LA11_0 >= LOOKUP && LA11_0 <= Number)||(LA11_0 >= Or && LA11_0 <= Pow)||(LA11_0 >= Subtract && LA11_0 <= TERNARY)||LA11_0==UNARY_MIN) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/grammar/TLTreeWalker.g:88:17: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_exprList386);
            	    expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "exprList"



    // $ANTLR start "expression"
    // src/grammar/TLTreeWalker.g:91:1: expression : ( ^( TERNARY expression expression expression ) | ^( In expression expression ) | ^( '||' expression expression ) | ^( '&&' expression expression ) | ^( '==' expression expression ) | ^( '!=' expression expression ) | ^( '>=' expression expression ) | ^( '<=' expression expression ) | ^( '>' expression expression ) | ^( '<' expression expression ) | ^( '+' expression expression ) | ^( '-' expression expression ) | ^( '*' expression expression ) | ^( '/' expression expression ) | ^( '%' expression expression ) | ^( '^' expression expression ) | ^( UNARY_MIN expression ) | ^( NEGATE expression ) | Number | Bool | Null | lookup );
    public final void expression() throws RecognitionException {
        try {
            // src/grammar/TLTreeWalker.g:92:3: ( ^( TERNARY expression expression expression ) | ^( In expression expression ) | ^( '||' expression expression ) | ^( '&&' expression expression ) | ^( '==' expression expression ) | ^( '!=' expression expression ) | ^( '>=' expression expression ) | ^( '<=' expression expression ) | ^( '>' expression expression ) | ^( '<' expression expression ) | ^( '+' expression expression ) | ^( '-' expression expression ) | ^( '*' expression expression ) | ^( '/' expression expression ) | ^( '%' expression expression ) | ^( '^' expression expression ) | ^( UNARY_MIN expression ) | ^( NEGATE expression ) | Number | Bool | Null | lookup )
            int alt12=22;
            switch ( input.LA(1) ) {
            case TERNARY:
                {
                alt12=1;
                }
                break;
            case In:
                {
                alt12=2;
                }
                break;
            case Or:
                {
                alt12=3;
                }
                break;
            case And:
                {
                alt12=4;
                }
                break;
            case Equals:
                {
                alt12=5;
                }
                break;
            case NEquals:
                {
                alt12=6;
                }
                break;
            case GTEquals:
                {
                alt12=7;
                }
                break;
            case LTEquals:
                {
                alt12=8;
                }
                break;
            case GT:
                {
                alt12=9;
                }
                break;
            case LT:
                {
                alt12=10;
                }
                break;
            case Add:
                {
                alt12=11;
                }
                break;
            case Subtract:
                {
                alt12=12;
                }
                break;
            case Multiply:
                {
                alt12=13;
                }
                break;
            case Divide:
                {
                alt12=14;
                }
                break;
            case Modulus:
                {
                alt12=15;
                }
                break;
            case Pow:
                {
                alt12=16;
                }
                break;
            case UNARY_MIN:
                {
                alt12=17;
                }
                break;
            case NEGATE:
                {
                alt12=18;
                }
                break;
            case Number:
                {
                alt12=19;
                }
                break;
            case Bool:
                {
                alt12=20;
                }
                break;
            case Null:
                {
                alt12=21;
                }
                break;
            case LOOKUP:
                {
                alt12=22;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // src/grammar/TLTreeWalker.g:92:6: ^( TERNARY expression expression expression )
                    {
                    match(input,TERNARY,FOLLOW_TERNARY_in_expression403); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression405);
                    expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression407);
                    expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression409);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    // src/grammar/TLTreeWalker.g:93:6: ^( In expression expression )
                    {
                    match(input,In,FOLLOW_In_in_expression418); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression420);
                    expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression422);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    // src/grammar/TLTreeWalker.g:94:6: ^( '||' expression expression )
                    {
                    match(input,Or,FOLLOW_Or_in_expression431); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression433);
                    expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression435);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 4 :
                    // src/grammar/TLTreeWalker.g:95:6: ^( '&&' expression expression )
                    {
                    match(input,And,FOLLOW_And_in_expression444); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression446);
                    expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression448);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 5 :
                    // src/grammar/TLTreeWalker.g:96:6: ^( '==' expression expression )
                    {
                    match(input,Equals,FOLLOW_Equals_in_expression457); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression459);
                    expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression461);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 6 :
                    // src/grammar/TLTreeWalker.g:97:6: ^( '!=' expression expression )
                    {
                    match(input,NEquals,FOLLOW_NEquals_in_expression470); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression472);
                    expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression474);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 7 :
                    // src/grammar/TLTreeWalker.g:98:6: ^( '>=' expression expression )
                    {
                    match(input,GTEquals,FOLLOW_GTEquals_in_expression483); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression485);
                    expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression487);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 8 :
                    // src/grammar/TLTreeWalker.g:99:6: ^( '<=' expression expression )
                    {
                    match(input,LTEquals,FOLLOW_LTEquals_in_expression496); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression498);
                    expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression500);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 9 :
                    // src/grammar/TLTreeWalker.g:100:6: ^( '>' expression expression )
                    {
                    match(input,GT,FOLLOW_GT_in_expression509); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression511);
                    expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression513);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 10 :
                    // src/grammar/TLTreeWalker.g:101:6: ^( '<' expression expression )
                    {
                    match(input,LT,FOLLOW_LT_in_expression522); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression524);
                    expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression526);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 11 :
                    // src/grammar/TLTreeWalker.g:102:6: ^( '+' expression expression )
                    {
                    match(input,Add,FOLLOW_Add_in_expression535); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression537);
                    expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression539);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 12 :
                    // src/grammar/TLTreeWalker.g:103:6: ^( '-' expression expression )
                    {
                    match(input,Subtract,FOLLOW_Subtract_in_expression548); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression550);
                    expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression552);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 13 :
                    // src/grammar/TLTreeWalker.g:104:6: ^( '*' expression expression )
                    {
                    match(input,Multiply,FOLLOW_Multiply_in_expression561); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression563);
                    expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression565);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 14 :
                    // src/grammar/TLTreeWalker.g:105:6: ^( '/' expression expression )
                    {
                    match(input,Divide,FOLLOW_Divide_in_expression574); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression576);
                    expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression578);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 15 :
                    // src/grammar/TLTreeWalker.g:106:6: ^( '%' expression expression )
                    {
                    match(input,Modulus,FOLLOW_Modulus_in_expression587); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression589);
                    expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression591);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 16 :
                    // src/grammar/TLTreeWalker.g:107:6: ^( '^' expression expression )
                    {
                    match(input,Pow,FOLLOW_Pow_in_expression600); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression602);
                    expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression604);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 17 :
                    // src/grammar/TLTreeWalker.g:108:6: ^( UNARY_MIN expression )
                    {
                    match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression613); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression615);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 18 :
                    // src/grammar/TLTreeWalker.g:109:6: ^( NEGATE expression )
                    {
                    match(input,NEGATE,FOLLOW_NEGATE_in_expression624); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression626);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 19 :
                    // src/grammar/TLTreeWalker.g:110:6: Number
                    {
                    match(input,Number,FOLLOW_Number_in_expression634); 

                    }
                    break;
                case 20 :
                    // src/grammar/TLTreeWalker.g:111:6: Bool
                    {
                    match(input,Bool,FOLLOW_Bool_in_expression641); 

                    }
                    break;
                case 21 :
                    // src/grammar/TLTreeWalker.g:112:6: Null
                    {
                    match(input,Null,FOLLOW_Null_in_expression648); 

                    }
                    break;
                case 22 :
                    // src/grammar/TLTreeWalker.g:113:6: lookup
                    {
                    pushFollow(FOLLOW_lookup_in_expression655);
                    lookup();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "list"
    // src/grammar/TLTreeWalker.g:116:1: list : ^( LIST ( exprList )? ) ;
    public final void list() throws RecognitionException {
        try {
            // src/grammar/TLTreeWalker.g:117:3: ( ^( LIST ( exprList )? ) )
            // src/grammar/TLTreeWalker.g:117:6: ^( LIST ( exprList )? )
            {
            match(input,LIST,FOLLOW_LIST_in_list681); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // src/grammar/TLTreeWalker.g:117:13: ( exprList )?
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==EXP_LIST) ) {
                    alt13=1;
                }
                switch (alt13) {
                    case 1 :
                        // src/grammar/TLTreeWalker.g:117:13: exprList
                        {
                        pushFollow(FOLLOW_exprList_in_list683);
                        exprList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "list"



    // $ANTLR start "lookup"
    // src/grammar/TLTreeWalker.g:120:1: lookup : ( ^( LOOKUP functionCall ( indexes )? ) | ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP Identifier ( indexes )? ) | ^( LOOKUP String ( indexes )? ) );
    public final void lookup() throws RecognitionException {
        try {
            // src/grammar/TLTreeWalker.g:121:3: ( ^( LOOKUP functionCall ( indexes )? ) | ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP Identifier ( indexes )? ) | ^( LOOKUP String ( indexes )? ) )
            int alt19=5;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LOOKUP) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case Identifier:
                        {
                        alt19=4;
                        }
                        break;
                    case String:
                        {
                        alt19=5;
                        }
                        break;
                    case FUNC_CALL:
                        {
                        alt19=1;
                        }
                        break;
                    case LIST:
                        {
                        alt19=2;
                        }
                        break;
                    case Add:
                    case And:
                    case Bool:
                    case Divide:
                    case Equals:
                    case GT:
                    case GTEquals:
                    case In:
                    case LOOKUP:
                    case LT:
                    case LTEquals:
                    case Modulus:
                    case Multiply:
                    case NEGATE:
                    case NEquals:
                    case Null:
                    case Number:
                    case Or:
                    case Pow:
                    case Subtract:
                    case TERNARY:
                    case UNARY_MIN:
                        {
                        alt19=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 2, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // src/grammar/TLTreeWalker.g:121:6: ^( LOOKUP functionCall ( indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup700); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_functionCall_in_lookup702);
                    functionCall();

                    state._fsp--;


                    // src/grammar/TLTreeWalker.g:121:28: ( indexes )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==INDEXES) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // src/grammar/TLTreeWalker.g:121:28: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup704);
                            indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    // src/grammar/TLTreeWalker.g:122:6: ^( LOOKUP list ( indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup714); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_list_in_lookup716);
                    list();

                    state._fsp--;


                    // src/grammar/TLTreeWalker.g:122:20: ( indexes )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==INDEXES) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // src/grammar/TLTreeWalker.g:122:20: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup718);
                            indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    // src/grammar/TLTreeWalker.g:123:6: ^( LOOKUP expression ( indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup728); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_lookup730);
                    expression();

                    state._fsp--;


                    // src/grammar/TLTreeWalker.g:123:26: ( indexes )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==INDEXES) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // src/grammar/TLTreeWalker.g:123:26: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup732);
                            indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    }
                    break;
                case 4 :
                    // src/grammar/TLTreeWalker.g:124:6: ^( LOOKUP Identifier ( indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup743); 

                    match(input, Token.DOWN, null); 
                    match(input,Identifier,FOLLOW_Identifier_in_lookup745); 

                    // src/grammar/TLTreeWalker.g:124:26: ( indexes )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==INDEXES) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // src/grammar/TLTreeWalker.g:124:26: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup747);
                            indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    }
                    break;
                case 5 :
                    // src/grammar/TLTreeWalker.g:125:6: ^( LOOKUP String ( indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup757); 

                    match(input, Token.DOWN, null); 
                    match(input,String,FOLLOW_String_in_lookup759); 

                    // src/grammar/TLTreeWalker.g:125:22: ( indexes )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==INDEXES) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // src/grammar/TLTreeWalker.g:125:22: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup761);
                            indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "lookup"



    // $ANTLR start "indexes"
    // src/grammar/TLTreeWalker.g:128:1: indexes : ^( INDEXES ( expression )+ ) ;
    public final void indexes() throws RecognitionException {
        try {
            // src/grammar/TLTreeWalker.g:129:3: ( ^( INDEXES ( expression )+ ) )
            // src/grammar/TLTreeWalker.g:129:6: ^( INDEXES ( expression )+ )
            {
            match(input,INDEXES,FOLLOW_INDEXES_in_indexes778); 

            match(input, Token.DOWN, null); 
            // src/grammar/TLTreeWalker.g:129:16: ( expression )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0 >= Add && LA20_0 <= And)||LA20_0==Bool||LA20_0==Divide||LA20_0==Equals||(LA20_0 >= GT && LA20_0 <= GTEquals)||LA20_0==In||(LA20_0 >= LOOKUP && LA20_0 <= Number)||(LA20_0 >= Or && LA20_0 <= Pow)||(LA20_0 >= Subtract && LA20_0 <= TERNARY)||LA20_0==UNARY_MIN) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // src/grammar/TLTreeWalker.g:129:16: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_indexes780);
            	    expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "indexes"

    // Delegated rules


 

    public static final BitSet FOLLOW_block_in_walk50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_block67 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATEMENTS_in_block70 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_block72 = new BitSet(new long[]{0x0000000230000018L,0x0000000000000010L});
    public static final BitSet FOLLOW_RETURN_in_block77 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_block79 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignment_in_statement96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_statement103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_statement117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_assignment141 = new BitSet(new long[]{0x0031FF24C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_indexes_in_assignment143 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_assignment146 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_functionCall164 = new BitSet(new long[]{0x0000000000400008L});
    public static final BitSet FOLLOW_exprList_in_functionCall166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Println_in_functionCall178 = new BitSet(new long[]{0x0031FF20C2080468L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_functionCall180 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall190 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Print_in_functionCall192 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_functionCall194 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall203 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Assert_in_functionCall205 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_functionCall207 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Size_in_functionCall218 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_functionCall220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_ifStatement236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ifStat_in_ifStatement238 = new BitSet(new long[]{0x0000000000200008L});
    public static final BitSet FOLLOW_elseIfStat_in_ifStatement240 = new BitSet(new long[]{0x0000000000200008L});
    public static final BitSet FOLLOW_elseStat_in_ifStatement243 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXP_in_ifStat260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ifStat262 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_ifStat264 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXP_in_elseIfStat280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_elseIfStat282 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_elseIfStat284 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXP_in_elseStat300 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_elseStat302 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_For_in_forStatement321 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_forStatement323 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_forStatement325 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_forStatement327 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_forStatement329 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_While_in_whileStatement345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_whileStatement347 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_whileStatement349 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_LIST_in_idList365 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_idList367 = new BitSet(new long[]{0x0000000800000008L});
    public static final BitSet FOLLOW_EXP_LIST_in_exprList384 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_exprList386 = new BitSet(new long[]{0x0031FF20C2080468L,0x000000000000000BL});
    public static final BitSet FOLLOW_TERNARY_in_expression403 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression405 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_expression407 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_expression409 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_In_in_expression418 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression420 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_expression422 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Or_in_expression431 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression433 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_expression435 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_And_in_expression444 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression446 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_expression448 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Equals_in_expression457 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression459 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_expression461 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEquals_in_expression470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression472 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_expression474 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTEquals_in_expression483 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression485 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_expression487 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTEquals_in_expression496 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression498 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_expression500 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_expression509 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression511 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_expression513 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_expression522 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression524 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_expression526 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Add_in_expression535 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression537 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_expression539 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Subtract_in_expression548 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression550 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_expression552 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Multiply_in_expression561 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression563 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_expression565 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Divide_in_expression574 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression576 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_expression578 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Modulus_in_expression587 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression589 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_expression591 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Pow_in_expression600 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression602 = new BitSet(new long[]{0x0031FF20C2080460L,0x000000000000000BL});
    public static final BitSet FOLLOW_expression_in_expression604 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MIN_in_expression613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression615 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATE_in_expression624 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression626 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Number_in_expression634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_expression641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Null_in_expression648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lookup_in_expression655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_list681 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprList_in_list683 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup700 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_functionCall_in_lookup702 = new BitSet(new long[]{0x0000000400000008L});
    public static final BitSet FOLLOW_indexes_in_lookup704 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup714 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_in_lookup716 = new BitSet(new long[]{0x0000000400000008L});
    public static final BitSet FOLLOW_indexes_in_lookup718 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup728 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_lookup730 = new BitSet(new long[]{0x0000000400000008L});
    public static final BitSet FOLLOW_indexes_in_lookup732 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup743 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_lookup745 = new BitSet(new long[]{0x0000000400000008L});
    public static final BitSet FOLLOW_indexes_in_lookup747 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup757 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_String_in_lookup759 = new BitSet(new long[]{0x0000000400000008L});
    public static final BitSet FOLLOW_indexes_in_lookup761 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEXES_in_indexes778 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_indexes780 = new BitSet(new long[]{0x0031FF20C2080468L,0x000000000000000BL});

}