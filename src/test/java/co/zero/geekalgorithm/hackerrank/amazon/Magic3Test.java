package co.zero.geekalgorithm.hackerrank.amazon;

import co.zero.geekalgorithm.algorithms.math.Magic3;
import org.junit.Assert;
import org.junit.Test;

public class Magic3Test {

    @Test
    public void testN3() {
        Assert.assertEquals(111, (int) Magic3.getMinOnlyOneMultipleOfThree(3));
    }

    @Test
    public void test13() {
        Assert.assertEquals(111111, (int) Magic3.getMinOnlyOneMultipleOfThree(13));
    }

    @Test
    public void test23() {
        Assert.assertEquals(1.1111111111111111E20, Magic3.getMinOnlyOneMultipleOfThree(23), 0.01);
    }

    @Test
    public void test33() {
        Assert.assertEquals(111111, Magic3.getMinOnlyOneMultipleOfThree(33), 0.01);
    }

    @Test
    public void test43() {
        Assert.assertEquals(1.111111111111111E92, Magic3.getMinOnlyOneMultipleOfThree(43), 0.01);
    }

    @Test
    public void test53() {
        Assert.assertEquals(1.111111111111E12, Magic3.getMinOnlyOneMultipleOfThree(53), 0.01);
    }

    @Test
    public void test63() {
        Assert.assertEquals(1.111111111111111E144, Magic3.getMinOnlyOneMultipleOfThree(63), 0.01);
    }

    @Test
    public void test73() {
        Assert.assertEquals(1.1111111E7, Magic3.getMinOnlyOneMultipleOfThree(73), 0.01);
    }

    @Test
    public void test83() {
        Assert.assertEquals(1.1111111111111109E89, Magic3.getMinOnlyOneMultipleOfThree(83), 0.01);
    }

    @Test
    public void test93() {
        Assert.assertEquals(1.11111111111111E14, Magic3.getMinOnlyOneMultipleOfThree(93), 0.01);
    }

    @Test
    public void test103() {
        Assert.assertEquals(1.11111111111111117E18, Magic3.getMinOnlyOneMultipleOfThree(103), 0.01);
    }
}
