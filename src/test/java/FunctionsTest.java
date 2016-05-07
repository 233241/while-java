package test;

import essentials.Functions;
import lexer.factory.ArithmeticFactory;
import lexer.factory.EssentialFactory;
import org.junit.Assert;
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
    @org.junit.Test
    public void convertNullTest() {
        String text = null;
        List<Character> list = convert(text);
        Assert.assertEquals(list, null);
    }

    @org.junit.Test
    public void convertEmptyTest() {
        String text = "";
        List<Character> list = convert(text);
        Assert.assertTrue(list.isEmpty());
    }

    @org.junit.Test
    public void convertNormalTest() {
        String text = " /n  a*9 (b cd ";
        List<Character> list = convert(text);

        Assert.assertEquals(text.length(), list.size());
        for (int i = 0; i < text.length(); i++) {
            Character ch = text.toCharArray()[i];
            Assert.assertEquals(ch, list.get(i));
        }
    }

    @org.junit.Test
    public void mergeEmptyTest() {
        ArithmeticFactory factory = new ArithmeticFactory();
        String tokenType = "VAR";
        IToken token = Functions.merge(factory, tokenType, new ArrayList<>());
        Assert.assertEquals(null, token.getValue());
    }

    @org.junit.Test
    public void mergeNormalTest() {
        ArithmeticFactory factory = new ArithmeticFactory();
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




