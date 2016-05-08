package lexer.arithmetic;

import lexer.essentials.CharsSequenceLexer;
import lexer.essentials.DecoratedLexer;
import lexer.essentials.SingleCharLexer;
import lexer.factory.ArithmeticFactory;
import parser.arithmetic.SubToken;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class SubLexer extends DecoratedLexer {
    protected SubLexer() {
        super(new CharsSequenceLexer("-", new ArithmeticFactory(), "SUB"));
    }
}
