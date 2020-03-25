package co.zero.geekalgorithm.datastructures.arrays;

import java.util.Arrays;

public class GeneralFunctions {
    
    public static int[] reverseArrayWithExtraSpace(int[] a) {
        int[] reverse = new int[a.length];
        
        for (int i = 0; i < a.length; i++) {
            reverse[i] = a[a.length - 1 - i];
        }
        
        return reverse;
    }
    
    public static int[] reverseArrayInPlace(int[] a) {
        int aux;
        
        for(int i=0; i < a.length / 2; i++) {
            aux = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = aux;
        }
        
        return a;
    }
    
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9,0};
        int[] b = new int[0];
        int[] c = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println("reverseArrayWithExtraSpace(a) = " + Arrays.toString(reverseArrayWithExtraSpace(a)));
        System.out.println("reverseArrayWithExtraSpace(b) = " + Arrays.toString(reverseArrayWithExtraSpace(b)));
        System.out.println("reverseArrayInPlace(a) = " + Arrays.toString(reverseArrayInPlace(a)));
        System.out.println("reverseArrayInPlace(b) = " + Arrays.toString(reverseArrayInPlace(b)));
        System.out.println("reverseArrayInPlace(c) = " + Arrays.toString(reverseArrayInPlace(c)));
    }
}
