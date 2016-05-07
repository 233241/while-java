package lexer.arithmetic;

import lexer.essentials.DecoratedLexer;
import lexer.essentials.SingleCharLexer;
import lexer.factory.ArithmeticFactory;
import parser.arithmetic.MultToken;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class MultLexer extends DecoratedLexer {
    public MultLexer() {
        super(new SingleCharLexer('*', new ArithmeticFactory(), "MULT"));
    }
}
