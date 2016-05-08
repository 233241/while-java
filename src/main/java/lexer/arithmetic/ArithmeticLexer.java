package lexer.arithmetic;

import lexer.essentials.DecoratedLexer;
import lexer.essentials.OrLexer;
import lexer.others.LeftParenthesisLexer;
import lexer.others.RightParenthesisLexer;
import lexer.others.VariableLexer;

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
                new ModLexer(),
                new MulLexer(),
                new SubLexer()));
    }
}
