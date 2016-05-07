package lexer.essentials;

import essentials.Pair;
import parser.essentials.IToken;

import java.util.List;

/**
 * Created on 29.04.16.
 *
 * @author m
 */
public class OrLexer implements ILexer {
    private final ILexer[] lexers;

    public OrLexer(ILexer ... lexers) {
        this.lexers = lexers;
    }

    @Override
    public Pair<List<IToken>, List<Character>> eval(List<Character> text) {
        for (ILexer lexer : lexers) {
            Pair<List<IToken>, List<Character>> result = lexer.eval(text);
            if (result != null)
                return result;
        }

        return null;
    }
}
