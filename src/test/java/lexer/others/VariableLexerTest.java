package lexer.others;

import lexer.AbstractLexerTest;
import lexer.others.VariableLexer;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class VariableLexerTest extends AbstractLexerTest {
    public VariableLexerTest() {
        LEXER = new VariableLexer();
        NEGATIVE_TESTS = new String[]{"F", "", "3", "3c", " 0", " x", "+3", "-x2 /", "45a 6", "2b4a/ "};
        POSITIVE_TESTS = new String[]{"a", "f2", "dAta34d", "d7_new", "var + var", "e 34"};
        VALUES = new String[]{"a", "f2", "dAta34d", "d7", "var", "e"};
        RESTS = new String[]{"", "", "", "_new", " + var", " 34"};
    }
}