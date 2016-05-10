package lexer.essentials;

import essentials.Functions;
import main.TokenType;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class CharsSequenceLexer extends DecoratedMergedLexer {
    public CharsSequenceLexer(String charsSequence, TokenType type) {
        super(buildLexer(charsSequence, type),
                type);
    }

    private static AndLexer buildLexer(String charsSequence, TokenType type) {
        return new AndLexer(Functions
                .convert(charsSequence)
                .stream()
                .map(c -> new SingleCharLexer(c, type))
                .toArray(ILexer[]::new));
    }
}
