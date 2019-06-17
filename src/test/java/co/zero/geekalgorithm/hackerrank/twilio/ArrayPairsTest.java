package co.zero.geekalgorithm.hackerrank.twilio;

import junit.framework.Assert;
import org.junit.Test;

public class ArrayPairsTest {
    @Test
    public void numberOfPairs_test1() {
        int[] arrays = new int[]{1, 2, 3, 6, 7, 8, 9, 1};
        int target = 10;
        int expectedPairs = 3;
        int pairs = ArrayPairs.numberOfPairs(arrays, target);
        Assert.assertEquals(expectedPairs, pairs);
    }

    @Test
    public void numberOfPairs_test2() {
        int[] arrays = new int[]{1, 3, 46, 1, 3, 9};
        int target = 47;
        int expectedPairs = 1;
        int pairs = ArrayPairs.numberOfPairs(arrays, target);
        Assert.assertEquals(expectedPairs, pairs);
    }
}