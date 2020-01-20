package co.zero.geekalgorithm.hackerrank.twilio;

import java.util.Arrays;
import java.util.Comparator;

public final class StringFunctions {
    public static final String SPACE = " ";
    public static final String EMPTY = "";

    /**
     * Given a string, find the largest word that has even length
     */
    public static final String findLargestWordWithEvenLenght(String statement) {
        if (statement == null || statement.length() < 1) {
            return EMPTY;
        }

        //1. Split the string
        return Arrays.stream(statement.split(SPACE))
                //2. Identity even length
                .filter(StringFunctions::hasEvenLength)
                //3. Get the width with mac length
                .max(Comparator.comparingInt(String::length))
                .orElse(EMPTY);
    }

    private static final boolean hasEvenLength(String string) {
        return string.length() % 2 == 0;
    }
}
