//=======================================================================
// ARCHIVO EquilibriumArrays.java
// FECHA CREACIÓN: Jun 15, 2015
//=======================================================================
package co.zero.geekalgorithm.toptal.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * This class has some functions required in co.zero.toptal exercises
 *
 * @author Hernán Tenjo
 * @version 1.0
 */
public class EquilibriumArrays {
    /**
     * This method finds some of the equilibrium indexes
     * P = Equilibrium index
     * 0 <= P < N, N = array length
     * sum(A[i]) = sum(A[k]), (0 <= i < P), (P < k < N)
     * N could be an integer within the range [0..100,000]
     * Each element of array A is an integer within the range [−2,147,483,648..2,147,483,647]
     *
     * @param A Array of integers zero-index based
     * @param n Array size
     * @return One of the equlibrium indexes if one exist, -1 in other case
     */
    public static List<Integer> equilibriumSolution(int A[], int n) {
        //Structures that hold the sum of the given order
        Map<Integer, Integer> mapAsc = new HashMap<Integer, Integer>();
        mapAsc.put(0, A[0]);
        List<Integer> pNumbers = new ArrayList<Integer>();

        for (int i = 1; i < n; i++) {
            mapAsc.put(i, mapAsc.get(i - 1) + A[i]);
        }

        //Finding the P number
        for (int i = 0; i < n; i++) {
            int lowerSum = i == 0 ? 0 : mapAsc.get(i - 1);
            int upperSum = i == (n - 1) ? 0 : mapAsc.get(n - 1) - mapAsc.get(i);

            if (lowerSum == upperSum) {
                pNumbers.add(i);
            }
        }

        return pNumbers;
    }

    /**
     * This method finds some of the equilibrium indexes
     * P = Equilibrium index
     * 0 <= P < N, N = array length
     * sum(A[i]) = sum(A[k]), (0 <= i < P), (P < k < N)
     * N could be an integer within the range [0..100,000]
     * Each element of array A is an integer within the range [-2,147,483,648..2,147,483,647]
     *
     * @param A Array of integers zero-index based
     * @return One of the equlibrium indexes if one exist, -1 in other case
     */
    public static int equilibriumSolution(int[] A) {
        //Structure that hold the sum of the given order
        Map<Integer, Long> mapAsc = new HashMap<Integer, Long>();
        int n = A.length;

        if (n > 0) {
            mapAsc.put(0, Long.valueOf(A[0]));
        } else {
            return -1;
        }

        //Each position has the sum of previous positions
        for (int i = 1; i < n; i++) {
            mapAsc.put(i, mapAsc.get(i - 1) + A[i]);
        }

        //Finding the first P number
        for (int i = 0; i < n; i++) {
            long lowerSum = i == 0 ? 0 : mapAsc.get(i - 1);
            long upperSum = i == (n - 1) ? 0 : mapAsc.get(n - 1) - mapAsc.get(i);

            if (lowerSum == upperSum) {
                return i;
            }
        }

        return -1;
    }

    public static int simpleEquilibriumSolution(int[] A) {
        long arrayElementsSum = Arrays.stream(A).asLongStream().sum();
        long prefix = 0;

        for (int index = 0; index < A.length; index++) {
            prefix += A[index];

            if (prefix == arrayElementsSum - prefix + A[index]) {
                return index;
            }
        }

        return -1;
    }

    /**
     * First data set to test the functionality
     *
     * @return P numbers
     */
    public static List<Integer> test1() {
        int A[] = new int[]{-1, 3, -4, 5, 1, -6, 2, 1};
        return equilibriumSolution(A, A.length);
    }

    /**
     * Second data set to test the functionality
     *
     * @return P numbers
     */
    public static List<Integer> test2() {
        int A[] = new int[]{5, -7, 6, 3, -1, 3, 9, 6, 8, -5};
        return equilibriumSolution(A, A.length);
    }

    /**
     * Random array with 1000 numbers
     *
     * @return P number
     */
    public static List<Integer> test3() {
        int ARRAY_SIZE = 1000;
        int A[] = new int[ARRAY_SIZE];
        Random random = new Random();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            A[i] = random.nextInt(10) * (random.nextBoolean() ? -1 : 1);
        }

        System.out.println(Arrays.toString(A));
        return equilibriumSolution(A, A.length);
    }

    /**
     * Random array with 1000 numbers
     *
     * @return P number
     */
    public static int test4() {
        int ARRAY_SIZE = 1000;
        int A[] = new int[ARRAY_SIZE];
        Random random = new Random();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            A[i] = random.nextInt(10) * (random.nextBoolean() ? -1 : 1);
        }

        System.out.println(Arrays.toString(A));
        int solA = equilibriumSolution(A);
        int solB = simpleEquilibriumSolution(A);
        System.out.println("solA = " + solB);
        System.out.println("solB = " + solB);
        return solA;
    }

    /**
     * Random array with 0 numbers
     *
     * @return P number
     */
    public static int test5() {
        int A[] = new int[]{};
        return equilibriumSolution(A);
    }

    /**
     * Program start point
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(test1());
        System.out.println(test2());
        System.out.println(test3());
        System.out.println(test4());
        System.out.println(test5());
    }
}