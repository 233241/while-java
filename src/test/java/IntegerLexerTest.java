package test;

import essentials.Pair;
import lexer.arithmetic.IntegerLexer;
import org.junit.Assert;
import parser.essentials.IToken;
import java.util.List;
import java.util.concurrent.ExecutorService;

import static essentials.Functions.convert;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class IntegerLexerTest {
    private static final IntegerLexer LEXER = new IntegerLexer();
    private static final String[] NEGATIVE_TESTS = new String[] {"", " 0", "+3", "-2 /", " 45a 6", "b4a/ "};
    private static final String[] POSITIVE_TESTS = new String[] {"0", "7", "30", "26", "3001", "0 12", "11ac", "7010   u", "00", "012"};
    private static final String[] VALUES = new String[] {"0", "7", "30", "26", "3001", "0", "11", "7010", "0", "0"};
    private static final String[] RESTS = new String[] {"", "", "", "", "", " 12", "ac", "   u", "0", "12"};

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
