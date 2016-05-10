package lexer.logic;

import lexer.AbstractLexerTest;

/**
 * Created on 10.05.16.
 *
 * @author m
 */
public class BoolOrTest extends AbstractLexerTest {
    public BoolOrTest() {
        LEXER = new BoolOrLexer();
        NEGATIVE_TESTS = new String[]{"", "a", "|", "|+| ", "0||+!!+"};
        POSITIVE_TESTS = new String[]{"||", "|||", "||+ || && t"};
        VALUES = new String[]{"||", "||", "||"};
        RESTS = new String[]{"", "|", "+ || && t"};
    }
}
