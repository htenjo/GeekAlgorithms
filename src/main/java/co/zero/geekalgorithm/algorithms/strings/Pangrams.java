package co.zero.geekalgorithm.algorithms.strings;

public class Pangrams {
    public static String pangrams(String s) {
        return s.toLowerCase().chars()
                .filter(Character::isLetter)
                .distinct()
                .count() == 26 ? "pangram" : "not pangram";
    }
}
