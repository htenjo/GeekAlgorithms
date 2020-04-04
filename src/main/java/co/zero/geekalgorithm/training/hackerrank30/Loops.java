package co.zero.geekalgorithm.training.hackerrank30;

import java.util.Scanner;

//Day 5
public class Loops {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = scanner.nextInt();
        String template = "%s x %s = %s";
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for (int i=1; i < 11; i++) {
            System.out.println(String.format(template, n, i, n * i));
        }
        
        scanner.close();
    }
}
