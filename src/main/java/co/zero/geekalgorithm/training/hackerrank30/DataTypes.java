package co.zero.geekalgorithm.training.hackerrank30;

import java.util.Scanner;

//Day 2
public class DataTypes {
    
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        
        int first = scan.nextInt();
        double second = scan.nextDouble();
        String third = scan.next();
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println((first + i));
        /* Print the sum of the double variables on a new line. */
        System.out.println(second + d);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + third);
        scan.close();
    }
}
