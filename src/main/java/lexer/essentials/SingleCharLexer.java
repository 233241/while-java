package lexer.essentials;

import main.TokenType;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class SingleCharLexer extends DecoratedLexer {
    public SingleCharLexer(Character c, TokenType type) {
        super(new CharLexer(ch -> c == ch, type));
    }
}
