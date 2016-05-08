package essentials;

import lexer.factory.ArithmeticFactory;
import lexer.factory.IFactory;
import lexer.factory.OthersFactory;
import org.junit.Assert;
import org.junit.Test;
import parser.arithmetic.IntegerToken;
import parser.essentials.IToken;
import java.util.ArrayList;
import java.util.List;
import static essentials.Functions.convert;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class FunctionsTest {
    @Test(expected = NullPointerException.class)
    public void convertNullTest() {
        String text = null;

        convert(text);
    }

    @Test
    public void convertEmptyTest() {
        String text = "";

        List<Character> list = convert(text);

        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void convertNormalTest() {
        String text = " /n  a*9 (b cd ";

        List<Character> list = convert(text);
        String newText = list.stream()
                .map(String::valueOf)
                .reduce((a, b) -> a + b)
                .orElse(null);

        Assert.assertEquals(text, newText);
    }

    @Test
    public void mergeEmptyTest() {
        IFactory<IToken> factory = new OthersFactory();
        String tokenType = "VAR";
        List<IToken> tokenList = new ArrayList<>();

        IToken token = Functions.merge(factory, tokenType, tokenList);

        Assert.assertEquals("", token.getValue());
    }

    @Test
    public void mergeNormalTest() {
        IFactory<IToken> factory = new OthersFactory();
        String tokenType = "VAR";
        List<IToken> list = new ArrayList<>();

        IntegerToken[] tokens = new IntegerToken[5];
        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = new IntegerToken();
            tokens[i].setValue(String.valueOf(i * i));
            list.add(tokens[i]);
        }
        IToken token = Functions.merge(factory, tokenType, list);

        Assert.assertEquals("014916", token.getValue());
    }
}




