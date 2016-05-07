package lexer.essentials;

import essentials.Functions;
import essentials.Pair;
import lexer.factory.IFactory;
import parser.essentials.IToken;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public abstract class DecoratedMergedLexer extends DecoratedLexer {
    private final String tokenName;
    private final IFactory<IToken> factory;

    protected DecoratedMergedLexer(ILexer lexer, IFactory<IToken> factory, String tokenName) {
        super(lexer);
        this.factory = factory;
        this.tokenName = tokenName;
    }

    @Override
    public Pair<List<IToken>, List<Character>> eval(List<Character> text) {
        Pair<List<IToken>, List<Character>> result = lexer.eval(text);

        if (result == null)
            return null;

        IToken token = Functions.merge(factory, tokenName, result.x);

        List<IToken> list = new ArrayList<>();
        list.add(token);

        return new Pair<>(list, result.y);
    }
}
