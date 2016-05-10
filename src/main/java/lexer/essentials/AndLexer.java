package lexer.essentials;

import parser.essentials.IToken;
import essentials.Pair;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 29.04.16.
 *
 * @author m
 */
public class AndLexer implements ILexer {
    private final ILexer[] lexers;

    public AndLexer(ILexer ... lexers) {
        this.lexers = lexers;
    }

    @Override
    public Pair<List<IToken>, List<Character>> eval(List<Character> text) {
        List<IToken> list = new ArrayList<>();

        int offset = 0;

        for (ILexer lexer : lexers) {
            Pair<List<IToken>, List<Character>> result = lexer.eval(text.subList(offset, text.size()));

            if (result == null)
                return null;

            list.addAll(result.x);
            offset = text.size() - result.y.size();
        }

        return new Pair<>(list, text.subList(offset, text.size()));
    }
}
