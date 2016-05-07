package lexer.essentials;

import essentials.Functions;
import essentials.Pair;
import lexer.factory.ArithmeticFactory;
import lexer.factory.EssentialFactory;
import lexer.factory.IFactory;
import parser.essentials.IToken;
import parser.essentials.WhiteSpacesToken;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class WhiteSpacesLexer extends DecoratedLexer {
    public WhiteSpacesLexer() {
        super(new AndLexer(
                new CharLexer(Character::isWhitespace, new EssentialFactory(), "SPACE"),
                new WhileLexer(
                        new CharLexer(Character::isWhitespace, new EssentialFactory(), "SPACE"))));
    }

    @Override
    public Pair<List<IToken>, List<Character>> eval(List<Character> text) {
        Pair<List<IToken>, List<Character>> result = lexer.eval(text);

        if (result == null)
            return null;

        IToken token = Functions.merge(new EssentialFactory(), "SPACE", result.x);

        List<IToken> list = new ArrayList<>();
        list.add(token);

        return new Pair<>(list, result.y);
    }
}
