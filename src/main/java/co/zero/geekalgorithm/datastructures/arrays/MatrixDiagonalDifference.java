package co.zero.geekalgorithm.datastructures.arrays;

import java.util.List;

public class MatrixDiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumToLeft = 0, sumToRight = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            sumToRight += arr.get(i).get(i);
            sumToLeft += arr.get(i).get(arr.size() - 1 - i);
        }
        
        return Math.abs(sumToRight - sumToLeft);
    }
}
