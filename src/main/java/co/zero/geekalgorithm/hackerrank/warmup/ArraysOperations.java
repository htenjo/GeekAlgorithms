package co.zero.geekalgorithm.hackerrank.warmup;

import co.zero.geekalgorithm.util.Constants;

import java.util.ArrayList;
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
     *
     * @return
     */
    public static int sumNormalInts() {
        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        int sum = 0;

        for (int i = 0; i < arrayLength; i++) {
            sum += in.nextInt();
        }

        System.out.println(sum);
        return sum;
    }

    /**
     * Basic sum of the elements in the array when the elements are big integers
     *
     * @return
     */
    public static long sumReallyBigInts() {
        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        long sum = 0;

        for (int i = 0; i < arrayLength; i++) {
            sum += in.nextInt();
        }

        System.out.println(sum);
        return sum;
    }

    /**
     * @return
     */
    public static String countIntTypes() {
        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        int currentInt;
        int positives = 0, negatives = 0, zeros = 0;

        for (int i = 0; i < arrayLength; i++) {
            currentInt = in.nextInt();

            if (currentInt > 0) {
                positives++;
            } else if (currentInt < 0) {
                negatives++;
            } else {
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
     * @return
     */
    public static String circularRotation() {
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int numRotations = in.nextInt();
        int numQueries = in.nextInt();
        int currentIndex;
        in.nextLine();
        String[] numbersArray = in.nextLine().split(Constants.SPACE);
        List<String> numbers = new LinkedList<String>(Arrays.asList(numbersArray));
        String lastValue, result = Constants.EMPTY;

        for (int i = 0; i < numRotations; i++) {
            lastValue = numbers.get(arraySize - 1);
            numbers.remove(arraySize - 1);
            numbers.add(0, lastValue);
        }

        for (int i = 0; i < numQueries; i++) {
            currentIndex = in.nextInt();
            result += numbers.get(currentIndex) + Constants.NEW_LINE;
        }

        System.out.println(result);
        return result;
    }

    /**
     * Invert an array given as a line of integers
     *
     * @return The array representation as string with the elements in inverse order.
     */
    public static String invertArray() {
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        in.nextLine();
        String arrayInfo = in.nextLine();
        String[] array = arrayInfo.split(" ");
        StringBuilder inverseArray = new StringBuilder();

        for (int i = array.length - 1; i >= 0; i--) {
            inverseArray.append(array[i]);
            inverseArray.append(" ");
        }

        in.close();
        return inverseArray.toString().trim();
    }

    /**
     * Calculate the max sum of elements in the available hourglasses
     *
     * @param n Matrix height
     * @param m Matrix width
     * @return max sum of elements in the available hourglasses
     */
    public static int maxHourglass(int n, int m) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[n][m];
        int max = Integer.MIN_VALUE, sum;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + 2 < n && j + 2 < m) {
                    sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] +
                            matrix[i + 1][j + 1] + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
                    max = sum > max ? sum : max;
                }

            }
        }

        in.close();
        return max;
    }

    /**
     * Rotate elements of an array to the left position n times
     *
     * @return Array with the final state after all rotations
     */
    public static String leftRotation() {
        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        int leftSteps = in.nextInt();
        int[] oldArray = new int[arrayLength];
        int[] newArray = new int[oldArray.length];

        for (int i = 0; i < oldArray.length; i++) {
            oldArray[i] = in.nextInt();
        }

        for (int i = 0; i + leftSteps < oldArray.length; i++) {
            newArray[i] = oldArray[i + leftSteps];
        }

        for (int i = 0; i < leftSteps; i++) {
            newArray[arrayLength - leftSteps + i] = oldArray[i];
        }

        in.close();
        String rotatedArray = Arrays.toString(newArray);
        return rotatedArray.substring(1, rotatedArray.length() - 1).replaceAll(",", "");
    }
}
