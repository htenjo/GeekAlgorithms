package co.zero.geekalgorithm.hackerrank.warmup;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class ArrayLeftRotationTest {
    @Test
    public void leftRotation_commonArray() {
        int d = 4;
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{5, 1, 2, 3, 4};
        int[] rotated = ArrayLeftRotation.rotateLeft(a, d);
        Assert.assertTrue(Arrays.equals(expected, rotated));
    }

    @Test
    public void leftRotation_arraySingleElementSingleRotation() {
        int d = 1;
        int[] a = new int[]{1};
        int[] expected = new int[]{1};
        int[] rotated = ArrayLeftRotation.rotateLeft(a, d);
        Assert.assertTrue(Arrays.equals(expected, rotated));
    }

    @Test
    public void leftRotation_arrayCompleteRotation() {
        int d = 5;
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        int[] rotated = ArrayLeftRotation.rotateLeft(a, d);
        Assert.assertTrue(Arrays.equals(expected, rotated));
    }
}
