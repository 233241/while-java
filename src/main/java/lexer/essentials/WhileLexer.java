package lexer.essentials;

import essentials.Pair;
import lexer.essentials.ILexer;
import parser.essentials.IToken;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 29.04.16.
 *
 * @author m
 */
public class WhileLexer implements ILexer {
    private final ILexer lexer;

    public WhileLexer(ILexer lexer) {
        this.lexer = lexer;
    }

    @Override
    public Pair<List<IToken>, List<Character>> eval(List<Character> text) {
        List<IToken> list = new ArrayList<>();

        int offset = 0;

        Pair<List<IToken>, List<Character>> result = lexer.eval(text.subList(offset, text.size()));
        while (result != null) {
            offset = text.size() - result.y.size();
            list.addAll(result.x);
            result = lexer.eval(text.subList(offset, text.size()));
        }

        return new Pair<>(list, text.subList(offset, text.size()));
    }
}
