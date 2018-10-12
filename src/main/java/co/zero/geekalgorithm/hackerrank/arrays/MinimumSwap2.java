package co.zero.geekalgorithm.hackerrank.arrays;

import java.util.Arrays;

public class MinimumSwap2 {
    static int minimumSwaps(int[] arr) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        int counter = 0;
        int offset, temp;

        for (int i=0; i < arr.length; i++) {
            if (arr[i] > sorted[i]) {
                offset = arr[i] - sorted[i];
                temp = arr[i];
                arr[i] = arr[i + offset];
                arr[i + offset] = temp;
                counter++;
                i--;
            }
        }

        return counter;
    }
}
