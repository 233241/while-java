package lexer.others;

import lexer.AbstractLexerTest;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class LeftParenthesisLexerTest extends AbstractLexerTest {
    public LeftParenthesisLexerTest() {
        LEXER = new LeftParenthesisLexer();
        NEGATIVE_TESTS = new String[] {"", "a", " ", ")+ ", "0++"};
        POSITIVE_TESTS = new String[] {"(", "(-+", "((45%% as", "( "};
        VALUES = new String[] {"(", "(", "(", "("};
        RESTS = new String[] {"", "-+", "(45%% as", " "};
    }
}