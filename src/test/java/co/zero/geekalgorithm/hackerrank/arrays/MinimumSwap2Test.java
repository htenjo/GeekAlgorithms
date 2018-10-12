package co.zero.geekalgorithm.hackerrank.arrays;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSwap2Test {

    @Test
    public void exampleTest1() {
        int[] arra = new int[]{7, 1, 3, 2, 4, 5, 6};
        int swaps = MinimumSwap2.minimumSwaps(arra);
        Assert.assertEquals(5, swaps);
    }

    @Test
    public void exampleTest2() {
        int[] arra = new int[]{4, 3, 1, 2};
        int swaps = MinimumSwap2.minimumSwaps(arra);
        Assert.assertEquals(3, swaps);
    }

    @Test
    public void exampleTest3() {
        int[] arra = new int[]{2, 3, 4, 1, 5};
        int swaps = MinimumSwap2.minimumSwaps(arra);
        Assert.assertEquals(3, swaps);
    }

    @Test
    public void exampleTest4() {
        int[] arra = new int[]{1, 3, 5, 2, 4, 6, 8};
        int swaps = MinimumSwap2.minimumSwaps(arra);
        Assert.assertEquals(3, swaps);
    }
}




