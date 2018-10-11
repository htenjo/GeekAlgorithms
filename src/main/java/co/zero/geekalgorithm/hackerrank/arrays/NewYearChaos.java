package co.zero.geekalgorithm.hackerrank.arrays;

public class NewYearChaos {

    // 0 1 2 3 4
    // 2 1 5 3 4
    static void minimumBribes(int[] q) {
//        int bribes = 0;
//        int normalPosition = 0;
//
//        for (int i = 0; i < q.length; i++) {
//            normalPosition = q[i] - 1;
//            // If q[i] - 1 > i -> q[i] -1 - i <= 2
//            if (normalPosition > i && normalPosition - 2 > i) {
//                System.out.println("Too chaotic");
//                return;
//            }
//
//            if (normalPosition > i) { //Bribes for sure
//                bribes += normalPosition - i;
//            } else if (normalPosition <= i && i < q.length - 1 && q[i] > q[i + 1]) { // Maybe bribe with i + 1
//                bribes ++;
//            } else if (normalPosition <= i && i < q.length - 2 && q[i] > q[i + 2]) { // Maybe bribe with i + 1
//                bribes ++;
//            }
//        }
//
//        System.out.println(Integer.toString(bribes));

        int ans = 0;

        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] - 3 > i) {
                System.out.println("Too chaotic");
                return;
            }

            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                if (q[j] > q[i]) {
                    ans++;
                }
            }
        }

        System.out.println(Integer.toString(ans));
    }


}
