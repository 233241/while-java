package lexer.logic;

import lexer.AbstractLexerTest;

/**
 * Created on 10.05.16.
 *
 * @author m
 */
public class EqualTest extends AbstractLexerTest {
    public EqualTest() {
        LEXER = new EqualLexer();
        NEGATIVE_TESTS = new String[]{"", "9", "=", "=+= ", "0==+!!+"};
        POSITIVE_TESTS = new String[]{"==", "===", "==+ == && t"};
        VALUES = new String[]{"==", "==", "=="};
        RESTS = new String[]{"", "=", "+ == && t"};
    }
}
