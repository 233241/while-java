package lexer.others;

import lexer.essentials.DecoratedLexer;
import lexer.essentials.OrLexer;

/**
 * Created on 01.05.16.
 *
 * @author m
 */
public class OthersLexer extends DecoratedLexer {
    public OthersLexer() {
        super(new OrLexer(
                new WhiteSpacesLexer(),
                new LeftParenthesisLexer(),
                new RightParenthesisLexer(),
                new WhiteSpacesLexer()));
    }
}