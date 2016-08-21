package co.zero.geekalgorithm.hackerrank.warmup;

import java.util.Scanner;

/**
 * Created by hernan on 8/18/16.
 */
public class ArraysOperations {
    /**
     *
     * @return
     */
    public static int sumNormalInts(){
        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        int sum = 0;

        for(int i=0; i<arrayLength; i++){
            sum += in.nextInt();
        }

        System.out.println(sum);
        return sum;
    }

    /**
     * 
     * @return
     */
    public static long sumReallyBigInts(){
        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        long sum = 0;

        for(int i=0; i<arrayLength; i++){
            sum += in.nextInt();
        }

        System.out.println(sum);
        return sum;
    }
}
