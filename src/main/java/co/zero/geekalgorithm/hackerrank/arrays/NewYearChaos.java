package co.zero.geekalgorithm.hackerrank.arrays;

public class NewYearChaos {
    static void minimumBribes(int[] q) {
        int ans = 0;

        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] - 3 > i) {
                System.out.println("Too chaotic");
                return;
            }

            // Compares from left -> right by 3 positions
            // If the most left is > than the most right then there is a bribe.
            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                if (q[j] > q[i]) {
                    ans++;
                }
            }
        }

        System.out.println(Integer.toString(ans));
    }
}
