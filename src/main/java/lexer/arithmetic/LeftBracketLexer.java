package lexer.arithmetic;

import lexer.essentials.DecoratedLexer;
import lexer.essentials.SingleCharLexer;
import lexer.factory.ArithmeticFactory;
import lexer.factory.EssentialFactory;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class LeftBracketLexer extends DecoratedLexer {
    public LeftBracketLexer() {
        super(new SingleCharLexer('(', new ArithmeticFactory(), "LEFT"));
    }
}
