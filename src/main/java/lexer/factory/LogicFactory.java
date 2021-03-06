package lexer.factory;

import parser.essentials.IToken;
import parser.logic.*;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class LogicFactory implements IFactory<IToken> {
    @Override
    public IToken make(String name) {
        switch (name) {
            case "BOOL":
                return new BoolToken();
            case "NOT":
                return new NotToken();
            case "AND":
                return new AndToken();
            case "OR":
                return new OrToken();
            case "EQUAL":
                return new EqualToken();
            case "NOT_EQUAL":
                return new NotEqualToken();
            case "LESS":
                return new LessToken();
            case "LESS_EQUAL":
                return new LessEqualToken();
            case "GREATER":
                return new GreaterToken();
            case "GREATER_EQUAL":
                return new GreaterEqualToken();
            default:
                throw new IllegalArgumentException("Unknown name");
        }
    }
}
