package co.zero.geekalgorithm.hackerrank.warmup;

import org.junit.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.Assert.*;

/**
 * Created by hernan on 8/20/16.
 */
public class ArraysTest {
    private static InputStream stdin;

    @BeforeClass
    public static void setUp() {
        stdin = System.in;
    }

    @Test
    public void sumNormalInts() {
        String data = "5\n1 2 3 4 5\n";

        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            int sum = ArraysOperations.sumNormalInts();
            assertEquals(sum, 15);
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void sumReallyBigInts() {
        String data = "4\n2147483647 2147483647 2147483647 2147483647";

        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            long sum = ArraysOperations.sumReallyBigInts();
            assertEquals(sum, 2147483647L * 4);
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void countIntTypes() {
        String data = "6\n-4 3 -9 0 4 1";

        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            String result = ArraysOperations.countIntTypes();
            assertEquals("0.500000\n0.333333\n0.166667", result);
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void circularRotation() {
        String data = "3 2 3\n1 2 3\n0\n1\n2\n";

        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            String result = ArraysOperations.circularRotation();
            assertEquals("2\n3\n1\n", result);
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void invertedArray() {
        String data = "10 \n1 2 3 4 5 6 7 8 9 10";

        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            String result = ArraysOperations.invertArray();
            assertEquals("10 9 8 7 6 5 4 3 2 1", result);
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void maxHourglass1() {
        String data = "1 1 1 0 0 0\n" +
                "0 1 0 0 0 0\n" +
                "1 1 1 0 0 0\n" +
                "0 0 2 4 4 0\n" +
                "0 0 0 2 0 0\n" +
                "0 0 1 2 4 0";
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(19, ArraysOperations.maxHourglass(6, 6));
        } finally {
            System.setIn(stdin);
        }

        data = "0 -4 -6 0 -7 -6\n" +
                "-1 -2 -6 -8 -3 -1\n" +
                "-8 -4 -2 -8 -8 -6\n" +
                "-3 -1 -2 -5 -7 -4\n" +
                "-3 -5 -3 -6 -6 -6\n" +
                "-3 -6 0 -8 -6 -7";

        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(-19, ArraysOperations.maxHourglass(6, 6));
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void maxHourglass2() {
        String data = "0 -4 -6 0 -7 -6\n" +
                "-1 -2 -6 -8 -3 -1\n" +
                "-8 -4 -2 -8 -8 -6\n" +
                "-3 -1 -2 -5 -7 -4\n" +
                "-3 -5 -3 -6 -6 -6\n" +
                "-3 -6 0 -8 -6 -7";

        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(-19, ArraysOperations.maxHourglass(6, 6));
        } finally {
            System.setIn(stdin);
        }
    }

}