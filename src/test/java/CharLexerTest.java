//package test;
//
//import essentials.Pair;
//import lexer.essentials.CharLexer;
//import org.junit.Assert;
//import parser.essentials.IToken;
//import parser.essentials.Token;
//
//import java.util.List;
//
//import static essentials.Functions.convert;
//
///**
// * Created on 30.04.16.
// *
// * @author m
// */
//public class CharLexerTest {
//    @org.junit.Test
//    public void singleWhiteSpaceTest() {
//        CharLexer lexer = new CharLexer(Character::isWhitespace, new Token());
//        String[] positiveTests = new String[]{" ", "\t", "\n"};
//        String[] negativeTests = new String[]{"0", "a", "_", "F"};
//
//        for (String text : positiveTests) {
//            Pair<List<IToken>, List<Character>> result = lexer.eval(convert(text));
//            Assert.assertTrue(result.y.isEmpty());
//            Assert.assertEquals(result.x.size(), 1);
//            Assert.assertTrue(result.x.get(0).getValue().equals(text));
//        }
//
//        for (String text : negativeTests) {
//            Pair<List<IToken>, List<Character>> result = lexer.eval(convert(text));
//            Assert.assertEquals(result, null);
//        }
//    }
//
//    public void singleWhiteSpaceTest() {
//        CharLexer lexer = new CharLexer(Character::isWhitespace, new Token());
//        String[] positiveTests = new String[]{" ", "\t", "\n"};
//        String[] negativeTests = new String[]{"0", "a", "_", "F"};
//
//        for (String text : positiveTests) {
//            Pair<List<IToken>, List<Character>> result = lexer.eval(convert(text));
//            Assert.assertTrue(result.y.isEmpty());
//            Assert.assertEquals(result.x.size(), 1);
//            Assert.assertTrue(result.x.get(0).getValue().equals(text));
//        }
//
//        for (String text : negativeTests) {
//            Pair<List<IToken>, List<Character>> result = lexer.eval(convert(text));
//            Assert.assertEquals(result, null);
//        }
//    }
//
//    @org.junit.Test
//    public void negativeTests() {
//    }
//}