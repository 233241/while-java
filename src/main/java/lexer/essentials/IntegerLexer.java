package lexer.essentials;

import main.TokenType;

/**
 * Created on 29.04.16.
 *
 * @author m
 */
public class IntegerLexer extends DecoratedMergedLexer {
    public IntegerLexer() {
        super(new OrLexer(
                new CharsSequenceLexer("0", TokenType.INT),
                new AndLexer(
                        new CharLexer((c) -> c >= '1' && c <= '9', TokenType.INT),
                        new WhileLexer(
                                new CharLexer(Character::isDigit, TokenType.INT)))), TokenType.INT);
    }
}
