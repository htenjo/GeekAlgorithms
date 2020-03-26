package co.zero.geekalgorithm.datastructures.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Find the Kth smallest element in the given array.
 */
public class KthSmallestNumber {
    
    /**
     * This just sort the array and get the Kth element. This is the easier way but usually doesn't accomplish the
     * performance requirement in tests O(n). As this uses quickSort, the AVG case is O(N * LogN)
     */
    public static int findKthSmallestNumberWithSorting(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
    
    public static int findKthSmallestNumberWithHeap(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        
        for (int i : arr) {
            heap.add(i);
    
            if (heap.size() > k) {
                heap.remove();
            }
        }
    
        return heap.peek();
    }
    
    public static void main(String[] args) {
        int[] arr1 = new int[]{7, 10, 4, 3, 20, 15};
        int[] arr2 = new int[]{7, 10, 4, 20, 15};
        System.out.println(String.format("::: Sorted = [%s], Heap = [%s]",
                findKthSmallestNumberWithSorting(arr1, 3), findKthSmallestNumberWithHeap(arr1, 3)));
        System.out.println(String.format("::: Sorted = [%s], Heap = [%s]",
                findKthSmallestNumberWithSorting(arr2, 4), findKthSmallestNumberWithHeap(arr2, 4)));
    }
}
