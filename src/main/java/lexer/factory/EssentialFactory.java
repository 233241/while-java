package lexer.factory;

import parser.arithmetic.*;
import parser.essentials.*;
import parser.statement.VariableToken;

/**
 * Created on 01.05.16.
 *
 * @author m
 */
public class EssentialFactory implements IFactory<IToken> {
    @Override
    public IToken make(String name) {
        switch (name) {
            default:
                throw new IllegalArgumentException("Unknown name");
        }
    }
}
