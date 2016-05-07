package essentials;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created on 07.05.16.
 *
 * @author m
 */
public class PairTest {
    @Test
    public void constructorTest() {
        Pair<Integer, String> pair = new Pair<>(1, "One");

        Assert.assertEquals(new Integer(1), pair.x);
        Assert.assertEquals("One", pair.y);
    }
}