package lexer.logic;

import lexer.essentials.CharsSequenceLexer;
import lexer.essentials.DecoratedLexer;
import lexer.essentials.SingleCharLexer;
import lexer.factory.ArithmeticFactory;
import lexer.factory.LogicFactory;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class NotLexer extends DecoratedLexer {
    public NotLexer() {
        super(new CharsSequenceLexer("!", new LogicFactory(), "NOT"));
    }
}
