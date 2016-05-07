package lexer.essentials;

/**
 * Created on 01.05.16.
 *
 * @author m
 */
public class EssentialLexer extends DecoratedLexer {
    public EssentialLexer() {
        super(new OrLexer(
                new WhiteSpacesLexer()));
    }
}