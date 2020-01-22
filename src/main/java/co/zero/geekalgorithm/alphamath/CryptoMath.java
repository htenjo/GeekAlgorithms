package co.zero.geekalgorithm.alphamath;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CryptoMath {
    
    private static int E = 0, A = 1, R = 2, T = 3, H = 4, V = 5, N = 6, U = 7, S = 8;
    private static int[] digits = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
    
    public static void main(String[] args) {
        for (int i = 0; i < 999999999; i++) {
            increaseDigits(digits, digits.length - 1);
            
            if (hasDistinctDigits(digits)) {
                if (getEarthNumber() + getVenusNumber() + getUranusNumber() == getSaturnNumber()) {
                    System.out.println("digits = " + Arrays.toString(digits));
                }
            }
        }
    }
    
    private static int getEarthNumber() {
        return getNumber(digits[E], digits[A], digits[R], digits[T], digits[H]);
    }
    
    private static int getVenusNumber() {
        return getNumber(digits[V], digits[E], digits[N], digits[U], digits[S]);
    }
    
    private static int getUranusNumber() {
        return getNumber(digits[U], digits[R], digits[A], digits[N], digits[U], digits[S]);
    }
    
    private static int getSaturnNumber() {
        return getNumber(digits[S], digits[A], digits[T], digits[U], digits[R], digits[N]);
    }
    
    private static int getNumber(int... digits) {
        String stringNumber = Arrays.stream(digits).mapToObj(Integer::toString).collect(Collectors.joining(""));
        return Integer.parseInt(stringNumber);
    }
    
    private static boolean hasDistinctDigits(int[] digits) {
        Set<Integer> digitSet = new HashSet<>();
        Arrays.stream(digits).forEach(digitSet::add);
        return digitSet.size() == digits.length;
    }
    
    private static void increaseDigits(int[] digits, int currentIndex) {
        if (currentIndex >= 0) {
            if (digits[currentIndex] + 1 > 9) {
                digits[currentIndex] = 0;
                increaseDigits(digits, --currentIndex);
            } else {
                digits[currentIndex] = digits[currentIndex] + 1;
            }
        }
    }
    
}

