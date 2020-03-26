package co.zero.geekalgorithm.datastructures.arrays;

public class Array2DHourGlass {
    
    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int sum;
        
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 2; j++) {
                sum = getSumInHourGlass(i, j, arr);
                System.out.print(sum + " ");
                max = Math.max(max, sum);
            }
            System.out.println();
        }
        
        return max;
    }
    
    private static int getSumInHourGlass(int i, int j, int[][] arr) {
        return arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                + arr[i + 1][j + 1]
                + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
    }
    
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int[][] arr2 = new int[][]{
                {-9, -9, -9, 1, 1, 1,},
                {0, -9, 0, 4, 3, 2,},
                {-9, -9, -9, 1, 2, 3,},
                {0, 0, 8, 6, 6, 0,},
                {0, 0, 0, -2, 0, 0,},
                {0, 0, 1, 2, 4, 0}
        };

//        System.out.println("hourglassSum(arr1) = " + hourglassSum(arr1));
        System.out.println("hourglassSum(arr2) = " + hourglassSum(arr2));
    }
}
