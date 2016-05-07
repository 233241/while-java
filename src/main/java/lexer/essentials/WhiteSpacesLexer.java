package lexer.essentials;

import lexer.factory.EssentialFactory;

/**
 * Created on 30.04.16.
 *
 * @author m
 */
public class WhiteSpacesLexer extends DecoratedMergedLexer {
    public WhiteSpacesLexer() {
        super(new AndLexer(
                new CharLexer(Character::isWhitespace, new EssentialFactory(), "SPACE"),
                new WhileLexer(
                        new CharLexer(Character::isWhitespace, new EssentialFactory(), "SPACE"))), new EssentialFactory(), "SPACE");
    }

//    @Override
//    public Pair<List<IToken>, List<Character>> eval(List<Character> text) {
//        Pair<List<IToken>, List<Character>> result = lexer.eval(text);
//
//        if (result == null)
//            return null;
//
//        IToken token = Functions.merge(new EssentialFactory(), "SPACE", result.x);
//
//        List<IToken> list = new ArrayList<>();
//        list.add(token);
//
//        return new Pair<>(list, result.y);
//    }
}
