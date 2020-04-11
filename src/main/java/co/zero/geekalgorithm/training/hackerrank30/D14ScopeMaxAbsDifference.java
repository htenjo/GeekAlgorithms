package co.zero.geekalgorithm.training.hackerrank30;

import java.util.Arrays;
import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;
    
    Difference(int[] elements) {
        this.elements = elements;
    }
    
    //O(n) = NLogN
    public void computeDifference() {
        Arrays.sort(this.elements);
        this.maximumDifference = elements[elements.length - 1] - elements[0];
    }
    
    //O(n) = N
    public void computeDifferenceLinear() {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < min) {
                min = elements[i];
            }
            
            if (elements[i] > max) {
                max = elements[i];
            }
        }
        
        maximumDifference = max - min;
    }
    
} // End of Difference class

public class D14ScopeMaxAbsDifference {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        
        Difference difference = new Difference(a);
        
        difference.computeDifference();
        
        System.out.print(difference.maximumDifference);
    }
}