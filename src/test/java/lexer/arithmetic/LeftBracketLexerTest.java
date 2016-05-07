package lexer.arithmetic;

import lexer.AbstractLexerTest;

import static org.junit.Assert.*;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class LeftBracketLexerTest extends AbstractLexerTest {
    public LeftBracketLexerTest() {
        LEXER = new LeftBracketLexer();
        NEGATIVE_TESTS = new String[] {"", "a", " ", ")+ ", "0++"};
        POSITIVE_TESTS = new String[] {"(", "(-+", "((45%% as", "( "};
        VALUES = new String[] {"(", "(", "(", "("};
        RESTS = new String[] {"", "-+", "(45%% as", " "};
    }
}