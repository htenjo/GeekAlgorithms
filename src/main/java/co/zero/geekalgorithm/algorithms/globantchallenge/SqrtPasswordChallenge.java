package co.zero.geekalgorithm.algorithms.globantchallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class SqrtPasswordChallenge {
    static int R = 0, E = 1, G = 2, U = 3, L = 4, A = 5, T = 6, I = 7, O = 8, N = 9;
    
    public static void main(String[] args) {
        CompletableFuture.allOf(
                CompletableFuture.runAsync(() -> search("::: A", new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0})),
                CompletableFuture.runAsync(() -> search("::: B", new int[]{2, 0, 0, 0, 0, 0, 0, 0, 0, 0})),
                CompletableFuture.runAsync(() -> search("::: C", new int[]{3, 0, 0, 0, 0, 0, 0, 0, 0, 0})),
                CompletableFuture.runAsync(() -> search("::: D", new int[]{4, 0, 0, 0, 0, 0, 0, 0, 0, 0})),
                CompletableFuture.runAsync(() -> search("::: E", new int[]{5, 0, 0, 0, 0, 0, 0, 0, 0, 0})),
                CompletableFuture.runAsync(() -> search("::: F", new int[]{6, 0, 0, 0, 0, 0, 0, 0, 0, 0})),
                CompletableFuture.runAsync(() -> search("::: G", new int[]{7, 0, 0, 0, 0, 0, 0, 0, 0, 0})),
                CompletableFuture.runAsync(() -> search("::: H", new int[]{8, 0, 0, 0, 0, 0, 0, 0, 0, 0})),
                CompletableFuture.runAsync(() -> search("::: I", new int[]{9, 0, 0, 0, 0, 0, 0, 0, 0, 0}))
        ).join();
    }
    
    private static void search(String threadName, int[] digits) {
        while (digits[0] != 0) {
            increaseDigits(digits, digits.length - 1);
            long number1 = getNumber(digits);
            
            if (hasDistinctDigits(digits) && Math.sqrt(number1) % 1 == 0) {
                long number2 = getNumber(digits[R], digits[U], digits[L], digits[E]);
                
                if (Math.sqrt(number2) % 1 == 0) {
                    System.out.printf("::: Thread[%s] - number1[%s] - sqrt[%s]\n", threadName, number1, Math.sqrt(number1));
                    System.out.printf("::: Thread[%s] - number2[%s] - sqrt[%s]\n", threadName, number2, Math.sqrt(number2));
                }
            }
        }
    }
    
    private static long getNumber(int... digits) {
        String stringNumber = Arrays.stream(digits).mapToObj(Integer::toString).collect(Collectors.joining(""));
        return Long.parseLong(stringNumber);
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
// R E G U L A T I O N
// 7 6 8 0 5 9 4 3 2 1
//
// R U L E
// 7 0 5 6
// I G N O R E A L L
// 3 8 1 2 7 6 9 5 5
