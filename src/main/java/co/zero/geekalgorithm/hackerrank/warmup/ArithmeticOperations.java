package co.zero.geekalgorithm.hackerrank.warmup;

import co.zero.geekalgorithm.util.Constants;

import java.util.Scanner;

/**
 * Class with examples of algorithms that uses basic arithmetic operations
 * Created by hernan on 8/20/16.
 */
public class ArithmeticOperations {
    /**
     * Given two numbers a and b calculate the sum of the numbers
     * @return the sum of the two numbers
     */
    public static int basicSum() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public static String sumTupla(){
        Scanner in = new Scanner(System.in);
        String[] scoresA = in.nextLine().split(Constants.SPACE);
        String[] scoresB = in.nextLine().split(Constants.SPACE);

        int[] scores = new int[]{0, 0};

        for(int i=0; i < scoresA.length; i++){
            if(Integer.parseInt(scoresA[i]) > Integer.parseInt(scoresB[i])){
                scores[0]++;
            }else if(Integer.parseInt(scoresA[i]) < Integer.parseInt(scoresB[i])){
                scores[1]++;
            }
        }

        String result = String.format("%d %d", scores[0], scores[1]);
        System.out.printf(result);
        return result;
    }
}
