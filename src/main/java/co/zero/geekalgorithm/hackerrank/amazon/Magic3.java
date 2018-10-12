package co.zero.geekalgorithm.hackerrank.amazon;

/**
 * A number ending with 3 will have a multiple which is all 1. Eg­ multiple of 3 is 111 and of
 * 13 is 111111. Given a number ending with 3 find its least multiple which is all 1. The
 * 2 multiple of the given number can be beyond the range of int,long etc. Optimize for time.
 */
class Magic3 {
    static double getMinOnlyOneMultiple(int N) {
        double i = 1;

        while (i % N != 0) {
            i = i * 10 + 1;
        }

        return i;
    }
}
