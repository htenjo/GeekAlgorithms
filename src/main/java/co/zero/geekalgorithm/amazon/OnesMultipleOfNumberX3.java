package co.zero.geekalgorithm.amazon;

public class OnesMultipleOfNumberX3 {
    
    public static void main(String[] args) {
        System.out.println(findMultipleOfN(3));
        System.out.println(findMultipleOfN(13));
        System.out.println(findMultipleOfN(23));
        System.out.println(findMultipleOfN(33));
        System.out.println(findMultipleOfN(53));
        System.out.println(";;;;" + (4 % 16) + "-" + (16 % 4));
    }
    
    /**
     * N is a number ending in 3
     * NOTE: A % B = (A + kB) % B
     */
    
    public static String findMultipleOfN(int n) {
        int i, m = 1;
        String answer = "1";
        int[] array = {0,1};
        for (i = 1; i <= n; i++) {
            if (m == 0) {
                return answer;
            }
            
            answer = answer + "1";
            m = (10 * m + 1) % n;
        }
        
        return null;
    }
    
}
