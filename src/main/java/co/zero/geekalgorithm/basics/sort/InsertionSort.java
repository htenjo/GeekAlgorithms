package co.zero.geekalgorithm.basics.sort;

import java.util.Arrays;

/**
 * From https://www.geeksforgeeks.org/insertion-sort/ I nsertion sort is a simple sorting algorithm that works the way
 * we sort playing cards in our hands.
 *
 * Insertion sort works by comparing values at index with all its prior elements. We place value at the index where
 * there are no lesser value to the elements. So when you reach last element,we get a sorted array.
 */
public class InsertionSort {
    public static void sort(int[] array) {
        //0. iterate over all elements
        for (int i = 1; i < array.length; i++) {
            //1. Get the second element (KEY) in the array
            int key = array[i];
            int j = i - 1;
            
            //2. Compare Key with the the sorted array (left side)
            while (j >= 0 && key < array[j]) {
                //3. Move items > KEY to the right
                array[j + 1] = array[j];
                j--;
            }
            
            array[j + 1] = key;
        }
    }
    
    //i=3 j=0 key = 1
    public static void main(String[] args) {
        int[] example1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] example2 = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] example3 = new int[]{1, 1, 1, 2, 2, 2, 3, 3};
        int[] example4 = new int[]{1, 2, 3, 1, 2, 3, 1, 2, 3};
        int[] example5 = new int[]{1, 1};
        int[] example6 = new int[]{1, 2, 3, 9, 5, 6, 3, 2, 1};
        
        printSort(example1);
        printSort(example2);
        printSort(example3);
        printSort(example4);
        printSort(example5);
    }
    
    private static void printSort(int[] array) {
        System.out.print("::: Before " + Arrays.toString(array));
        sort(array);
        System.out.println(" => After " + Arrays.toString(array));
    }
}
