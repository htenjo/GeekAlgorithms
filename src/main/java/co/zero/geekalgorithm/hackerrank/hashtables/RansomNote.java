package co.zero.geekalgorithm.hackerrank.hashtables;

import java.util.HashMap;

public class RansomNote {
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> wordsInMagazine = new HashMap<>();

        for(String word : magazine) {
            if (wordsInMagazine.containsKey(word)) {
                wordsInMagazine.put(word, wordsInMagazine.get(word) + 1);
            } else {
                wordsInMagazine.put(word, 1);
            }
        }

        for(String word : note) {
            if(wordsInMagazine.keySet().contains(word) && wordsInMagazine.get(word) > 0) {
                wordsInMagazine.put(word, wordsInMagazine.get(word) - 1);
            }else {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
