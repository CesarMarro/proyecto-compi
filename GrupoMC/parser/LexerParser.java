// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: Lexer.flex

package parser;

import java_cup.runtime.Symbol;


@SuppressWarnings("fallthrough")
class LexerParser implements java_cup.runtime.Scanner {

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
     0, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 
    25, 24, 24, 24, 24, 24, 24, 24, 26, 24, 24, 27,  0, 28,  0,  0, 
     0, 29, 30, 31, 32, 33, 34, 35, 24, 36, 24, 37, 38, 39, 40, 41, 
    24, 24, 42, 43, 44, 45, 46, 24, 26, 24, 24, 47, 48, 49,  0,  0, 
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
    "\1\16\1\17\1\20\1\21\2\22\1\23\1\24\10\22"+
    "\1\25\1\1\1\26\1\27\1\0\1\30\1\0\1\31"+
    "\1\32\1\0\1\33\1\0\1\34\1\35\1\36\11\22"+
    "\1\37\4\22\1\40\1\41\1\42\1\0\1\15\10\22"+
    "\1\43\1\44\3\22\1\45\6\22\1\46\2\22\1\47"+
    "\1\50\2\22\1\51\1\22\1\52\1\22\1\53\5\22"+
    "\1\54\1\55\1\56\1\57\1\22\1\60";

  private static int [] zzUnpackAction() {
    int [] result = new int[111];
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
    "\0\0\0\62\0\144\0\226\0\310\0\62\0\372\0\u012c"+
    "\0\62\0\62\0\62\0\u015e\0\62\0\u0190\0\62\0\u01c2"+
    "\0\u01f4\0\u0226\0\62\0\u0258\0\u028a\0\u02bc\0\u02ee\0\u0320"+
    "\0\62\0\62\0\u0352\0\u0384\0\u03b6\0\u03e8\0\u041a\0\u044c"+
    "\0\u047e\0\u04b0\0\62\0\u04e2\0\62\0\62\0\u0514\0\62"+
    "\0\u0546\0\62\0\62\0\u0578\0\u05aa\0\u05dc\0\62\0\62"+
    "\0\62\0\u060e\0\u0640\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a"+
    "\0\u076c\0\u079e\0\u02ee\0\u07d0\0\u0802\0\u0834\0\u0866\0\62"+
    "\0\62\0\62\0\u0898\0\u05dc\0\u08ca\0\u08fc\0\u092e\0\u0960"+
    "\0\u0992\0\u09c4\0\u09f6\0\u0a28\0\u02ee\0\u02ee\0\u0a5a\0\u0a8c"+
    "\0\u0abe\0\62\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea"+
    "\0\u02ee\0\u0c1c\0\u0c4e\0\u02ee\0\u02ee\0\u0c80\0\u0cb2\0\u02ee"+
    "\0\u0ce4\0\u02ee\0\u0d16\0\u02ee\0\u0d48\0\u0d7a\0\u0dac\0\u0dde"+
    "\0\u0e10\0\u02ee\0\u02ee\0\u02ee\0\u02ee\0\u0e42\0\u02ee";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[111];
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
    "\1\21\1\22\1\23\1\24\1\25\1\26\2\27\1\30"+
    "\1\27\1\31\1\32\1\27\1\33\1\34\1\27\1\35"+
    "\1\36\1\27\1\37\5\27\1\40\1\27\1\41\1\27"+
    "\1\42\1\43\1\44\1\45\63\0\2\3\104\0\1\46"+
    "\34\0\5\47\1\0\11\47\1\0\42\47\7\0\1\50"+
    "\52\0\10\51\1\0\6\51\1\0\42\51\25\0\1\52"+
    "\61\0\1\53\47\0\1\54\4\0\1\55\62\0\2\22"+
    "\7\0\1\56\50\0\2\22\64\0\1\57\61\0\1\60"+
    "\61\0\1\61\55\0\2\27\4\0\4\27\2\0\22\27"+
    "\24\0\2\27\4\0\4\27\2\0\15\27\1\62\4\27"+
    "\24\0\2\27\4\0\4\27\2\0\14\27\1\63\1\64"+
    "\4\27\24\0\2\27\4\0\4\27\2\0\1\65\10\27"+
    "\1\66\2\27\1\67\5\27\24\0\2\27\4\0\4\27"+
    "\2\0\11\27\1\70\10\27\24\0\2\27\4\0\4\27"+
    "\2\0\1\71\13\27\1\72\5\27\24\0\2\27\4\0"+
    "\4\27\2\0\5\27\1\73\5\27\1\74\6\27\24\0"+
    "\2\27\4\0\4\27\2\0\4\27\1\75\15\27\24\0"+
    "\2\27\4\0\4\27\2\0\15\27\1\76\4\27\24\0"+
    "\2\27\4\0\4\27\2\0\14\27\1\77\5\27\63\0"+
    "\1\100\1\0\5\47\1\101\11\47\1\0\42\47\10\0"+
    "\1\102\51\0\13\54\1\103\46\54\2\55\2\0\56\55"+
    "\21\0\2\104\4\0\1\104\5\0\6\104\40\0\2\27"+
    "\4\0\4\27\2\0\14\27\1\105\5\27\24\0\2\27"+
    "\4\0\4\27\2\0\14\27\1\106\5\27\24\0\2\27"+
    "\4\0\4\27\2\0\4\27\1\107\15\27\24\0\2\27"+
    "\4\0\4\27\2\0\11\27\1\110\10\27\24\0\2\27"+
    "\4\0\4\27\2\0\1\111\21\27\24\0\2\27\4\0"+
    "\4\27\2\0\13\27\1\112\6\27\24\0\2\27\4\0"+
    "\4\27\2\0\16\27\1\113\3\27\24\0\2\27\4\0"+
    "\4\27\2\0\11\27\1\114\10\27\24\0\2\27\4\0"+
    "\4\27\2\0\15\27\1\115\4\27\24\0\2\27\4\0"+
    "\4\27\2\0\17\27\1\116\2\27\24\0\2\27\4\0"+
    "\4\27\2\0\17\27\1\117\2\27\24\0\2\27\4\0"+
    "\4\27\2\0\20\27\1\120\1\27\24\0\2\27\4\0"+
    "\4\27\2\0\7\27\1\121\12\27\3\0\13\54\1\103"+
    "\4\54\1\122\41\54\21\0\2\27\4\0\4\27\2\0"+
    "\6\27\1\123\13\27\24\0\2\27\4\0\4\27\2\0"+
    "\11\27\1\124\10\27\24\0\2\27\4\0\4\27\2\0"+
    "\1\125\21\27\24\0\2\27\4\0\4\27\2\0\11\27"+
    "\1\126\10\27\24\0\2\27\4\0\4\27\2\0\16\27"+
    "\1\127\3\27\24\0\2\27\4\0\4\27\2\0\17\27"+
    "\1\130\2\27\24\0\2\27\4\0\4\27\2\0\4\27"+
    "\1\131\15\27\24\0\2\27\4\0\4\27\2\0\16\27"+
    "\1\132\3\27\24\0\2\27\4\0\4\27\2\0\20\27"+
    "\1\133\1\27\24\0\2\27\4\0\4\27\2\0\4\27"+
    "\1\134\15\27\24\0\2\27\4\0\4\27\2\0\3\27"+
    "\1\135\16\27\24\0\2\27\4\0\4\27\2\0\15\27"+
    "\1\136\4\27\24\0\2\27\4\0\4\27\2\0\4\27"+
    "\1\137\15\27\24\0\2\27\4\0\4\27\2\0\10\27"+
    "\1\140\11\27\24\0\2\27\4\0\4\27\2\0\14\27"+
    "\1\141\5\27\24\0\2\27\4\0\4\27\2\0\16\27"+
    "\1\142\3\27\24\0\2\27\4\0\4\27\2\0\7\27"+
    "\1\143\12\27\24\0\2\27\4\0\4\27\2\0\4\27"+
    "\1\144\15\27\24\0\2\27\4\0\4\27\2\0\15\27"+
    "\1\145\4\27\24\0\2\27\4\0\4\27\2\0\1\146"+
    "\21\27\24\0\2\27\4\0\4\27\2\0\1\147\21\27"+
    "\24\0\2\27\4\0\4\27\2\0\20\27\1\150\1\27"+
    "\24\0\2\27\4\0\4\27\2\0\13\27\1\151\6\27"+
    "\24\0\2\27\4\0\4\27\2\0\13\27\1\152\6\27"+
    "\24\0\2\27\4\0\4\27\2\0\12\27\1\153\7\27"+
    "\24\0\2\27\4\0\4\27\2\0\13\27\1\154\6\27"+
    "\24\0\2\27\4\0\4\27\2\0\17\27\1\155\2\27"+
    "\24\0\2\27\4\0\4\27\2\0\20\27\1\156\1\27"+
    "\24\0\2\27\4\0\4\27\2\0\4\27\1\157\15\27"+
    "\3\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[3700];
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
    "\1\1\1\11\3\1\1\11\5\1\2\11\10\1\1\11"+
    "\1\1\2\11\1\0\1\11\1\0\2\11\1\0\1\1"+
    "\1\0\3\11\16\1\3\11\1\0\16\1\1\11\35\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[111];
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
  LexerParser(java.io.Reader in) {
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
            { return new Symbol(sym.ERROR, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 49: break;
          case 2:
            { /* Ignore whitespace */
            }
          // fall through
          case 50: break;
          case 3:
            { return new Symbol(sym.NOT, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 51: break;
          case 4:
            { return new Symbol(sym.MOD, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 52: break;
          case 5:
            { return new Symbol(sym.OPEN_PARE, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 53: break;
          case 6:
            { return new Symbol(sym.CLOSE_PARE, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 54: break;
          case 7:
            { return new Symbol(sym.MULTIPLICATION, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 55: break;
          case 8:
            { return new Symbol(sym.SUM, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 56: break;
          case 9:
            { return new Symbol(sym.COMMA, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 57: break;
          case 10:
            { return new Symbol(sym.SUS, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 58: break;
          case 11:
            { return new Symbol(sym.DOT, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 59: break;
          case 12:
            { return new Symbol(sym.DIVIDE, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 60: break;
          case 13:
            { System.out.println("Token INT_LITERAL detectado: " + yytext()); 
    return new Symbol(sym.INT_LITERAL, yyline + 1, yycolumn + 1, Integer.parseInt(yytext()));
            }
          // fall through
          case 61: break;
          case 14:
            { return new Symbol(sym.SEMICOLON, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 62: break;
          case 15:
            { return new Symbol(sym.LESS_THAN, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 63: break;
          case 16:
            { return new Symbol(sym.ASSIGN, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 64: break;
          case 17:
            { return new Symbol(sym.MORE_THAN, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 65: break;
          case 18:
            { return new Symbol(sym.ID, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 66: break;
          case 19:
            { return new Symbol(sym.OPEN_BRACKET, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 67: break;
          case 20:
            { return new Symbol(sym.CLOSE_BRACKET, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 68: break;
          case 21:
            { return new Symbol(sym.OPEN_BRACE, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 69: break;
          case 22:
            { return new Symbol(sym.CLOSE_BRACE, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 70: break;
          case 23:
            { return new Symbol(sym.DIFFERENT, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 71: break;
          case 24:
            { return new Symbol(sym.AND, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 72: break;
          case 25:
            { return new Symbol(sym.SUM_ASIGN, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 73: break;
          case 26:
            { return new Symbol(sym.SUS_ASIGN, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 74: break;
          case 27:
            { /* Ignore comments */
            }
          // fall through
          case 75: break;
          case 28:
            { return new Symbol(sym.LESS_THAN_OR_EQUAL, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 76: break;
          case 29:
            { return new Symbol(sym.EQUAL, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 77: break;
          case 30:
            { return new Symbol(sym.MORE_THAN_OR_EQUAL, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 78: break;
          case 31:
            { return new Symbol(sym.IF, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 79: break;
          case 32:
            { return new Symbol(sym.OR, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 80: break;
          case 33:
            { return new Symbol(sym.STRING_LITERAL, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 81: break;
          case 34:
            { return new Symbol(sym.CHAR_LITERAL, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 82: break;
          case 35:
            { return new Symbol(sym.FOR, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 83: break;
          case 36:
            { return new Symbol(sym.INT, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 84: break;
          case 37:
            { /*Ignore*/
            }
          // fall through
          case 85: break;
          case 38:
            { return new Symbol(sym.ELSE, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 86: break;
          case 39:
            { return new Symbol(sym.TRUE, yyline + 1, yycolumn + 1, true);
            }
          // fall through
          case 87: break;
          case 40:
            { return new Symbol(sym.VOID, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 88: break;
          case 41:
            { return new Symbol(sym.BREAK, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 89: break;
          case 42:
            { return new Symbol(sym.CLASS, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 90: break;
          case 43:
            { return new Symbol(sym.FALSE, yyline + 1, yycolumn + 1, false);
            }
          // fall through
          case 91: break;
          case 44:
            { return new Symbol(sym.RETURN, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 92: break;
          case 45:
            { return new Symbol(sym.PROGRAM, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 93: break;
          case 46:
            { return new Symbol(sym.BOOLEAN, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 94: break;
          case 47:
            { return new Symbol(sym.CALLOUT, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 95: break;
          case 48:
            { return new Symbol(sym.CONTINUE, yyline + 1, yycolumn + 1, yytext());
            }
          // fall through
          case 96: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
