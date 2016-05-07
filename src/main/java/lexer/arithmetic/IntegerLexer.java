package lexer.arithmetic;

import essentials.Functions;
import essentials.Pair;
import lexer.essentials.*;
import lexer.factory.ArithmeticFactory;
import lexer.factory.IFactory;
import parser.essentials.IToken;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 29.04.16.
 *
 * @author m
 */
public class IntegerLexer extends DecoratedLexer {
    public IntegerLexer() {
        super(new OrLexer(
                        new SingleCharLexer('0', new ArithmeticFactory(), "INT"),
                        new AndLexer(
                                new CharLexer((c) -> c >= '1' && c <= '9', new ArithmeticFactory(), "INT"),
                                new WhileLexer(
                                        new CharLexer(Character::isDigit, new ArithmeticFactory(), "INT")))));
    }

    @Override
    public Pair<List<IToken>, List<Character>> eval(List<Character> text) {
        Pair<List<IToken>, List<Character>> result = lexer.eval(text);

        if (result == null)
            return null;

        IToken token = Functions.merge(new ArithmeticFactory(), "INT", result.x);

        List<IToken> list = new ArrayList<>();
        list.add(token);

        return new Pair<>(list, result.y);
    }
}
