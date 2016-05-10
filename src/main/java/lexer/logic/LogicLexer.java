package lexer.logic;

import lexer.essentials.DecoratedLexer;
import lexer.essentials.OrLexer;

/**
 * Created on 10.05.16.
 *
 * @author m
 */
public class LogicLexer extends DecoratedLexer {
    public LogicLexer() {
        super(new OrLexer(
                new BoolLexer(),
                new GreaterEqualLexer(),
                new GreaterLexer(),
                new LessEqualLexer(),
                new LessLexer(),
                new EqualLexer(),
                new NotEqualLexer(),
                new NotLexer(),
                new LogicAndLexer(),
                new LogicOrLexer()));
    }
}
