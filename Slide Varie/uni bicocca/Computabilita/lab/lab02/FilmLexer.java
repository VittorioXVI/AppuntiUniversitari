/* The following code was generated by JFlex 1.6.1 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>films.flex</tt>
 */
public class FilmLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int InsideOpeningTag = 2;
  public static final int InsideDOCTYPE = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\5\1\22\0\1\1\1\10\1\25\14\0\1\26\14\0\1\2"+
    "\1\27\1\7\1\3\3\0\1\13\1\11\1\17\7\0\1\24\1\0"+
    "\1\12\1\16\2\0\1\23\1\14\4\0\1\15\7\0\1\32\1\0"+
    "\1\36\1\41\1\34\1\20\1\37\1\0\1\21\2\0\1\6\1\5"+
    "\1\35\1\31\1\40\1\0\1\33\1\22\1\30\1\0\1\43\1\0"+
    "\1\4\1\0\1\42\12\0\1\1\32\0\1\1\u15df\0\1\1\u097f\0"+
    "\13\1\35\0\2\1\5\0\1\1\57\0\1\1\u0fa0\0\1\1\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\ud00f\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\2\3\1\2\1\4\2\3\1\2"+
    "\2\3\43\0\1\5\25\0\1\6\5\0\1\7\14\0"+
    "\1\7\25\0\1\10\3\0\1\11\22\0\1\12\6\0"+
    "\1\13\3\0\1\14\1\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[148];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\44\0\110\0\154\0\220\0\264\0\330\0\374"+
    "\0\330\0\u0120\0\u0144\0\u0168\0\u018c\0\u01b0\0\u01d4\0\u01f8"+
    "\0\u021c\0\u0240\0\u0264\0\u0288\0\u02ac\0\u02d0\0\u02f4\0\u0318"+
    "\0\u033c\0\u0144\0\u0360\0\u0384\0\u03a8\0\u03cc\0\u03f0\0\u0414"+
    "\0\u0438\0\u045c\0\u0480\0\u04a4\0\u04c8\0\u04ec\0\u0510\0\u0534"+
    "\0\u0558\0\u057c\0\u05a0\0\u05c4\0\u05e8\0\u060c\0\u0630\0\u0654"+
    "\0\u0678\0\330\0\u069c\0\u06c0\0\u06e4\0\u0708\0\u072c\0\u0750"+
    "\0\u0774\0\u0798\0\u07bc\0\u07e0\0\u0804\0\u0828\0\u084c\0\u0870"+
    "\0\u0894\0\u08b8\0\u08dc\0\u0900\0\u0924\0\u0948\0\u096c\0\330"+
    "\0\u0990\0\u09b4\0\u09d8\0\u09fc\0\u0a20\0\u0a44\0\u0a68\0\u0a8c"+
    "\0\u0ab0\0\u0ad4\0\u0af8\0\u0b1c\0\u0b40\0\u0b64\0\u0b88\0\u0bac"+
    "\0\u0bd0\0\u0bf4\0\330\0\u0c18\0\u0c3c\0\u0c60\0\u0c84\0\u0ca8"+
    "\0\u0ccc\0\u0cf0\0\u0d14\0\u0d38\0\u0d5c\0\u0d80\0\u0da4\0\u0dc8"+
    "\0\u0dec\0\u0e10\0\u0e34\0\u0e58\0\u0e7c\0\u0ea0\0\u0ec4\0\u0ee8"+
    "\0\u0c84\0\u0f0c\0\u0f30\0\u0f54\0\330\0\u0f78\0\u0f9c\0\u0fc0"+
    "\0\u0fe4\0\u1008\0\u102c\0\u1050\0\u1074\0\u1098\0\u10bc\0\u10e0"+
    "\0\u1104\0\u1128\0\u114c\0\u1170\0\u1194\0\u11b8\0\u11dc\0\330"+
    "\0\u1200\0\u1224\0\u1248\0\u126c\0\u1290\0\u12b4\0\u1200\0\u12d8"+
    "\0\u12fc\0\u1320\0\330\0\u1344";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[148];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\41\4\1\7\1\10\5\7\1\11"+
    "\15\7\1\12\1\13\16\7\1\14\5\7\1\11\10\7"+
    "\1\15\2\7\1\16\20\7\2\4\1\0\42\4\1\5"+
    "\1\0\41\4\3\0\1\17\4\0\1\20\7\0\1\21"+
    "\1\0\1\22\3\0\1\23\1\0\1\24\1\0\1\25"+
    "\2\0\1\26\1\27\2\0\1\30\47\0\1\10\5\0"+
    "\1\11\11\0\1\31\4\0\1\32\14\0\1\33\25\34"+
    "\1\0\16\34\7\0\1\11\35\0\1\14\5\0\1\11"+
    "\55\0\1\35\37\0\1\36\32\0\1\37\50\0\1\40"+
    "\53\0\1\41\53\0\1\42\32\0\1\43\1\0\1\44"+
    "\5\0\1\45\1\0\1\46\2\0\1\47\1\50\2\0"+
    "\1\51\23\0\1\52\52\0\1\53\44\0\1\54\43\0"+
    "\1\55\1\56\45\0\1\57\50\0\1\60\33\0\1\61"+
    "\12\0\25\34\1\62\16\34\6\0\1\63\60\0\1\64"+
    "\25\0\1\65\50\0\1\66\37\0\1\67\65\0\1\70"+
    "\34\0\1\71\53\0\1\72\33\0\1\73\52\0\1\74"+
    "\44\0\1\75\43\0\1\76\1\77\45\0\1\100\37\0"+
    "\1\101\43\0\1\102\20\0\1\103\43\0\1\104\31\0"+
    "\1\105\34\0\1\106\35\0\1\107\50\0\1\110\44\0"+
    "\1\111\20\0\1\112\52\0\1\113\35\0\1\114\50\0"+
    "\1\115\35\0\1\116\66\0\1\117\21\0\1\120\65\0"+
    "\1\121\43\0\1\122\43\0\1\123\20\0\1\124\43\0"+
    "\1\125\31\0\1\126\34\0\1\127\35\0\1\130\52\0"+
    "\1\131\43\0\1\132\46\0\1\133\47\0\1\134\40\0"+
    "\1\26\42\0\1\135\45\0\1\136\36\0\1\60\34\0"+
    "\1\137\40\0\1\140\25\0\1\141\56\0\1\142\51\0"+
    "\1\133\52\0\1\143\17\0\1\144\66\0\1\145\44\0"+
    "\1\146\43\0\1\147\46\0\1\150\47\0\1\151\40\0"+
    "\1\47\42\0\1\152\45\0\1\153\13\0\1\154\70\0"+
    "\1\155\42\0\1\156\50\0\1\157\37\0\1\160\11\0"+
    "\1\161\66\0\1\162\17\0\3\163\1\0\40\163\15\0"+
    "\1\164\56\0\1\24\14\0\1\150\5\0\1\165\12\0"+
    "\1\150\52\0\1\166\20\0\1\167\70\0\1\170\11\0"+
    "\1\150\5\0\1\165\66\0\1\171\50\0\1\172\37\0"+
    "\1\173\41\0\1\133\33\0\1\133\12\0\1\133\46\0"+
    "\1\174\35\0\1\175\33\0\1\176\23\0\1\177\42\0"+
    "\3\163\1\200\40\163\16\0\1\201\55\0\1\45\44\0"+
    "\1\150\33\0\1\150\12\0\1\150\46\0\1\202\35\0"+
    "\1\203\33\0\1\204\57\0\1\205\41\0\1\205\52\0"+
    "\1\206\2\0\1\177\23\0\1\207\25\0\1\210\53\0"+
    "\1\211\61\0\1\212\41\0\1\212\52\0\1\213\22\0"+
    "\1\214\43\0\1\215\22\0\25\216\1\0\16\216\1\0"+
    "\1\217\63\0\1\220\43\0\1\221\54\0\1\133\1\0"+
    "\1\133\40\0\1\222\12\0\25\216\1\223\16\216\32\0"+
    "\1\150\1\0\1\150\40\0\1\224\47\0\1\103\43\0"+
    "\1\124\6\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4968];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\3\1\1\11\1\1\1\11\5\1\43\0\1\11"+
    "\25\0\1\11\5\0\1\1\14\0\1\11\25\0\1\1"+
    "\3\0\1\11\22\0\1\11\6\0\1\1\3\0\1\11"+
    "\1\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[148];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public FilmLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 172) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("\tTAG-CONTENT:" + yytext());
            }
          case 13: break;
          case 2: 
            { 
            }
          case 14: break;
          case 3: 
            { throw new Error("Illegal character '" + yytext() + "' at line " + yyline);
            }
          case 15: break;
          case 4: 
            { yybegin(YYINITIAL);
            }
          case 16: break;
          case 5: 
            { String matchedText = yytext();
		String attributeValue = matchedText.substring(1, matchedText.length()-1);
		System.out.println("\t\tATTRIBUTE-VALUE: " + attributeValue);
            }
          case 17: break;
          case 6: 
            { String matchedText = yytext();
		String attributeName = matchedText.substring(0, matchedText.length()-1);
		System.out.println("\tATTRIBUTE-NAME: " + attributeName);
            }
          case 18: break;
          case 7: 
            { String matchedText = yytext().trim();
		String tagName = matchedText.substring(1, matchedText.length());
		System.out.println("OPENING TAG: " + tagName);
		yybegin(InsideOpeningTag);
            }
          case 19: break;
          case 8: 
            { System.out.println("DOCTYPE_ROOT_TAG: " + yytext().trim());
            }
          case 20: break;
          case 9: 
            { String matchedText = yytext().trim();
		String tagName = matchedText.substring(2, matchedText.length()-1);
		//System.out.println("CLOSING TAG: " + tagName);
            }
          case 21: break;
          case 10: 
            { String matchedText = yytext();
		System.out.println("XML PREAMBLE: " + matchedText);
            }
          case 22: break;
          case 11: 
            { yybegin(InsideDOCTYPE);
            }
          case 23: break;
          case 12: 
            { System.out.println("DOCTYPE_SYSTEM: " + yytext());
		System.out.println("DOCTYPE_FILENAME: " + yytext().replaceAll(" ","").replace("SYSTEM",""));
            }
          case 24: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java FilmLexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        FilmLexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new FilmLexer(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
