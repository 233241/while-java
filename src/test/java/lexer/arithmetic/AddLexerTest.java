package lexer.arithmetic;

import lexer.AbstractLexerTest;

/**
 * Created on 07.05.16.
 *
 * @author m
 */
public class AddLexerTest extends AbstractLexerTest {
    public AddLexerTest() {
        LEXER = new AddLexer();
        NEGATIVE_TESTS = new String[] {"", "a", " ", "-+ ", "0++"};
        POSITIVE_TESTS = new String[] {"+", "+-+", "+45 as", "++"};
        VALUES = new String[] {"+", "+", "+", "+"};
        RESTS = new String[] {"", "-+", "45 as", "+"};
    }
}