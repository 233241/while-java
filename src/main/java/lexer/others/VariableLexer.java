package lexer.others;

import lexer.essentials.*;
import lexer.factory.ArithmeticFactory;
import lexer.factory.OthersFactory;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class VariableLexer extends DecoratedMergedLexer {
    public VariableLexer() {
        super(new AndLexer(
                new CharLexer(Character::isLowerCase, new OthersFactory(), "VAR"),
                new WhileLexer(
                        new OrLexer(
                                new CharLexer(Character::isAlphabetic, new OthersFactory(), "VAR"),
                                new CharLexer(Character::isDigit, new OthersFactory(), "VAR")))), new OthersFactory(), "VAR");
    }

//    @Override
//    public Pair<List<IToken>, List<Character>> eval(List<Character> text) {
//        Pair<List<IToken>, List<Character>> result = lexer.eval(text);
//
//        if (result == null)
//            return null;
//
//        IToken token = Functions.merge(new ArithmeticFactory(), "VAR", result.x);
//
//        List<IToken> list = new ArrayList<>();
//        list.add(token);
//
//        return new Pair<>(list, result.y);
//    }
}
