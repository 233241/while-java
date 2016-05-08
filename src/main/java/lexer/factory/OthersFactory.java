package lexer.factory;

import parser.essentials.IToken;
import parser.others.LeftParenthesisToken;
import parser.others.RightParenthesisToken;
import parser.others.WhiteSpacesToken;
import parser.statement.VariableToken;

/**
 * Created on 08.05.16.
 *
 * @author m
 */
public class OthersFactory implements IFactory<IToken> {
    @Override
    public IToken make(String name) {
        switch (name) {
            case "SPACE":
                return new WhiteSpacesToken();
            case "LEFT_PARENTHESIS":
                return new LeftParenthesisToken();
            case "RIGHT_PARENTHESIS":
                return new RightParenthesisToken();
            case "VAR":
                return new VariableToken();
            default:
                throw new IllegalArgumentException("Unknown name");
        }
    }
}
