package co.zero.geekalgorithm.hackerrank.warmup;

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        int[] clouds1 = {0, 1, 0, 0, 0, 1, 0}; //Expected result = 3
        int[] clouds2 = {0, 0, 1, 0, 0, 1, 0}; //Expected result = 4
        int[] clouds3 = {0, 0, 0, 0, 1, 0}; //Expected result = 3
        int[] clouds4 = {0, 1, 0, 1, 0, 0}; //Expected result = 3
        int[] clouds5 = {0, 0, 0, 0, 0}; //Expected result = 2

        System.out.println("jumpingOnClouds(clouds1) = " + jumpingOnClouds(clouds1));
        System.out.println("jumpingOnClouds(clouds2) = " + jumpingOnClouds(clouds2));
        System.out.println("jumpingOnClouds(clouds3) = " + jumpingOnClouds(clouds3));
        System.out.println("jumpingOnClouds(clouds4) = " + jumpingOnClouds(clouds4));
        System.out.println("jumpingOnClouds(clouds5) = " + jumpingOnClouds(clouds5));
    }

    private static int jumpingOnClouds(int[] c) {
        int steps = 0;

        for (int i=0; i < c.length - 1; i++) {
            if (i < c.length - 2 && c[i + 2] == 0) {
                i++;
            }

            steps++;
        }

        return steps;
    }
}
