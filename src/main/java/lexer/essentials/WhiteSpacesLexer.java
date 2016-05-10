package lexer.essentials;

import main.TokenType;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class WhiteSpacesLexer extends DecoratedMergedLexer {
    public WhiteSpacesLexer() {
        super(new AndLexer(
                new CharLexer(Character::isWhitespace, TokenType.WHITE_SPACES),
                new WhileLexer(
                        new CharLexer(Character::isWhitespace, TokenType.WHITE_SPACES))), TokenType.WHITE_SPACES);
    }
}
