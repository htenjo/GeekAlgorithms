package co.zero.geekalgorithm.hackerrank.warmup;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hernan on 5/31/17.
 */
public class BalancedParenthesisTest {
    @Test
    public void testHasBalancedParenthesis1() {
        String expression = "a(bcd)d";
        Assert.assertTrue(BalancedParenthesis.hasBalancedParenthesis(expression));
    }

    @Test
    public void testHasBalancedParenthesis2() {
        String expression = "(kjds(hfkj)sdhf";
        Assert.assertFalse(BalancedParenthesis.hasBalancedParenthesis(expression));
    }

    @Test
    public void testHasBalancedParenthesis3() {
        String expression = "(sfdsf)(fsfsf";
        Assert.assertFalse(BalancedParenthesis.hasBalancedParenthesis(expression));
    }

    @Test
    public void testHasBalancedParenthesis4() {
        String expression = "{[]}()";
        Assert.assertTrue(BalancedParenthesis.hasBalancedParenthesis(expression));
    }

    @Test
    public void testHasBalancedParenthesis5() {
        String expression = "{[}]";
        Assert.assertFalse(BalancedParenthesis.hasBalancedParenthesis(expression));
    }

    @Test
    public void testHasBalancedParenthesis6() {
        String expression = "(kjds(hfkj))sdhf[{asdrttttttxxxxx}xxx]";
        Assert.assertTrue(BalancedParenthesis.hasBalancedParenthesis(expression));
    }
}
