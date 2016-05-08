package lexer.logic;

import lexer.AbstractLexerTest;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class BooleanLexerTest extends AbstractLexerTest {
    public BooleanLexerTest() {
        LEXER = new BooleanLexer();
        NEGATIVE_TESTS = new String[]{"", "A", " !", "-+ ", "0+!!+", "T", "TR", "TRU", "FALS", "TRUe", "FALSSE"};
        POSITIVE_TESTS = new String[]{"TRUE", "FALSE", "TRUETRUE", "FALSETRUE", "TRUE4 5-"};
        VALUES = new String[]{"TRUE", "FALSE", "TRUE", "FALSE", "TRUE"};
        RESTS = new String[]{"", "", "TRUE", "TRUE", "4 5-"};
    }
}
