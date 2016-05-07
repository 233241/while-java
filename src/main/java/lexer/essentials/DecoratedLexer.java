package lexer.essentials;

import essentials.Pair;
import parser.essentials.IToken;
import java.util.List;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public abstract class DecoratedLexer implements ILexer {
    protected final ILexer lexer;

    protected DecoratedLexer(ILexer lexer) {
        this.lexer = lexer;
    }

    @Override
    public Pair<List<IToken>, List<Character>> eval(List<Character> text) {
        return lexer.eval(text);
    }
}
