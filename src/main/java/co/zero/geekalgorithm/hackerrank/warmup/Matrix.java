package co.zero.geekalgorithm.hackerrank.warmup;

import java.util.Scanner;

/**
 * Created by hernan on 8/18/16.
 */
public class Matrix {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int matrixOrder = in.nextInt();
        int absDifference = diagonalDifference(in, matrixOrder);
        System.out.println(absDifference);
    }

    private static int diagonalDifference(final Scanner in, final int matrixOrder){
        int sumDiagonal = 0, currentNumber, sumDiagonalInverse = 0;

        for(int i=0; i<matrixOrder; i++){
            for(int j=0; j<matrixOrder; j++){
                currentNumber = in.nextInt();

                if(i == j){
                    sumDiagonal += currentNumber;
                }

                if(i + j == matrixOrder - 1){
                    sumDiagonalInverse += currentNumber;
                }
            }
        }

        return Math.abs(sumDiagonal - sumDiagonalInverse);
    }
}