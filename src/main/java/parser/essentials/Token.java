package parser.essentials;

/**
 * Created on 29.04.16.
 *
 * @author m
 */
public abstract class Token implements IToken {
    private String value;

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String newValue) {
        value = newValue;
    }

    // TODO: 08.05.16 remove after tests all lexer
    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + value + "]";
    }
}
