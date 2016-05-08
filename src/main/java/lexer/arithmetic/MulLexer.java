package lexer.arithmetic;

import lexer.essentials.CharsSequenceLexer;
import lexer.essentials.DecoratedLexer;
import lexer.factory.ArithmeticFactory;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class MulLexer extends DecoratedLexer {
    public MulLexer() {
        super(new CharsSequenceLexer("*", new ArithmeticFactory(), "MUL"));
    }
}
