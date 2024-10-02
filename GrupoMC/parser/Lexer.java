// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: parser/Lexer.flex

package parser;


import java_cup.runtime.Symbol;

@SuppressWarnings("fallthrough")
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  2,  3,  3,  2,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     1,  4,  5,  0,  0,  6,  7,  8,  9, 10, 11, 12, 13, 14, 15, 16, 
    17, 18, 18, 18, 18, 18, 18, 18, 18, 18,  0, 19, 20, 21, 22,  0, 
     0, 23, 24, 23, 25, 23, 26, 27, 27, 27, 27, 27, 27, 27, 27, 27, 
    28, 27, 27, 27, 27, 27, 29, 27, 30, 27, 27, 31,  0, 32,  0,  0, 
     0, 33, 34, 35, 36, 37, 38, 39, 40, 41, 27, 42, 43, 44, 45, 46, 
    47, 27, 48, 49, 50, 51, 52, 53, 30, 54, 27, 55, 56, 57,  0,  0, 
     0,  0,  0,  0,  0,  3,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\2\1\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\2\15"+
    "\1\16\1\17\1\20\1\21\3\22\3\23\1\24\1\25"+
    "\4\22\6\23\1\26\1\1\1\27\1\30\1\0\1\31"+
    "\1\0\1\32\1\33\1\2\1\0\1\34\1\35\1\36"+
    "\14\23\1\37\7\23\1\40\1\41\1\42\1\43\34\23";

  private static int [] zzUnpackAction() {
    int [] result = new int[106];
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
    "\0\0\0\72\0\164\0\256\0\350\0\72\0\u0122\0\u015c"+
    "\0\72\0\72\0\72\0\u0196\0\72\0\u01d0\0\72\0\u020a"+
    "\0\u0244\0\u027e\0\72\0\u02b8\0\u02f2\0\u032c\0\u0366\0\u03a0"+
    "\0\u03da\0\u0366\0\u0414\0\u044e\0\72\0\72\0\u0488\0\u04c2"+
    "\0\u04fc\0\u0536\0\u0570\0\u05aa\0\u05e4\0\u061e\0\u0658\0\u0692"+
    "\0\72\0\u06cc\0\72\0\72\0\u0706\0\72\0\u0740\0\72"+
    "\0\72\0\u077a\0\u07b4\0\72\0\72\0\72\0\u07ee\0\u0828"+
    "\0\u0862\0\u089c\0\u08d6\0\u0910\0\u094a\0\u0984\0\u09be\0\u09f8"+
    "\0\u04fc\0\u0a32\0\u0366\0\u0a6c\0\u0aa6\0\u0ae0\0\u0b1a\0\u0b54"+
    "\0\u0b8e\0\u0bc8\0\72\0\72\0\72\0\u07b4\0\u0c02\0\u0c3c"+
    "\0\u0c76\0\u0cb0\0\u0cea\0\u0d24\0\u0d5e\0\u0d98\0\u0dd2\0\u0e0c"+
    "\0\u0e46\0\u0e80\0\u0eba\0\u0ef4\0\u0f2e\0\u0f68\0\u0fa2\0\u0fdc"+
    "\0\u1016\0\u1050\0\u108a\0\u10c4\0\u10fe\0\u1138\0\u1172\0\u11ac"+
    "\0\u11e6\0\u1220";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[106];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\27\1\31\1\32\1\33\1\34\1\32\1\35\1\36"+
    "\1\27\1\37\1\40\1\27\1\41\1\42\2\32\1\43"+
    "\2\32\1\44\3\32\1\45\1\32\1\46\1\32\1\47"+
    "\1\50\1\32\1\51\1\52\1\53\73\0\2\3\114\0"+
    "\1\54\44\0\5\55\1\0\11\55\1\0\52\55\7\0"+
    "\1\56\62\0\10\57\1\0\6\57\1\0\52\57\25\0"+
    "\1\60\71\0\1\61\64\0\1\62\72\0\2\22\13\0"+
    "\1\63\54\0\2\22\74\0\1\64\71\0\1\65\71\0"+
    "\1\66\65\0\2\32\4\0\10\32\2\0\26\32\24\0"+
    "\2\32\4\0\10\32\2\0\12\32\1\67\13\32\24\0"+
    "\2\32\4\0\10\32\2\0\22\32\1\70\3\32\24\0"+
    "\2\32\4\0\10\32\2\0\17\32\1\71\6\32\24\0"+
    "\2\32\4\0\10\32\2\0\1\72\25\32\24\0\2\32"+
    "\4\0\10\32\2\0\15\32\1\73\1\32\1\74\6\32"+
    "\24\0\2\32\4\0\10\32\2\0\1\75\11\32\1\76"+
    "\2\32\1\77\10\32\24\0\2\32\4\0\10\32\2\0"+
    "\12\32\1\100\13\32\24\0\2\32\4\0\10\32\2\0"+
    "\1\101\14\32\1\102\10\32\24\0\2\32\4\0\10\32"+
    "\2\0\5\32\1\103\6\32\1\104\11\32\24\0\2\32"+
    "\4\0\10\32\2\0\1\105\25\32\24\0\2\32\4\0"+
    "\10\32\2\0\4\32\1\106\21\32\24\0\2\32\4\0"+
    "\10\32\2\0\17\32\1\107\5\32\1\110\24\0\2\32"+
    "\4\0\10\32\2\0\15\32\1\111\10\32\24\0\2\32"+
    "\4\0\10\32\2\0\7\32\1\112\16\32\73\0\1\113"+
    "\1\0\5\55\1\114\11\55\1\0\52\55\10\0\1\115"+
    "\61\0\2\62\2\0\66\62\21\0\2\116\4\0\4\116"+
    "\6\0\6\116\44\0\2\32\4\0\10\32\2\0\15\32"+
    "\1\117\10\32\24\0\2\32\4\0\10\32\2\0\14\32"+
    "\1\120\11\32\24\0\2\32\4\0\10\32\2\0\15\32"+
    "\1\121\10\32\24\0\2\32\4\0\10\32\2\0\17\32"+
    "\1\120\6\32\24\0\2\32\4\0\10\32\2\0\15\32"+
    "\1\122\10\32\24\0\2\32\4\0\10\32\2\0\4\32"+
    "\1\123\21\32\24\0\2\32\4\0\10\32\2\0\12\32"+
    "\1\124\13\32\24\0\2\32\4\0\10\32\2\0\1\125"+
    "\25\32\24\0\2\32\4\0\10\32\2\0\14\32\1\126"+
    "\11\32\24\0\2\32\4\0\10\32\2\0\20\32\1\127"+
    "\5\32\24\0\2\32\4\0\10\32\2\0\17\32\1\103"+
    "\6\32\24\0\2\32\4\0\10\32\2\0\21\32\1\103"+
    "\4\32\24\0\2\32\4\0\10\32\2\0\10\32\1\130"+
    "\15\32\24\0\2\32\4\0\10\32\2\0\21\32\1\131"+
    "\4\32\24\0\2\32\4\0\10\32\2\0\22\32\1\127"+
    "\3\32\24\0\2\32\4\0\10\32\2\0\16\32\1\127"+
    "\7\32\24\0\2\32\4\0\10\32\2\0\10\32\1\132"+
    "\15\32\24\0\2\32\4\0\10\32\2\0\10\32\1\133"+
    "\15\32\24\0\2\32\4\0\10\32\2\0\2\32\1\134"+
    "\23\32\24\0\2\32\4\0\2\32\1\135\5\32\2\0"+
    "\26\32\24\0\2\32\4\0\10\32\2\0\6\32\1\136"+
    "\17\32\24\0\2\32\4\0\10\32\2\0\12\32\1\137"+
    "\13\32\24\0\2\32\4\0\10\32\2\0\1\134\25\32"+
    "\24\0\2\32\4\0\10\32\2\0\12\32\1\140\13\32"+
    "\24\0\2\32\4\0\10\32\2\0\20\32\1\141\5\32"+
    "\24\0\2\32\4\0\10\32\2\0\21\32\1\142\4\32"+
    "\24\0\2\32\4\0\10\32\2\0\4\32\1\103\21\32"+
    "\24\0\2\32\4\0\10\32\2\0\14\32\1\103\11\32"+
    "\24\0\2\32\4\0\10\32\2\0\22\32\1\143\3\32"+
    "\24\0\2\32\4\0\10\32\2\0\3\32\1\103\22\32"+
    "\24\0\2\32\4\0\10\32\2\0\12\32\1\127\13\32"+
    "\24\0\2\32\4\0\10\32\2\0\11\32\1\103\14\32"+
    "\24\0\2\32\4\0\10\32\2\0\4\32\1\144\21\32"+
    "\24\0\2\32\4\0\10\32\2\0\17\32\1\145\6\32"+
    "\24\0\2\32\4\0\10\32\2\0\4\32\1\146\21\32"+
    "\24\0\2\32\4\0\10\32\2\0\15\32\1\147\10\32"+
    "\24\0\2\32\4\0\10\32\2\0\20\32\1\103\5\32"+
    "\24\0\2\32\4\0\10\32\2\0\10\32\1\150\15\32"+
    "\24\0\2\32\4\0\10\32\2\0\17\32\1\130\6\32"+
    "\24\0\2\32\4\0\10\32\2\0\2\32\1\151\23\32"+
    "\24\0\2\32\4\0\10\32\2\0\1\152\25\32\24\0"+
    "\2\32\4\0\10\32\2\0\1\130\25\32\24\0\2\32"+
    "\4\0\10\32\2\0\22\32\1\104\3\32\24\0\2\32"+
    "\4\0\10\32\2\0\14\32\1\107\11\32\24\0\2\32"+
    "\4\0\10\32\2\0\12\32\1\103\13\32\24\0\2\32"+
    "\4\0\10\32\2\0\13\32\1\103\12\32\3\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[4698];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\1\11\2\1\3\11\1\1\1\11"+
    "\1\1\1\11\3\1\1\11\11\1\2\11\12\1\1\11"+
    "\1\1\2\11\1\0\1\11\1\0\2\11\1\1\1\0"+
    "\3\11\24\1\3\11\35\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[106];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;
    public int line;
    public int column;

        // Getter method for line
    public int getLine() {
        return line;
    }

    // Getter method for column
    public int getColumn() {
        return column;
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    return ZZ_CMAP[input];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
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
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
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
        // peek one character ahead if it is
        // (if we have counted one line too much)
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return new Symbol(sym.ERROR, (int)yychar, yyline, yytext());
            }
          // fall through
          case 36: break;
          case 2:
            { /*Ignore*/
            }
          // fall through
          case 37: break;
          case 3:
            { return new Symbol(sym.NOT, (int)yychar, yyline, yytext());
            }
          // fall through
          case 38: break;
          case 4:
            { return new Symbol(sym.MOD, (int)yychar, yyline, yytext());
            }
          // fall through
          case 39: break;
          case 5:
            { return new Symbol(sym.OPEN_PARE, (int)yychar, yyline, yytext());
            }
          // fall through
          case 40: break;
          case 6:
            { return new Symbol(sym.CLOSE_PARE, (int)yychar, yyline, yytext());
            }
          // fall through
          case 41: break;
          case 7:
            { return new Symbol(sym.MULTIPLICATION, (int)yychar, yyline, yytext());
            }
          // fall through
          case 42: break;
          case 8:
            { return new Symbol(sym.SUM, (int)yychar, yyline, yytext());
            }
          // fall through
          case 43: break;
          case 9:
            { return new Symbol(sym.COMMA, (int)yychar, yyline, yytext());
            }
          // fall through
          case 44: break;
          case 10:
            { return new Symbol(sym.SUS, (int)yychar, yyline, yytext());
            }
          // fall through
          case 45: break;
          case 11:
            { return new Symbol(sym.DOT, (int)yychar, yyline, yytext());
            }
          // fall through
          case 46: break;
          case 12:
            { return new Symbol(sym.DIVIDE,(int) yychar, yyline, yytext());
            }
          // fall through
          case 47: break;
          case 13:
            { return new Symbol(sym.INT_LITERAL, (int)yychar, yyline, yytext());
            }
          // fall through
          case 48: break;
          case 14:
            { return new Symbol(sym.SEMICOLON, (int)yychar, yyline, yytext());
            }
          // fall through
          case 49: break;
          case 15:
            { return new Symbol(sym.LESS_THAN, (int)yychar, yyline, yytext());
            }
          // fall through
          case 50: break;
          case 16:
            { return new Symbol(sym.ASSIGN, (int)yychar, yyline, yytext());
            }
          // fall through
          case 51: break;
          case 17:
            { return new Symbol(sym.MORE_THAN, (int)yychar, yyline, yytext());
            }
          // fall through
          case 52: break;
          case 18:
            { return new Symbol(sym.HEX_DIGIT, (int)yychar, yyline, yytext());
            }
          // fall through
          case 53: break;
          case 19:
            { return new Symbol(sym.ID,(int) yychar, yyline, yytext());
            }
          // fall through
          case 54: break;
          case 20:
            { return new Symbol(sym.OPEN_BRACKET, (int)yychar, yyline, yytext());
            }
          // fall through
          case 55: break;
          case 21:
            { return new Symbol(sym.CLOSE_BRACKET, (int)yychar, yyline, yytext());
            }
          // fall through
          case 56: break;
          case 22:
            { return new Symbol(sym.OPEN_BRACE,(int) yychar, yyline, yytext());
            }
          // fall through
          case 57: break;
          case 23:
            { return new Symbol(sym.CLOSE_BRACE,(int) yychar, yyline, yytext());
            }
          // fall through
          case 58: break;
          case 24:
            { return new Symbol(sym.DIFFERENT, (int)yychar, yyline, yytext());
            }
          // fall through
          case 59: break;
          case 25:
            { return new Symbol(sym.AND, (int)yychar, yyline, yytext());
            }
          // fall through
          case 60: break;
          case 26:
            { return new Symbol(sym.SUM_ASIGN,(int) yychar, yyline, yytext());
            }
          // fall through
          case 61: break;
          case 27:
            { return new Symbol(sym.SUS_ASIGN, (int)yychar, yyline, yytext());
            }
          // fall through
          case 62: break;
          case 28:
            { return new Symbol(sym.LESS_THAN_OR_EQUAL,(int) yychar, yyline, yytext());
            }
          // fall through
          case 63: break;
          case 29:
            { return new Symbol(sym.EQUAL, (int)yychar, yyline, yytext());
            }
          // fall through
          case 64: break;
          case 30:
            { return new Symbol(sym.MORE_THAN_OR_EQUAL, (int)yychar, yyline, yytext());
            }
          // fall through
          case 65: break;
          case 31:
            { return new Symbol(sym.RESERVADAS, (int)yychar, yyline, yytext());
            }
          // fall through
          case 66: break;
          case 32:
            { return new Symbol(sym.OR, (int)yychar, yyline, yytext());
            }
          // fall through
          case 67: break;
          case 33:
            { return new Symbol(sym.STRING_LITERAL,(int) yychar, yyline, yytext());
            }
          // fall through
          case 68: break;
          case 34:
            { return new Symbol(sym.CHAR_LITERAL, (int)yychar, yyline, yytext());
            }
          // fall through
          case 69: break;
          case 35:
            { return new Symbol(sym.HEX_LITERAL,(int) yychar, yyline, yytext());
            }
          // fall through
          case 70: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
