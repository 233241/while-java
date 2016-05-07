package lexer.arithmetic;

import lexer.essentials.DecoratedLexer;
import lexer.essentials.SingleCharLexer;
import lexer.factory.ArithmeticFactory;
import parser.arithmetic.ModToken;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class ModLexer extends DecoratedLexer {
    public ModLexer() {
        super(new SingleCharLexer('%', new ArithmeticFactory(), "MOD"));
    }
}
