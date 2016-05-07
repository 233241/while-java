package test;

import essentials.Pair;
import lexer.arithmetic.AddLexer;
import org.junit.Assert;
import parser.essentials.IToken;
import java.util.List;
import static essentials.Functions.convert;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class AddLexerTest {
    private static final AddLexer LEXER = new AddLexer();;
    private static final String[] NEGATIVE_TESTS = new String[] {"", "1", "2+", " +", "a 6", "4a+ "};
    private static final String[] POSITIVE_TESTS = new String[] {"+", "+ 12", "++", "+  ", "+a 6", "+4a+ "};

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
        for (String str : POSITIVE_TESTS) {
            List<Character> chars = convert(str);
            Pair<List<IToken>, List<Character>> result = LEXER.eval(chars);

            Assert.assertNotEquals(result, null);
            Assert.assertEquals(result.x.size(), 1);
            Assert.assertEquals(result.x.get(0).getValue(), "+");
            Assert.assertEquals(result.y.size(), chars.size() - 1);
        }
    }
}