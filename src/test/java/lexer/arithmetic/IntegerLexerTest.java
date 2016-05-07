package lexer.arithmetic;

import lexer.AbstractLexerTest;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class IntegerLexerTest extends AbstractLexerTest {
    public IntegerLexerTest() {
        LEXER = new IntegerLexer();
        NEGATIVE_TESTS = new String[]{"", " 0", "+3", "-2 /", " 45a 6", "b4a/ "};
        POSITIVE_TESTS = new String[]{"0", "7", "30", "26", "3001", "0 12", "11ac", "7010   u", "00", "012"};
        VALUES = new String[]{"0", "7", "30", "26", "3001", "0", "11", "7010", "0", "0"};
        RESTS = new String[]{"", "", "", "", "", " 12", "ac", "   u", "0", "12"};
    }
}