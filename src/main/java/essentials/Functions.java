package essentials;

import lexer.TokenFactory;
import main.TokenType;
import parser.essentials.IToken;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 30.04.16.
 * essential functions
 *
 * @author m
 */
public final class Functions {
    private Functions() {
    }

    /**
     * @param text text to convert
     * @return list of characters in text
     */
    public static List<Character> convert(String text) {
        ArrayList<Character> list = new ArrayList<>();
        for (Character ch : text.toCharArray())
            list.add(ch);

        return list;
    }

    /**
     * //     * @param factory factory producing tokens type tokenType
     *
     * @param type   type of returned token
     * @param tokens list to merging
     * @return token whose value is concat of tokens values
     */
    public static IToken merge(TokenType type, List<IToken> tokens) {
        String value = tokens
                .stream()
                .map(IToken::getValue)
                .reduce(String::concat)
                .orElse("");

        return TokenFactory.make(type, value);
    }
}
