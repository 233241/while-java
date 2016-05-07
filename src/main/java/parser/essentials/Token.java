package parser.essentials;

/**
 * Created on 29.04.16.
 *
 * @author m
 */
public class Token implements IToken {
    private String value;

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String newValue) {
        value = newValue;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + value + "]";
    }
}
