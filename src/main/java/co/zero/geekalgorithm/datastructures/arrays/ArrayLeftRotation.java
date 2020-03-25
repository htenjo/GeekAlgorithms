package co.zero.geekalgorithm.datastructures.arrays;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayLeftRotation {
    
    /**
     * Rotate elements of an array (size n: 1 <= n <= 10^5) to the left direction d times
     *
     * @param a array to be processed 1 <= a[i] <= 10^6
     * @param d number of positions to rotate in left direction. 1 <= d <= n
     * @return Array with the final state after all rotations
     */
    public static int[] rotateLeft(int[] a, int d) {
        int[] newArray = new int[a.length];
        
        for (int i = 0; i + d < a.length; i++) {
            newArray[i] = a[i + d];
        }
        
        for (int i = 0; i < d; i++) {
            newArray[a.length - d + i] = a[i];
        }
        
        return newArray;
    }
    
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int d = 5;
        String rotated = IntStream.of(rotateLeft(a1, d))
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(" "));
        System.out.println("rotated = " + rotated);
    }
}