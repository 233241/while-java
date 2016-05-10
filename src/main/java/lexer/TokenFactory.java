package lexer;

import main.TokenType;
import parser.essentials.IToken;
import parser.essentials.Token;

/**
 * Created on 10.05.16.
 *
 * @author m
 */
public abstract class TokenFactory {
    public static IToken make(TokenType type, String value) {
        return new Token(type, value);
    }
}
