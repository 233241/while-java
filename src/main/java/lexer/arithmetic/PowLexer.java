package lexer.arithmetic;

import lexer.essentials.CharsSequenceLexer;
import lexer.essentials.DecoratedLexer;
import lexer.factory.ArithmeticFactory;

/**
 * Created on 10.05.16.
 *
 * @author m
 */
public class PowLexer extends DecoratedLexer {
    public PowLexer() {
        super(new CharsSequenceLexer("^", new ArithmeticFactory(), "POW"));
    }
}
