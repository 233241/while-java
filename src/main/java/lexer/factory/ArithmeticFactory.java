package lexer.factory;

import parser.arithmetic.*;
import parser.essentials.IToken;
import parser.essentials.LeftBracketToken;
import parser.essentials.RightBracketToken;
import parser.statement.VariableToken;

/**
 * Created on 01.05.16.
 *
 * @author m
 */
public class ArithmeticFactory implements IFactory<IToken> {
    @Override
    public IToken make(String name) {
        switch (name) {
            case "ADD":
                return new AddToken();
            case "SUB":
                return new SubToken();
            case "MULT":
                return new MultToken();
            case "DIV":
                return new DivToken();
            case "MOD":
                return new ModToken();
            case "LEFT":
                return new LeftBracketToken();
            case "RIGHT":
                return new RightBracketToken();
            case "INT":
                return new IntegerToken();
            case "VAR":
                return new VariableToken();
            default:
                throw new IllegalArgumentException("Unknown name");
        }
    }
}
