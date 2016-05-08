package lexer.others;

import lexer.essentials.CharsSequenceLexer;
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
public class LeftParenthesisLexer extends DecoratedLexer {
    public LeftParenthesisLexer() {
        super(new CharsSequenceLexer("(", new OthersFactory(), "LEFT_PARENTHESIS"));
    }
}
