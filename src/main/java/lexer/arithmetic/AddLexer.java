package lexer.arithmetic;

import lexer.essentials.CharsSequenceLexer;
import lexer.essentials.DecoratedLexer;
import lexer.essentials.SingleCharLexer;
import lexer.factory.ArithmeticFactory;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class AddLexer extends DecoratedLexer {
    public AddLexer() {
        super(new CharsSequenceLexer("+", new ArithmeticFactory(), "ADD"));
    }
}
