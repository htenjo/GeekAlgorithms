package co.zero.hackerrank.warmup;

import java.util.Scanner;

/**
 * Created by hernan on 8/18/16.
 */
public class SumNumbers {
    private static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}