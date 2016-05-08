package lexer.essentials;

import essentials.Functions;
import lexer.factory.IFactory;
import parser.essentials.IToken;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class CharsSequenceLexer extends DecoratedMergedLexer {
    public CharsSequenceLexer(String charsSequence, IFactory<IToken> factory, String tokenName) {
        super(buildLexer(charsSequence, factory, tokenName),
                factory,
                tokenName);
    }

    private static AndLexer buildLexer(String charsSequence, IFactory<IToken> factory, String tokenName) {
        return new AndLexer(Functions
                        .convert(charsSequence)
                        .stream()
                        .map(c -> new SingleCharLexer(c, factory, tokenName))
                        .toArray(ILexer[]::new));
    }
}
