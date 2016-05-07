package lexer;

import lexer.essentials.ILexer;
import org.junit.Test;

/**
 * Created on 07.05.16.
 *
 * @author m
 */
public abstract class AbstractLexerTest {
    protected ILexer LEXER;
    protected String[] NEGATIVE_TESTS;
    protected String[] POSITIVE_TESTS;
    protected String[] VALUES;
    protected String[] RESTS;

    @Test
    public void negativeTests() {
        LexerTester.negativeTest(LEXER, NEGATIVE_TESTS);
    }

    @Test
    public void positiveTests() {
        LexerTester.positiveTest(LEXER, POSITIVE_TESTS, VALUES, RESTS);
    }
}
