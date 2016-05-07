package lexer;

import essentials.Functions;
import essentials.Pair;
import junit.framework.Assert;
import lexer.essentials.ILexer;
import parser.essentials.IToken;
import java.util.List;

/**
 * Created on 07.05.16.
 *
 * @author m
 */
public abstract class LexerTester {
    public static void negativeTest(ILexer lexer, String[] tests) {
        for (String text : tests) {
            List<Character> input = Functions.convert(text);
            Pair<List<IToken>, List<Character>> result = lexer.eval(input);
            Assert.assertEquals(null, result);
        }
    }

    public static void positiveTest(ILexer lexer, String[] tests, String[] values, String[] rests) {
        for (int i = 0; i < tests.length; i++) {
            List<Character> input = Functions.convert(tests[i]);
            Pair<List<IToken>, List<Character>> result = lexer.eval(input);
            Assert.assertNotNull(result);
            Assert.assertEquals(result.x.size(), 1);
            Assert.assertEquals(values[i], result.x.get(0).getValue());
            Assert.assertEquals(Functions.convert(rests[i]), result.y);
        }
    }
}
