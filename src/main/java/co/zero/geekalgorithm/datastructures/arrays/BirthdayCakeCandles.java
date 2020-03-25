package co.zero.geekalgorithm.datastructures.arrays;

import java.util.Arrays;

public class BirthdayCakeCandles {
    
    public static int birthdayCakeCandles(int[] ar) {
        Arrays.sort(ar);
        int max = ar[ar.length - 1];
        int counter = 1;
        
        for (int i = ar.length - 2; i >= 0; i--) {
            if (ar[i] == max) {
                counter++;
            } else {
                break;
            }
        }
        
        return counter;
    }
}
