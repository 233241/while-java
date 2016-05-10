package lexer.essentials;

import main.TokenType;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class BoolLexer extends DecoratedLexer {
    public BoolLexer() {
        super(new OrLexer(
                new CharsSequenceLexer("TRUE", TokenType.BOOL),
                new CharsSequenceLexer("FALSE", TokenType.BOOL)));
    }
}

