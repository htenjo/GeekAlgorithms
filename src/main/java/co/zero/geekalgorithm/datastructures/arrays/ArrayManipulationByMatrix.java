package co.zero.geekalgorithm.datastructures.arrays;

import java.util.Arrays;

/**
 * Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each of the
 * array element between two given indices, inclusive. Once all operations have been performed, return the maximum value
 * in your array.
 */
public class ArrayManipulationByMatrix {

    /**
     * Time Complexity = O(M) =~ O(N)
     * Space Complexity = O(n) =~ O(1)
     */
    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long arr[] = new long[n];

        // each successive element contains the difference between itself and previous element

        for (int i = 0; i < queries.length; i++) {
            // when checking query, subtract 1 from both a and b since 0 indexed array
            int a = queries[i][0] - 1;
            int b = queries[i][1] - 1;
            int k = queries[i][2];

            arr[a] += k;

            if (b + 1 < n) {
                arr[b + 1] -= k;
            }

            System.out.println("arr = " + Arrays.toString(arr));
        }

        // track highest val seen so far as we go
        long max = Long.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
            max = Math.max(arr[i], max);
        }

        return max;
    }
}
