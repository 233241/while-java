package lexer.essentials;

import essentials.Pair;
import lexer.factory.IFactory;
import parser.essentials.IToken;
import parser.essentials.Token;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created on 29.04.16.
 *
 * @author m
 */
public class CharLexer implements ILexer {
    private final Predicate<Character> predicate;
    private final IFactory<IToken> factory;
    private final String tokenName;

    public CharLexer(Predicate<Character> predicate, IFactory<IToken> factory, String tokenName) {
        this.predicate = predicate;
        this.factory = factory;
        this.tokenName = tokenName;
    }

    @Override
    public Pair<List<IToken>, List<Character>> eval(List<Character> text) {
        if (text.isEmpty())
            return null;

        Character ch = text.get(0);

        if (predicate.test(ch)) {
            List<IToken> list = new ArrayList<>();
            IToken token = factory.make(tokenName);
            token.setValue(String.valueOf(ch));
//            token.setValue(String.valueOf(ch));
//            list.add(new Token(String.valueOf(ch)));
            list.add(token);
            return new Pair<>(list, text.subList(1, text.size()));
        }

        return null;
    }
}
