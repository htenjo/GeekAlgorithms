package co.zero.geekalgorithm.hackerrank.hashtables;

import org.junit.Assert;
import org.junit.Test;

public class TwoStringsAreSubstringsTest {
    @Test
    public void test1(){
        String isSubstring = TwoStringsAreSubstrings.twoStrings("hello", "word");
        Assert.assertEquals("YES", isSubstring);
    }

    @Test
    public void test2(){
        String isSubstring = TwoStringsAreSubstrings.twoStrings("hi", "word");
        Assert.assertEquals("NO", isSubstring);
    }
}
