package co.zero.geekalgorithm.hackerrank.arrays;

import org.junit.Test;

public class NewYearChaosTest {

    @Test
    public void validArrayWithoutBribes() {
        int[] q = new int[]{1, 2, 3, 4, 5, 6};
        System.out.print("validArray(0) = ");
        NewYearChaos.minimumBribes(q);
    }

    @Test
    public void validArray() {
        int[] q = new int[]{2, 1, 5, 3, 4};
        System.out.print("validArray(3) = ");
        NewYearChaos.minimumBribes(q);
    }

    @Test
    public void chaosArray() {
        int[] q = new int[]{2, 5, 1, 3, 4};
        System.out.print("chaosArray(chaos) = ");
        NewYearChaos.minimumBribes(q);
    }

    @Test
    public void chaosArrayLarge() {
        int[] q = new int[]{5, 1, 2, 3, 7, 8, 6, 4};
        System.out.print("chaosArrayLarge(chaos) = ");
        NewYearChaos.minimumBribes(q);
    }

    //     0  1  2  3  4  5  6  7
    //     --------------------------
    //     1  2  3  4  5  6  7  8
    //     1  2  5  3  4  6  7  8 (2)
    //     1  2  5  3  7  4  6  8 (2)
    //     1  2  5  3  7  8  4  6 (2)
    //     1  2  5  3  7  8  6  4 (1)
    //NR   0  1  4  2  6  7  5  3       normalPosition <= i && i < q.length - 1 && q[i] > q[i + 1]
    //                                  normalPosition <= i && i < q.length - 2 && q[i] > q[i + 2]
    //     ---------------------------
    //-B   0  0  2 -1  2  2 -1 -4
    @Test
    public void validArrayLarge() {
        int[] q = new int[]{1, 2, 5, 3, 7, 8, 6, 4};
        System.out.print("validArrayLarge (7) = ");
        NewYearChaos.minimumBribes(q);
    }

    //     1  2  3  4  5  6  7  8
    //     1  2  5  3  4  6  7  8 (2)
    //     1  2  5  3  4  7  6  8 (1)
    //     1  2  5  3  7  8  4  6 (3)
    //     -----------------------
    //     0  0  2  -1 2  2  -3 -2
    @Test
    public void validArrayLargeX() {
        int[] q = new int[]{1, 2, 5, 3, 7, 8, 4, 6};
        System.out.print("validArrayLargeX (6) = ");
        NewYearChaos.minimumBribes(q);
    }

    //      0  1  2  3  4  5  6  7
    //      -------------------------
    //      1, 2, 3, 4, 5, 6, 7, 8
    //      1, 2, 3, 4, 5, 8, 6, 7 (2)
    //      3, 1, 2, 4, 5, 8, 6, 7 (2)
    //      3, 2, 1, 4, 5, 8, 6, 7 (1)
    //      3, 2, 5, 1, 4, 8, 6, 7 (2)
    //  (idx - 1)
    //      2, 1, 4, 0, 3, 7, 5, 6
    @Test
    public void validArrayValuesNonOneBased() {
        int[] q = new int[]{3, 2, 5, 1, 4, 8, 6, 7};
        System.out.print("validArrayValuesNonOneBased (7) = ");
        NewYearChaos.minimumBribes(q);
    }

    //       0,  1,  2,  3,  4,  5,  6,  7
    //      x1, x2, x3, x4, x5, x6, x7, x8
    //      15, 16, 17, 18, 19, 20, 21, 22
    //      17, 15, 16, 18, 19, 20, 21, 22 (2)
    //      17, 18, 15, 16, 19, 20, 21, 22 (2)
    //      17, 18, 19, 15, 16, 20, 21, 22 (2)
    //      7, 8, 9, 10, 11, 12, 5, 6 (6)
    //      3, 4, 5, 6, 7, 8, 1, 2
    @Test
    public void validArrayValuesNonOneBased2() {
        int[] q = new int[]{3, 4, 5, 6, 7, 8, 1, 2};
        System.out.print("validArrayValuesNonOneBased2 (12) = ");
        NewYearChaos.minimumBribes(q);
    }


    //      5, 6, 7, 8, 9, 10, 11, 12
    //      7, 5, 6  8  9  10  11  12   (2)
    //      7, 6, 5, 8  9  10  11  12   (1)
    //      3, 2, 1, 4, 5, 6, 7, 8
    @Test
    public void validArrayValuesNonOneBased3() {
        int[] q = new int[]{3, 2, 1, 4, 5, 6, 7, 8};
        System.out.print("validArrayValuesNonOneBased3 (3) = ");
        NewYearChaos.minimumBribes(q);
    }
}