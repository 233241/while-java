package lexer.logic;

import lexer.AbstractLexerTest;

/**
 * Created on 10.05.16.
 *
 * @author m
 */
public class NotEqualTest extends AbstractLexerTest {
    public NotEqualTest() {
        LEXER = new NotEqualLexer();
        NEGATIVE_TESTS = new String[]{"", "9", "!", "!!", "==", "=", "==", "!+= ", "0!=+!!+"};
        POSITIVE_TESTS = new String[]{"!=", "!==", "!=!", "!=+ =! && t"};
        VALUES = new String[]{"!=", "!=", "!=", "!="};
        RESTS = new String[]{"", "=", "!", "+ =! && t"};
    }
}
