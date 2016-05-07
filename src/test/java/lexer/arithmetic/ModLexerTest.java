package lexer.arithmetic;

import lexer.AbstractLexerTest;

import static org.junit.Assert.*;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class ModLexerTest extends AbstractLexerTest {
    public ModLexerTest() {
        LEXER = new ModLexer();
        NEGATIVE_TESTS = new String[] {"", "a", " ", "-+ ", "0++"};
        POSITIVE_TESTS = new String[] {"%", "%-+", "%%45%% as", "% "};
        VALUES = new String[] {"%", "%", "%", "%"};
        RESTS = new String[] {"", "-+", "%45%% as", " "};
    }
}