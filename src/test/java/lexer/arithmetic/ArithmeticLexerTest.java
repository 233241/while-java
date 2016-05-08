package lexer.arithmetic;

import lexer.AbstractLexerTest;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class ArithmeticLexerTest extends AbstractLexerTest {
    public ArithmeticLexerTest() {
        LEXER = new ArithmeticLexer();
        NEGATIVE_TESTS = new String[]{"", " a", "var", "(", ") 3", "e4+"};
        POSITIVE_TESTS = new String[]{"34sd+", "+1- 3", "*+d\n", "-2(4)"};
        VALUES = new String[]{"34", "+", "*", "-"};
        RESTS = new String[]{"sd+", "1- 3", "+d\n", "2(4)"};
    }
}