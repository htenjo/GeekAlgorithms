package co.zero.geekalgorithm.hackerrank.twilio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RealTest1 {
    public static List<String> missingwords(String s, String t) {
        String SPACE = " ";
        List<String> allWords = Arrays.stream(s.split(SPACE)).collect(Collectors.toList());
        List<String> subSetWords = Arrays.stream(t.split(SPACE)).collect(Collectors.toList());
        allWords.removeAll(subSetWords);
        return allWords;
    }

    public static void main(String[] args) {
//        String s = "I am using HackerRank to improve programming";
//        String t = "am HackerRank to improve";

        String s = "I am using hackerrank to improve programming improve";
        String t = "am hackerrank to improve";

//        String s = "I love programming";
//        String t = "programming";

        List<String> result = missingwords(s, t);
        System.out.println(result);
    }
}
