package lexer.logic;

import lexer.AbstractLexerTest;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class NotLexerTest extends AbstractLexerTest {
    public NotLexerTest() {
        LEXER = new NotLexer();
        NEGATIVE_TESTS = new String[]{"", "a", " !", "-+ ", "0+!!+"};
        POSITIVE_TESTS = new String[]{"!", "!!", "!+ t"};
        VALUES = new String[]{"!", "!", "!"};
        RESTS = new String[]{"", "!", "+ t"};
    }
}
