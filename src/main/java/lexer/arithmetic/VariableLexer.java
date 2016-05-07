package lexer.arithmetic;

import essentials.Functions;
import essentials.Pair;
import lexer.essentials.*;
import lexer.factory.ArithmeticFactory;
import lexer.factory.EssentialFactory;
import parser.essentials.IToken;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class VariableLexer extends DecoratedLexer {
    public VariableLexer() {
        super(new AndLexer(
                new CharLexer(Character::isLowerCase, new ArithmeticFactory(), "VAR"),
                new WhileLexer(
                        new OrLexer(
                                new CharLexer(Character::isAlphabetic, new ArithmeticFactory(), "VAR"),
                                new CharLexer(Character::isDigit, new ArithmeticFactory(), "VAR")))));
    }

    @Override
    public Pair<List<IToken>, List<Character>> eval(List<Character> text) {
        Pair<List<IToken>, List<Character>> result = lexer.eval(text);

        if (result == null)
            return null;

        IToken token = Functions.merge(new ArithmeticFactory(), "VAR", result.x);

        List<IToken> list = new ArrayList<>();
        list.add(token);

        return new Pair<>(list, result.y);
    }
}
