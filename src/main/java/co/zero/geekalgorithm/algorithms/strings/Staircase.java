package co.zero.geekalgorithm.algorithms.strings;

public class Staircase {
    public static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j + 1 >= n) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            
            if (i + 1 < n) {
                System.out.println();
            }
        }
    }
}
