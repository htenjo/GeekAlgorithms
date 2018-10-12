package co.zero.geekalgorithm.hackerrank.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayManipulationByMatrixTest {

    @Test
    public void test1() {
        int n = 5;
        int[][] matrix = new int[][]{
              {1, 2, 100}
            , {2, 5, 100}
            , {3, 4, 100}
        };

        long maximum = ArrayManipulationByMatrix.arrayManipulation(n, matrix);
        Assert.assertEquals(200, maximum);
    }

    //  0  0  0  0  0  0
    //  1 2 5
    //  ----------------
    //  5  5  0  0  0  0
    // Max 5
    @Test
    public void test2() {
        int n = 6;
        int[][] matrix = new int[][]{
              {1, 2, 5}
        };

        long maximum = ArrayManipulationByMatrix.arrayManipulation(n, matrix);
        Assert.assertEquals(5, maximum);
    }

    @Test
    public void test3() {
        int n = 9;
        int[][] matrix = new int[][]{
              {1, 5, 3}
            , {4, 8, 7}
            , {6, 9, 1}
            , {2, 3 ,50}
        };

        long maximum = ArrayManipulationByMatrix.arrayManipulation(n, matrix);
        Assert.assertEquals(53, maximum);
    }

    @Test
    public void test4() {
        int n = 12;
        int[][] matrix = new int[][]{
              {1, 10, 1}
            , {2, 11, 2}
            , {1, 8, 3}
            , {3, 7, 4}
            , {1, 12, 1}
            , {1, 12, 2}
            , {2, 12, 3}
        };

        long maximum = ArrayManipulationByMatrix.arrayManipulation(n, matrix);
        Assert.assertEquals(16, maximum);
    }

    @Test
    public void test5() {
        int n = 12;
        int[][] matrix = new int[][]{
              {1, 10, 1}
            , {2, 11, 2}
            , {1, 8, 3}
            , {3, 7, 4}
            , {1, 12, 1}
            , {1, 12, 2}
            , {2, 12, 3}
            , {1, 1, 3}
        };

        long maximum = ArrayManipulationByMatrix.arrayManipulation(n, matrix);
        Assert.assertEquals(16, maximum);
    }
}