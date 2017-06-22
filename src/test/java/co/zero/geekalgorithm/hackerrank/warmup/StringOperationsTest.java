package co.zero.geekalgorithm.hackerrank.warmup;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by hernan on 5/31/17.
 */
public class StringOperationsTest {
    @Test
    public void testHasBalancedParenthesis1() throws Exception {
        String expression = "a(bcd)d";
        Assert.assertTrue(StringOperations.hasBalancedParenthesis(expression));
    }

    @Test
    public void testHasBalancedParenthesis2() throws Exception {
        String expression = "(kjds(hfkj)sdhf";
        Assert.assertFalse(StringOperations.hasBalancedParenthesis(expression));
    }

    @Test
    public void testHasBalancedParenthesis3() throws Exception {
        String expression = "(sfdsf)(fsfsf";
        Assert.assertFalse(StringOperations.hasBalancedParenthesis(expression));
    }

    @Test
    public void testHasBalancedParenthesis4() throws Exception {
        String expression = "{[]}()";
        Assert.assertTrue(StringOperations.hasBalancedParenthesis(expression));
    }

    @Test
    public void testHasBalancedParenthesis5() throws Exception {
        String expression = "{[}]";
        Assert.assertFalse(StringOperations.hasBalancedParenthesis(expression));
    }

    @Test
    public void testHasBalancedParenthesis6() throws Exception {
        String expression = "(kjds(hfkj))sdhf[{asdrttttttxxxxx}xxx]";
        Assert.assertTrue(StringOperations.hasBalancedParenthesis(expression));
    }
}
