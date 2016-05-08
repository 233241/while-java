package lexer.factory;

import parser.essentials.IToken;
import parser.logic.BooleanToken;
import parser.logic.NotToken;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class LogicFactory implements IFactory<IToken> {
    @Override
    public IToken make(String name) {
        switch (name) {
            case "NOT":
                return new NotToken();
            case "BOOL":
                return new BooleanToken();
            default:
                throw new IllegalArgumentException("Unknown name");
        }
    }
}
