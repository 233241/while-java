package lexer.logic;

import lexer.essentials.CharsSequenceLexer;
import lexer.essentials.DecoratedLexer;
import lexer.essentials.OrLexer;
import lexer.factory.LogicFactory;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class BooleanLexer extends DecoratedLexer {
    public BooleanLexer() {
        super(new OrLexer(
                new CharsSequenceLexer("TRUE", new LogicFactory(), "BOOL"),
                new CharsSequenceLexer("FALSE", new LogicFactory(), "BOOL")));
    }
}


// TODO: 08.05.16  ==
// TODO: 08.05.16  !=
// TODO: 08.05.16  <
// TODO: 08.05.16  <=
// TODO: 08.05.16  >
// TODO: 08.05.16  >=
// TODO: 08.05.16  &&
// TODO: 08.05.16  ||
// TODO: 08.05.16 LogicLexer
// TODO: 08.05.16
// TODO: 08.05.16 test
// TODO: 08.05.16 lexer
// TODO: 08.05.16 fabryka
// TODO: 08.05.16
// TODO: 08.05.16  pamietac o kolejnosci np. aby lexer <= byl przed <, ++ przed + czyli lekser bedzie zachlanny

