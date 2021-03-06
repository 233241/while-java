package essentials;

/**
 * Created on 30.04.16.
 * generic pair containing values of type T1 and T2
 * @author m
 */
public class Pair<T1, T2> {
    public final T1 x;
    public final T2 y;

    public Pair(T1 x, T2 y) {
        this.x = x;
        this.y = y;
    }
}
