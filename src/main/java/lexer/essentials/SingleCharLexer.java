package lexer.essentials;

import lexer.factory.IFactory;
import parser.essentials.IToken;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class SingleCharLexer extends DecoratedLexer {
    public SingleCharLexer(Character c, IFactory<IToken> factory, String tokenName) {
        super(new CharLexer(ch -> c == ch , factory, tokenName));
    }
}
