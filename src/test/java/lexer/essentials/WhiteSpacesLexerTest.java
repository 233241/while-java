package lexer.essentials;

import lexer.AbstractLexerTest;

import static org.junit.Assert.*;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class WhiteSpacesLexerTest extends AbstractLexerTest {
    public WhiteSpacesLexerTest() {
        LEXER = new WhiteSpacesLexer();
        NEGATIVE_TESTS = new String[] {"", "1", "2 +", "/ ", "a 6", "_    4a/ "};
        POSITIVE_TESTS = new String[] {" ", "\t", "\n", " \te", "  r ", "   \n "};
        VALUES = new String[] {" ", "\t", "\n", " \t", "  ", "   \n "};
        RESTS = new String[] {"", "", "", "e", "r ", ""};
    }
}