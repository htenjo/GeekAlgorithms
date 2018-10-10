package co.zero.geekalgorithm.hackerrank.warmup;

import org.junit.Assert;
import org.junit.Test;

public class RepeatedStringTest {
    @Test
    public void testEmptyS_1() {
        String s = " ";
        long n = 1;
        Assert.assertEquals(RepeatedString.repeatedString(s, n), 0);
    }

    @Test
    public void testEmptyS_2() {
        String s = "aba";
        long n = 10;
        Assert.assertEquals(RepeatedString.repeatedString(s, n), 7);
    }

    @Test
    public void testEmptyS_3() {
        String s = "a";
        long n = 1_000_000_000_000L;
        Assert.assertEquals(RepeatedString.repeatedString(s, n), 1_000_000_000_000L);
    }
}
