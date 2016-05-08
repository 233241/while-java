//package test.lexer;
//
//import essentials.Pair;
//import lexer.others.WhiteSpacesLexer;
//import org.junit.Assert;
//import parser.essentials.IToken;
//
//import java.util.List;
//
//import static essentials.Functions.convert;
//
///**
// * Created on 01.05.16.
// *
// * @author m
// */
//public class WhitespaceLexerTest {
//    private static final WhiteSpacesLexer LEXER = new WhiteSpacesLexer();
//    private static final String[] NEGATIVE_TESTS = new String[] {"", "1", "2 +", "/ ", "a 6", "_    4a/ "};
//    private static final String[] POSITIVE_TESTS = new String[] {" ", "\t", "\n", " \te", "  r ", "   \n "};
//    private static final String[] VALUES = new String[] {" ", "\t", "\n", " \t", "  ", "   \n "};
//    private static final String[] RESTS = new String[] {"", "", "", "e", "r ", ""};
//
//    @org.junit.Test
//    public void negativeTests() {
//        for (String str : NEGATIVE_TESTS) {
//            List<Character> chars = convert(str);
//            Pair<List<IToken>, List<Character>> result = LEXER.eval(chars);
//
//            Assert.assertEquals(result, null);
//        }
//    }
//
//    @org.junit.Test
//    public void positiveTests() {
//        for (int i = 0; i < POSITIVE_TESTS.length; i++) {
//            List<Character> chars = convert(POSITIVE_TESTS[i]);
//            Pair<List<IToken>, List<Character>> result = LEXER.eval(chars);
//
////            Assert.assertNotEquals(result, null);
//            Assert.assertEquals(result.x.size(), 1);
//            Assert.assertEquals(result.x.get(0).getValue(), VALUES[i]);
//
//            Character[] restArray = new Character[RESTS[i].length()];
//            for (int j = 0; j < restArray.length; j++)
//                restArray[j] = RESTS[i].charAt(j);
//
//            Assert.assertArrayEquals(result.y.toArray(new Character[0]), restArray);
//        }
//    }
//}