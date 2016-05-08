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
        NEGATIVE_TESTS = new String[]{""};//{"", "1", "2 +", "/ ", "a 6", "_    4a/ "};
        POSITIVE_TESTS = new String[]{};//{" ", "\t", "\n", " \te", "  r ", "   \n "};
        VALUES = new String[]{};//{" ", "\t", "\n", " \t", "  ", "   \n "};
        RESTS = new String[]{};//{"", "", "", "e", "r ", ""};
    }
}
// TODO: 08.05.16 po przeniesieniu var i bracketow do others zmienic testy