package lexer.essentials;

import essentials.Pair;
import parser.essentials.IToken;
import java.util.List;

/**
 * Created on 29.04.16.
 *
 * @author m
 */
public interface ILexer {
    Pair<List<IToken>, List<Character>> eval(List<Character> text);
}
