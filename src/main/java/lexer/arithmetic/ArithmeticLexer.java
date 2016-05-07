package lexer.arithmetic;

import lexer.essentials.DecoratedLexer;
import lexer.essentials.OrLexer;
import lexer.essentials.WhileLexer;

/**
 * Created on 01.05.16.
 *
 * @author m
 */
public class ArithmeticLexer extends DecoratedLexer {
    public ArithmeticLexer() {
        super(new OrLexer(
                new AddLexer(),
                new DivLexer(),
                new IntegerLexer(),
                new LeftBracketLexer(),
                new ModLexer(),
                new MultLexer(),
                new RightBracketLexer(),
                new SubLexer(),
                new VariableLexer()));
    }
}
