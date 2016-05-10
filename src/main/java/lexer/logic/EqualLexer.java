package lexer.logic;

import lexer.essentials.CharsSequenceLexer;
import lexer.essentials.DecoratedLexer;
import lexer.factory.LogicFactory;

/**
 * Created on 10.05.16.
 *
 * @author m
 */
public class EqualLexer extends DecoratedLexer {
    public EqualLexer() {
        super(new CharsSequenceLexer("==", new LogicFactory(), "EQUAL"));
    }
}