package essentials;

import lexer.factory.IFactory;
import parser.essentials.IToken;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public final class Functions {
    private Functions() { }

    public static List<Character> convert(String text) {
        if (text == null)
            return null;

        ArrayList<Character> list = new ArrayList<>();
        for (Character ch : text.toCharArray())
            list.add(ch);

        return list;
    }

    public static IToken merge(IFactory<IToken> factory, String tokenType, List<IToken> tokens) {
        IToken result = factory.make(tokenType);

        String newValue = tokens
                .stream()
                .map(IToken::getValue)
                .reduce(String::concat)
                .orElse(null);
        result.setValue(newValue);

        return result;
    }
}
