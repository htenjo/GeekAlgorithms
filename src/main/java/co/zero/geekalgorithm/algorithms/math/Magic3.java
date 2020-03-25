package co.zero.geekalgorithm.algorithms.math;

/**
 * A number ending with 3 will have a multiple which is all 1. Eg­ multiple of 3 is 111 and of
 * 13 is 111111. Given a number ending with 3 find its least multiple which is all 1. The
 * 2 multiple of the given number can be beyond the range of int,long etc. Optimize for time.
 */
public class Magic3 {
    public static double getMinOnlyOneMultipleOfThree(int N) {
        double i = 1;

        while (i % N != 0) { // when %0 is multiple
            i = i * 10 + 1;
        }

        return i;
    }
    
    /**
     * N is a number ending in 3
     * NOTE: A % B = (A + kB) % B
     */
    public static String findMultipleOfN(int n) {
        int i, m = 1;
        String answer = "1";
        
        for (i = 1; i <= n; i++) {
            if (m == 0) {
                return answer;
            }
            
            answer = answer + "1";
            m = (10 * m + 1) % n;
        }
        
        return null;
    }
    
    public static void main(String[] args) {
        System.out.println(findMultipleOfN(3));
        System.out.println(findMultipleOfN(13));
        System.out.println(findMultipleOfN(23));
        System.out.println(findMultipleOfN(33));
        System.out.println(findMultipleOfN(53));
        System.out.println(";;;;" + (4 % 16) + "-" + (16 % 4));
    }
}
