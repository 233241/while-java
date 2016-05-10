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
public class BoolLexer extends DecoratedLexer {
    public BoolLexer() {
        super(new OrLexer(
                new CharsSequenceLexer("TRUE", new LogicFactory(), "BOOL"),
                new CharsSequenceLexer("FALSE", new LogicFactory(), "BOOL")));
    }
}


// TODO: 08.05.16  ==
//lexer
//token
//factory
//booleanLexer
// TODO: 08.05.16  !=
//lexer
//token
//factory
//booleanLexer
// TODO: 08.05.16  <
//lexer
//token
//factory
//booleanLexer
// TODO: 08.05.16  <=
//lexer
//token
//factory
//booleanLexer
// TODO: 08.05.16  >
//lexer
//token
//factory
//booleanLexer
// TODO: 08.05.16  >=
//lexer
//token
//factory
//booleanLexer
// TODO: 08.05.16  &&
//lexer
//token
//factory
//booleanLexer
// TODO: 08.05.16  ||
//lexer
//token
//factory
//booleanLexer
// TODO: 08.05.16 LogicLexer
//lexer
//token
//factory
//booleanLexer
// TODO: 08.05.16 booleanLexer
// TODO: 08.05.16  pamietac o kolejnosci np. aby lexer <= byl przed <, ++ przed + czyli lekser bedzie zachlanny

