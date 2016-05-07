package lexer.factory;

/**
 * Created on 01.05.16.
 *
 * @author m
 */
public interface IFactory<T> {
    T make(String name);
}
