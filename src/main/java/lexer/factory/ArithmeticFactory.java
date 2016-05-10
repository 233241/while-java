package lexer.factory;

import parser.arithmetic.*;
import parser.essentials.IToken;

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
            case "MUL":
                return new MulToken();
            case "DIV":
                return new DivToken();
            case "POW":
                return new PowToken();
            case "MOD":
                return new ModToken();
            case "INT":
                return new IntegerToken();
            default:
                throw new IllegalArgumentException("Unknown name");
        }
    }
}
