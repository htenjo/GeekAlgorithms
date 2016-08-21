package co.zero.geekalgorithm.hackerrank.warmup;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by hernan on 8/20/16.
 */
public class ArithmeticOperationsTest {
    private static InputStream stdin;

    @BeforeClass
    public static void setUp() throws Exception {
        stdin = System.in;
    }

    @Test
    public void basicSum() throws Exception {
        String data = "5 10\n";

        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            int sum = ArithmeticOperations.basicSum();
            assertEquals(sum, 15);
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void sumTupla() throws Exception {
        String data = "5 6 7 1 1 1 1\n3 6 10 2 2 2 2";

        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            String result = ArithmeticOperations.sumTupla();
            assertEquals("1 5", result);
        } finally {
            System.setIn(stdin);
        }
    }
}