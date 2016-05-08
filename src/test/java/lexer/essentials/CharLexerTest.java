package lexer.essentials;

import lexer.LexerTester;
import lexer.factory.ArithmeticFactory;
import lexer.factory.OthersFactory;
import org.junit.Test;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class CharLexerTest {
    private ILexer LEXER_DIGIT = new CharLexer(Character::isDigit, new OthersFactory(), "VAR");
    private ILexer LEXER_WHITESPACE = new CharLexer(Character::isWhitespace, new OthersFactory(), "VAR");
    private ILexer LEXER_A = new CharLexer(c -> c == 'A', new OthersFactory(), "VAR");

    private String[] POSITIVE_TESTS_DIGIT = new String[] {"1 ", "34s fg", "3"};
    private String[] NEGATIVE_TESTS_DIGIT = new String[] {"", "a", " 45"};
    private String[] VALUES_DIGIT = new String[] {"1", "3", "3"};
    private String[] RESTS_DIGIT = new String[] {" ", "4s fg", ""};

    private String[] POSITIVE_TESTS_WHITESPACE = new String[] {" ", "\n d", "\t", "\tdf r"};
    private String[] NEGATIVE_TESTS_WHITESPACE = new String[] {"", "a", "4  5"};
    private String[] VALUES_WHITESPACE = new String[] {" ", "\n", "\t", "\t"};
    private String[] RESTS_WHITESPACE = new String[] {"", " d", "", "df r"};

    private String[] POSITIVE_TESTS_A = new String[] {"A", "A8c8c 0x"};
    private String[] NEGATIVE_TESTS_A = new String[] {"", "a", "1A", " dsA"};
    private String[] VALUES_A = new String[] {"A", "A"};
    private String[] RESTS_A = new String[] {"", "8c8c 0x"};

    @Test
    public void positiveTests() {
        LexerTester.positiveTest(LEXER_DIGIT, POSITIVE_TESTS_DIGIT, VALUES_DIGIT, RESTS_DIGIT);
        LexerTester.positiveTest(LEXER_WHITESPACE, POSITIVE_TESTS_WHITESPACE, VALUES_WHITESPACE, RESTS_WHITESPACE);
        LexerTester.positiveTest(LEXER_A, POSITIVE_TESTS_A, VALUES_A, RESTS_A);
    }

    @Test
    public void negativeTests() {
        LexerTester.negativeTest(LEXER_DIGIT, NEGATIVE_TESTS_DIGIT);
        LexerTester.negativeTest(LEXER_WHITESPACE, NEGATIVE_TESTS_WHITESPACE);
        LexerTester.negativeTest(LEXER_A, NEGATIVE_TESTS_A);
    }
}