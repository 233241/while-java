package lexer.arithmetic;

import lexer.AbstractLexerTest;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class DivLexerTest extends AbstractLexerTest {
    public DivLexerTest() {
        LEXER = new DivLexer();
        NEGATIVE_TESTS = new String[] {"", "a", " ", "-+ ", "0++"};
        POSITIVE_TESTS = new String[] {"/", "/-+", "//45 as", "// //a"};
        VALUES = new String[] {"/", "/", "/", "/"};
        RESTS = new String[] {"", "-+", "/45 as", "/ //a"};
    }
}