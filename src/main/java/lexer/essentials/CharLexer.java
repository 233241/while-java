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
 * simple token template
 * @author m
 */
public class CharLexer implements ILexer {
    private final Predicate<Character> predicate;
    private final IFactory<IToken> factory;
    private final String tokenName;

    /**
     * @param predicate predicate which token have to matches
     * @param factory factory able to create token of type tokenType
     * @param tokenName type of returned token
     */
    public CharLexer(Predicate<Character> predicate, IFactory<IToken> factory, String tokenName) {
        this.predicate = predicate;
        this.factory = factory;
        this.tokenName = tokenName;
    }

    /**
     * @param text data input
     * @return  pair contains list with token and rest of input data if first character of text matches predicate
     *          null if text is empty or first character of text not matches predicate
     */
    @Override
    public Pair<List<IToken>, List<Character>> eval(List<Character> text) {
        if (text.isEmpty())
            return null;

        Character ch = text.get(0);

        if (predicate.test(ch)) {
            List<IToken> list = produceList(ch);
            return new Pair<>(list, text.subList(1, text.size()));
        }

        return null;
    }

    /**
     * @param ch text value of token on the list
     * @return list with exactly one token
     */
    private List<IToken> produceList(Character ch) {
        List<IToken> list = new ArrayList<>();
        IToken token = factory.make(tokenName);
        token.setValue(String.valueOf(ch));
        list.add(token);
        return list;
    }
}
