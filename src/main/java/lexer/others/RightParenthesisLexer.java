package lexer.others;

import lexer.essentials.DecoratedLexer;
import lexer.essentials.SingleCharLexer;
import lexer.factory.ArithmeticFactory;
import lexer.factory.EssentialFactory;
import lexer.factory.OthersFactory;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class RightParenthesisLexer extends DecoratedLexer {
    public RightParenthesisLexer() {
        super(new SingleCharLexer(')', new OthersFactory(), "RIGHT_PARENTHESIS"));
    }
}
