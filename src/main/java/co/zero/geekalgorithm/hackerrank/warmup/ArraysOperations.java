package co.zero.geekalgorithm.hackerrank.warmup;

import co.zero.geekalgorithm.util.Constants;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hernan on 8/18/16.
 */
public class ArraysOperations {
    /**
     * Basic sum of the elements in the array
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
     * Basic sum of the elements in the array when the elements are big integers
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

    /**
     *
     * @return
     */
    public static String countIntTypes(){
        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        int currentInt;
        int positives = 0, negatives = 0, zeros = 0;

        for(int i=0; i < arrayLength; i++){
            currentInt = in.nextInt();

            if(currentInt > 0){
                positives++;
            }else if ( currentInt < 0){
                negatives++;
            }else{
                zeros++;
            }
        }

        double positiveFraction = positives * 1.0 / arrayLength;
        double negativeFraction = negatives * 1.0 / arrayLength;
        double zerosFraction = zeros * 1.0 / arrayLength;
        String result = String.format("%f\n%f\n%f", positiveFraction, negativeFraction, zerosFraction);
        System.out.println(result);
        return result;
    }

    /**
     *
     * @return
     */
    public static String circularRotation(){
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int numRotations = in.nextInt();
        int numQueries = in.nextInt();
        int currentIndex;
        in.nextLine();
        String[] numbersArray = in.nextLine().split(Constants.SPACE);
        List<String> numbers = new LinkedList<String>(Arrays.asList(numbersArray));
        String lastValue, result = Constants.EMPTY;

        for(int i=0;  i < numRotations; i++){
            lastValue = numbers.get(arraySize - 1);
            numbers.remove(arraySize - 1);
            numbers.add(0, lastValue);
        }

        for(int i=0; i < numQueries; i++){
            currentIndex = in.nextInt();
            result += numbers.get(currentIndex) + Constants.NEW_LINE;
        }

        System.out.println(result);
        return result;
    }
}
