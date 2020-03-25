package co.zero.geekalgorithm.datastructures.arrays;

import java.util.Arrays;

public class RotateArrayByK {
    
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k0 = 0, k1 = 1, k4 = 4, k5 = 5, kN = array.length;

//        System.out.println("rotateThis ::: " + Arrays.toString(array));
//        System.out.println("========================================");
//        rotateByOneLeft(array, k0);
//        System.out.println("rotateBy0 ::: " + Arrays.toString(array));
//        rotateByOneLeft(array, k1);
//        System.out.println("rotateBy1 ::: " + Arrays.toString(array));
//        rotateByOneLeft(array, k5);
//        System.out.println("rotateBy5 ::: " + Arrays.toString(array));
//        rotateByOneLeft(array, kN - 1);
//        System.out.println("rotateByN ::: " + Arrays.toString(array));
//        System.out.println("========================================");
//        rotateByOneRight(array, k0);
//        System.out.println("rotateBy0 ::: " + Arrays.toString(array));
//        rotateByOneRight(array, k1);
//        System.out.println("rotateBy1 ::: " + Arrays.toString(array));
//        rotateByOneRight(array, k5);
//        System.out.println("rotateBy5 ::: " + Arrays.toString(array));
//        rotateByOneRight(array, kN - 1);
//        System.out.println("rotateByN ::: " + Arrays.toString(array));
        System.out.println("========================================");
        rotateInPlace(array, 0);
        System.out.println("rotateBy0 ::: " + Arrays.toString(array));
        rotateInPlace(array, 1);
        System.out.println("rotateBy1 ::: " + Arrays.toString(array));
        rotateInPlace(array, 2);
        System.out.println("rotateBy2 ::: " + Arrays.toString(array));
        rotateInPlace(array, 3);
        System.out.println("rotateBy3 ::: " + Arrays.toString(array));
        rotateInPlace(array, k4);
        System.out.println("rotateBy4 ::: " + Arrays.toString(array));
        rotateInPlace(array, k5);
        System.out.println("rotateBy5 ::: " + Arrays.toString(array));
        rotateInPlace(array, kN - 1);
        System.out.println("rotateByN ::: " + Arrays.toString(array));
    }
    
    /**
     * O(N * K)
     */
    private static void rotateByOneLeft(int[] array, int k) {
        for (int i = 0; i < k; i++) {
            rotateLeft(array);
        }
    }
    
    /**
     * O(N * K)
     */
    private static void rotateByOneRight(int[] array, int k) {
        for (int i = 0; i < k; i++) {
            rotateRight(array);
        }
    }
    
    /**
     * O(N)
     */
    private static void rotateLeft(int[] array) {
        int currentValue = array[0];
        
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        
        array[array.length - 1] = currentValue;
    }
    
    /**
     * O(N)
     */
    private static void rotateRight(int[] array) {
        int lastValue = array[array.length - 1];
        
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        
        array[0] = lastValue;
    }
    
    /**
     * 0 1 2 3 4 5 6 7 8 A B C D E F G H I
     *
     * Time = O(N) Space = O(1) Pre: array.length > 0
     */
    
    private static void rotateInPlace(int[] array, int k) {
        int var1, var2, next;
        int n = array.length;
        //Normalize the rotation
        k = k >= array.length ? k % array.length : k;
        
        for (int i=0; k > 0 && i < gcd(n, k); i++) {
            var1 = array[i];
            next = i;
            
            while (next != n - k + i) {
                next = next + k >= n ? next + k - n : next + k;
                var2 = array[next];
                array[next] = var1;
                var1 = var2;
            }
            
            next = next + k >= n ? next + k - n : next + k;
            array[next] = var1;
        }
    }
    
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
