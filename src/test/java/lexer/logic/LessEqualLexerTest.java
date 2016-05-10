package lexer.logic;

import lexer.AbstractLexerTest;

/**
 * Created on 10.05.16.
 *
 * @author m
 */
public class LessEqualLexerTest extends AbstractLexerTest {
    public LessEqualLexerTest() {
        LEXER = new LessEqualLexer();
        NEGATIVE_TESTS = new String[]{"", "a", "<", "&<= ", "=<", "0<<+!!+"};
        POSITIVE_TESTS = new String[]{"<=", "<=<=<", "<==<+ &&> && t"};
        VALUES = new String[]{"<=", "<=", "<="};
        RESTS = new String[]{"", "<=<", "=<+ &&> && t"};
    }
}