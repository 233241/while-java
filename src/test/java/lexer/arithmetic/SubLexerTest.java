package lexer.arithmetic;

import lexer.AbstractLexerTest;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class SubLexerTest extends AbstractLexerTest {
    public SubLexerTest() {
        LEXER = new SubLexer();
        NEGATIVE_TESTS = new String[] {"", "a", " ", "+- ", "0++"};
        POSITIVE_TESTS = new String[] {"-", "--", "-3 a-"};
        VALUES = new String[] {"-", "-", "-"};
        RESTS = new String[] {"", "-", "3 a-"};
    }
}