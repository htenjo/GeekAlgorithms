package co.zero.geekalgorithm.hackerrank.warmup;

import java.util.Scanner;

/**
 * Created by hernan on 8/18/16.
 */
public class Arrays {
    public static void sumNormalInts(){
        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        int sum = 0;

        for(int i=0; i<arrayLength; i++){
            sum += in.nextInt();
        }

        System.out.println(sum);
    }

    public static void sumReallyBigInts(){
        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        long sum = 0;

        for(int i=0; i<arrayLength; i++){
            sum += in.nextInt();
        }

        System.out.println(sum);
    }
}
