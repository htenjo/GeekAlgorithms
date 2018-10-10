package co.zero.geekalgorithm.hackerrank.warmup;


/**
 * Given an infinite string generated when repeating the pattern S infinite times,
 * take the first N characters and verify the amount of 'a's the sequence has.
 * PRE:
 * - 1 <= s <= 100
 * - 1 <= n <= 10^12
 */
class RepeatedString {
    static long repeatedString(String pattern, long n) {
        char a = 'a';
        int aCountInS = countLetterInS(pattern, a);
        long repetitions = n / pattern.length();
        int highIndexMissing = (int) (n - repetitions * pattern.length());
        return aCountInS * repetitions + countLetterInS(pattern.substring(0, highIndexMissing), a);
    }

    private static int countLetterInS(String s, char letter) {
        int counter = 0;

        for (int i=0; i < s.length(); i ++) {
            if (s.charAt(i) == letter) {
                counter++;
            }
        }

        return counter;
    }
}
