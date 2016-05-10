package lexer.arithmetic;

import lexer.AbstractLexerTest;

/**
 * Created on 10.05.16.
 *
 * @author m
 */
public class PowLexerTest extends AbstractLexerTest{
    public PowLexerTest() {
        LEXER = new PowLexer();
        NEGATIVE_TESTS = new String[] {"", "a", " ", ")* ", "0**"};
        POSITIVE_TESTS = new String[] {"^", "^-+", "^^45%% as", "^ "};
        VALUES = new String[] {"^", "^", "^", "^"};
        RESTS = new String[] {"", "-+", "^45%% as", " "};
    }
}