package co.zero.geekalgorithm.algorithms.strings;

import java.util.HashSet;

public class TwoStringsAreSubstrings {

    static String twoStrings(String s1, String s2) {
        String bigString = s1.length() > s2.length() ? s1 : s2;
        String smallString = s1.length() <= s2.length() ? s1 : s2;
        HashSet<Character> dictionary = new HashSet<>();

        for (int i=0; i < bigString.length(); i++) {
            dictionary.add(bigString.charAt(i));
        }

        for (int i=0; i < smallString.length(); i++) {
            if (dictionary.contains(smallString.charAt(i))) {
                return "YES";
            }
        }

        return "NO";
    }
}
