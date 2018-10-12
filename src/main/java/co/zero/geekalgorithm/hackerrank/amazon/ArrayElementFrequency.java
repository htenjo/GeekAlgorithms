package co.zero.geekalgorithm.hackerrank.amazon;

import java.util.Arrays;

/**
 * Given an integer array, find the most frequent number and it's count in the array. Write the
 * code in O(1) space.
 * Eg: [1, 3, 4, 5, 2, 2, 3, 2]
 * Output Most frequent number is 2.
 * The frequency is 3.
 * If multiple numbers have the same highest frequency return the smallest number.
 * N > 0
 * 1<= a[i] <= 10^5
 */
class ArrayElementFrequency {

    // [1, 3, 4, 5, 2, 2, 3, 2]
    static int[] findFrequency(int[] a) {
        // [1, 2, 2, 2, 3, 3, 4, 4, 4]
        //Currently this uses quickSort (java default)
        //To accomplish the goal, we should use an in place sort algorithm.
        Arrays.sort(a);
        int maxNumber = -1, frequency = 0, maxFrequency=0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                if ( ++frequency > maxFrequency) {
                    maxFrequency = frequency;
                    maxNumber = a[i];
                }

                frequency = 0;
            } else {
                frequency++;
            }
        }

        if (maxNumber < 0) {
            maxNumber = a[0];
            maxFrequency = frequency;
        }

        if (maxNumber == a[a.length - 1]) {
            maxFrequency++;
        }

        return new int[]{maxNumber, maxFrequency};
    }
}
