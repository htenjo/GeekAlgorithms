package co.zero.geekalgorithm.training.hackerrank30;

import java.util.Scanner;

//Day 10
public class D10BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int maxCounter = Integer.MIN_VALUE, currentCounter = 0;
        
        for (char letter : Integer.toBinaryString(n).toCharArray()) {
            if (letter == '1') {
                currentCounter++;
            } else {
                maxCounter = Math.max(maxCounter, currentCounter);
                currentCounter = 0;
            }
        }
    
        maxCounter = Math.max(maxCounter, currentCounter);
        System.out.println(maxCounter);
        
        scanner.close();
    }
}
