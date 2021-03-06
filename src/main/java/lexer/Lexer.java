package lexer;

import lexer.arithmetic.ArithmeticLexer;
import lexer.essentials.*;
import lexer.others.OthersLexer;

/**
 * Created on 01.05.16.
 *
 * @author m
 */
public class Lexer extends DecoratedLexer {
    public Lexer() {
        super(new WhileLexer(
                new OrLexer(
                        new ArithmeticLexer(),
                        new OthersLexer())));
    }
}
