package co.zero.geekalgorithm.amazon;

public class Palindromes {
    
    public static void main(String[] args) {
        String example1 = "anna";
        String example2 = "anitalavalatina";
        String example3 = "ann";
        String example4 = "a";
        String example5 = "axxxxxx";
        String example6 = "ZERIMARRAMIREZ";
        
        System.out.println("::: Example1 - " + example1 + ": " + isPalindromeRecursive(example1));
        System.out.println("::: Example2 - " + example2 + ": " + isPalindromeRecursive(example2));
        System.out.println("::: Example3 - " + example3 + ": " + isPalindromeRecursive(example3));
        System.out.println("::: Example4 - " + example4 + ": " + isPalindromeRecursive(example4));
        System.out.println("::: Example5 - " + example5 + ": " + isPalindromeRecursive(example5));
        System.out.println("::: Example6 - " + example6 + ": " + isPalindromeRecursive(example6));
        System.out.println("::: =====================================");
        System.out.println("::: Example1 - " + example1 + ": " + isPalindromeIterative(example1));
        System.out.println("::: Example2 - " + example2 + ": " + isPalindromeIterative(example2));
        System.out.println("::: Example3 - " + example3 + ": " + isPalindromeIterative(example3));
        System.out.println("::: Example4 - " + example4 + ": " + isPalindromeIterative(example4));
        System.out.println("::: Example5 - " + example5 + ": " + isPalindromeIterative(example5));
        System.out.println("::: Example6 - " + example6 + ": " + isPalindromeIterative(example6));
        
    }
    
    private static boolean isPalindromeIterative(String letters) {
        boolean isPalindrome = true;
        
        for (int i = 0; i < letters.length() / 2 && isPalindrome; i++) {
            isPalindrome &= letters.charAt(i) == letters.charAt(letters.length() - 1 - i);
        }
        
        return isPalindrome;
    }
    
    private static boolean isPalindromeRecursive(String letters) {
        if (letters.length() < 2) {
            return true;
        } else if (letters.length() == 2) {
            return letters.charAt(0) == letters.charAt(1);
        } else {
            return letters.charAt(0) == letters.charAt(letters.length() - 1)
                    && isPalindromeRecursive(letters.substring(1, letters.length() - 1));
        }
    }
}
