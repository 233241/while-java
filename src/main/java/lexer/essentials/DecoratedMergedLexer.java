package lexer.essentials;

import essentials.Functions;
import essentials.Pair;
import lexer.TokenFactory;
import main.TokenType;
import parser.essentials.IToken;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public abstract class DecoratedMergedLexer extends DecoratedLexer {
    private final TokenType type;

    protected DecoratedMergedLexer(ILexer lexer, TokenType type) {
        super(lexer);
        this.type = type;
    }

    @Override
    public Pair<List<IToken>, List<Character>> eval(List<Character> text) {
        Pair<List<IToken>, List<Character>> result = lexer.eval(text);

        if (result == null)
            return null;

        IToken token = Functions.merge(type, result.x);

        List<IToken> list = new ArrayList<>();
        list.add(token);

        return new Pair<>(list, result.y);
    }
}
