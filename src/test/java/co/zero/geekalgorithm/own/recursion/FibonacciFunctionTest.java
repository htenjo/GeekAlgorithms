package co.zero.geekalgorithm.own.recursion;

import co.zero.geekalgorithm.algorithms.math.FibonacciFunction;
import co.zero.geekalgorithm.util.MemoryUtils;
import co.zero.geekalgorithm.util.TimeUtils;
import org.junit.*;
import org.junit.rules.TestName;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by htenjo on 8/19/16.
 */
public class FibonacciFunctionTest {
    private static HashMap<Integer, Long> fibonacciResults;
    private static final int MAX_RECURSIVE_NUMBER = 42;
    private static final int MAX_RECURSIVE_FAST_NUMBER = 92;
    @Rule
    public TestName name = new TestName();

    @BeforeClass
    public static void setUp() throws Exception {
        fibonacciResults = new HashMap<Integer, Long>();
        fibonacciResults.put(0, 0L);
        fibonacciResults.put(7, 13L);
        fibonacciResults.put(10, 55L);
        fibonacciResults.put(20, 6765L);
        fibonacciResults.put(30, 832040L);
        fibonacciResults.put(40, 102334155L);
        fibonacciResults.put(41, 165580141L);
        fibonacciResults.put(42, 267914296L);
        fibonacciResults.put(43, 433494437L);
        fibonacciResults.put(44, 701408733L);
        fibonacciResults.put(45, 1134903170L);
        fibonacciResults.put(46, 1836311903L);
        fibonacciResults.put(50, 12586269025L);
        fibonacciResults.put(60, 1548008755920L);
        fibonacciResults.put(70, 190392490709135L);
        fibonacciResults.put(80, 23416728348467685L);
        fibonacciResults.put(92, 7540113804746346429L);
    }

    @Before
    public void setUpMethod(){
        System.out.println("============================================================");
        System.out.println(name.getMethodName());
        System.out.println("============================================================");
    }

    @Test
    public void calculateRecursive() throws Exception {
        MemoryUtils.printStartMemoryUse();
        long initTime = TimeUtils.printCurrentTimeInMillis();
        long result = FibonacciFunction.calculateRecursive(MAX_RECURSIVE_NUMBER);
        TimeUtils.printDifferenceTimeInMillis(initTime);
        MemoryUtils.printEndMemoryUse();
        assertEquals("Fibonacci Number of " + MAX_RECURSIVE_NUMBER,
                fibonacciResults.get(MAX_RECURSIVE_NUMBER).longValue(), result);
    }

    @Test
    public void calculateFast() throws Exception {
        MemoryUtils.printStartMemoryUse();
        long initTime = TimeUtils.printCurrentTimeInMillis();
        long result = FibonacciFunction.calculateWithMemory(MAX_RECURSIVE_FAST_NUMBER);
        TimeUtils.printDifferenceTimeInMillis(initTime);
        MemoryUtils.printEndMemoryUse();
        assertEquals("Fibonacci Number of " + MAX_RECURSIVE_FAST_NUMBER,
                fibonacciResults.get(MAX_RECURSIVE_FAST_NUMBER).longValue(), result);
    }
}