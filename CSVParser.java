// $ANTLR 3.4 CSV.g 2012-09-10 21:08:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CSVParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Comma", "LineBreak", "QuotedValue", "SimpleValue"
    };

    public static final int EOF=-1;
    public static final int Comma=4;
    public static final int LineBreak=5;
    public static final int QuotedValue=6;
    public static final int SimpleValue=7;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public CSVParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public CSVParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return CSVParser.tokenNames; }
    public String getGrammarFileName() { return "CSV.g"; }



    // $ANTLR start "file"
    // CSV.g:3:1: file : ( row )+ EOF ;
    public final void file() throws RecognitionException {
        try {
            // CSV.g:4:3: ( ( row )+ EOF )
            // CSV.g:4:6: ( row )+ EOF
            {
            // CSV.g:4:6: ( row )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= QuotedValue && LA1_0 <= SimpleValue)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // CSV.g:4:6: row
            	    {
            	    pushFollow(FOLLOW_row_in_file13);
            	    row();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_file16); 

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
    // $ANTLR end "file"



    // $ANTLR start "row"
    // CSV.g:7:1: row : value ( Comma value )* ( LineBreak | EOF ) ;
    public final void row() throws RecognitionException {
        try {
            // CSV.g:8:3: ( value ( Comma value )* ( LineBreak | EOF ) )
            // CSV.g:8:6: value ( Comma value )* ( LineBreak | EOF )
            {
            pushFollow(FOLLOW_value_in_row30);
            value();

            state._fsp--;


            // CSV.g:8:12: ( Comma value )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Comma) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // CSV.g:8:13: Comma value
            	    {
            	    match(input,Comma,FOLLOW_Comma_in_row33); 

            	    pushFollow(FOLLOW_value_in_row35);
            	    value();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            if ( input.LA(1)==EOF||input.LA(1)==LineBreak ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "row"



    // $ANTLR start "value"
    // CSV.g:11:1: value : ( SimpleValue | QuotedValue );
    public final void value() throws RecognitionException {
        try {
            // CSV.g:12:3: ( SimpleValue | QuotedValue )
            // CSV.g:
            {
            if ( (input.LA(1) >= QuotedValue && input.LA(1) <= SimpleValue) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "value"

    // Delegated rules


 

    public static final BitSet FOLLOW_row_in_file13 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_EOF_in_file16 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_row30 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_Comma_in_row33 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_value_in_row35 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_row39 = new BitSet(new long[]{0x0000000000000002L});

}