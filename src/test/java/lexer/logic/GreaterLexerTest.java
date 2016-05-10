package lexer.logic;

import lexer.AbstractLexerTest;

/**
 * Created on 10.05.16.
 *
 * @author m
 */
public class GreaterLexerTest extends AbstractLexerTest {
    public GreaterLexerTest() {
        LEXER = new GreaterLexer();
        NEGATIVE_TESTS = new String[]{"", "a", "<", "&> ", "0>>+!!+"};
        POSITIVE_TESTS = new String[]{">", ">>>", ">>+ &&> && t"};
        VALUES = new String[]{">", ">", ">"};
        RESTS = new String[]{"", ">>", ">+ &&> && t"};
    }
}