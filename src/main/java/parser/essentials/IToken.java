package parser.essentials;

import lexer.factory.IFactory;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 29.04.16.
 *
 * @author m
 */
public interface IToken {
    String getValue();
    void setValue(String newValue);
}
