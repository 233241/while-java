package lexer.arithmetic;

import lexer.essentials.CharsSequenceLexer;
import lexer.essentials.DecoratedLexer;
import lexer.essentials.SingleCharLexer;
import lexer.factory.ArithmeticFactory;
import parser.arithmetic.DivToken;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class DivLexer extends DecoratedLexer {
    public DivLexer() {
        super(new CharsSequenceLexer("/", new ArithmeticFactory(), "DIV"));
    }
}
