package co.zero.geekalgorithm.training.hackerrank30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Day 6
public class EvenOddStrings {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        int N = scanner.nextInt();
        List<String> strings = new ArrayList<>();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        while (N-- > 0) {
            strings.add(scanner.next());
        }
        
        for (String s : strings) {
            char[] chars = s.toCharArray();
            printEvenChars(chars);
            System.out.print("  ");
            printOddChars(chars);
            System.out.println("");
        }
        
        scanner.close();
    }
    
    private static void printEvenChars(char[] chars) {
        for (int i = 0; i < chars.length; i += 2) {
            System.out.print(chars[i]);
        }
    }
    
    private static void printOddChars(char[] chars) {
        for (int i = 1; i < chars.length; i += 2) {
            System.out.print(chars[i]);
        }
    }
}
