package test;

import essentials.Pair;
import lexer.arithmetic.VariableLexer;
import org.junit.Assert;
import parser.essentials.IToken;
import java.util.List;
import static essentials.Functions.convert;

/**
 * Created on 01.05.16.
 *
 * @author m
 */
public class VariableLexerTest {
    private static final VariableLexer LEXER = new VariableLexer();
    private static final String[] NEGATIVE_TESTS = new String[] {"F", "", "3", "3c", " 0", " x", "+3", "-x2 /", "45a 6", "2b4a/ "};
    private static final String[] POSITIVE_TESTS = new String[] {"a", "f2", "dAta34d", "d7_new", "var + var", "e 34"};
    private static final String[] VALUES = new String[] {"a", "f2", "dAta34d", "d7", "var", "e"};
    private static final String[] RESTS = new String[] {"", "", "", "_new", " + var", " 34"};

    @org.junit.Test
    public void negativeTests() {
        for (String str : NEGATIVE_TESTS) {
            List<Character> chars = convert(str);
            Pair<List<IToken>, List<Character>> result = LEXER.eval(chars);

            Assert.assertEquals(result, null);
        }
    }

    @org.junit.Test
    public void positiveTests() {
        for (int i = 0; i < POSITIVE_TESTS.length; i++) {
            List<Character> chars = convert(POSITIVE_TESTS[i]);
            Pair<List<IToken>, List<Character>> result = LEXER.eval(chars);

            Assert.assertNotEquals(result, null);
            Assert.assertEquals(result.x.size(), 1);
            Assert.assertEquals(result.x.get(0).getValue(), VALUES[i]);

            Character[] restArray = new Character[RESTS[i].length()];
            for (int j = 0; j < restArray.length; j++)
                restArray[j] = RESTS[i].charAt(j);

            Assert.assertArrayEquals(result.y.toArray(new Character[0]), restArray);
        }
    }
}
