package lexer.essentials;

import main.TokenType;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class VariableLexer extends DecoratedMergedLexer {
    public VariableLexer() {
        super(new AndLexer(
                new CharLexer(Character::isLowerCase, TokenType.VAR),
                new WhileLexer(
                        new OrLexer(
                                new CharLexer(Character::isAlphabetic, TokenType.VAR),
                                new CharLexer(Character::isDigit, TokenType.VAR)))), TokenType.VAR);
    }
}
