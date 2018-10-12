package co.zero.geekalgorithm.hackerrank.amazon;

import org.junit.Assert;
import org.junit.Test;

public class ArrayElementFrequencyTest {
    @Test
    public void example1() {
        int[] a = new int[]{1, 3, 4, 5, 2, 2, 3, 2};
        int[] max = ArrayElementFrequency.findFrequency(a);
        Assert.assertEquals(2, max[0]);
        Assert.assertEquals(3, max[1]);
    }

    @Test
    public void example2() {
        int[] a = new int[]{1, 1, 1, 1, 1};
        int[] max = ArrayElementFrequency.findFrequency(a);
        Assert.assertEquals(1, max[0]);
        Assert.assertEquals(5, max[1]);
    }

    @Test
    public void example3() {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] max = ArrayElementFrequency.findFrequency(a);
        Assert.assertEquals(1, max[0]);
        Assert.assertEquals(1, max[1]);
    }
}
