package co.zero.geekalgorithm.hackerrank.arrays;

class ArrayLeftRotation {
    /**
     * Rotate elements of an array (size n: 1 <= n <= 10^5) to the left direction d times
     * @param a array to be processed 1 <= a[i] <= 10^6
     * @param d numerber of positions to rotate in left direction. 1 <= d <= n
     * @return Array with the final state after all rotations
     */
    static int[] rotateLeft(int[] a, int d) {
        int[] newArray = new int[a.length];

        for (int i = 0; i + d < a.length; i++) {
            newArray[i] = a[i + d];
        }

        for (int i = 0; i < d; i++) {
            newArray[a.length - d + i] = a[i];
        }

        return newArray;
    }
}