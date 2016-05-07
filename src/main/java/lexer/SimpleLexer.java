package lexer;

import essentials.Pair;
import lexer.essentials.ILexer;
import parser.essentials.IToken;
import java.util.List;

/**
 * Created on 29.04.16.
 *
 * @author m
 */
public class SimpleLexer implements ILexer {
    private final IToken token;
    private final String pattern;

    public SimpleLexer(IToken token, String pattern) {
        this.token = token;
        this.pattern = pattern;
    }

    @Override
    public Pair<List<IToken>, List<Character>> eval(List<Character> text) {
//        if (text.startsWith(pattern)) {
//            List<IToken> list = list = new ArrayList<>();
//            list.add(token);
//            text = text.substring(pattern.length());
//            return new Pair<>(list, text);
//        }

        return null;
    }
}
