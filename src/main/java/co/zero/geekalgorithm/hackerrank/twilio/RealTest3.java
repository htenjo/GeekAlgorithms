package co.zero.geekalgorithm.hackerrank.twilio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class RealTest3 {

    public static void customSort(List<Integer> arr) {
        TreeMap<Integer, Set<Integer>> sortedByFreq = new TreeMap<>();
        HashMap<Integer, Integer> valueCounter = new HashMap<>();

        for (Integer value : arr) {
            if (!valueCounter.containsKey(value)) {
                valueCounter.put(value, 0);
            }

            valueCounter.put(value, valueCounter.get(value) + 1);

            if (!sortedByFreq.containsKey(valueCounter.get(value))) {
                sortedByFreq.put(valueCounter.get(value), new TreeSet<>());
            }

            if (sortedByFreq.containsKey(valueCounter.get(value) - 1)) {
                sortedByFreq.get(valueCounter.get(value) - 1).remove(value);
            }

            sortedByFreq.get(valueCounter.get(value)).add(value);
        }

        arr.clear();

        for(int key : sortedByFreq.keySet()) {
            for (int orderedValue : sortedByFreq.get(key)) {
                int counter = 0, duplicated = valueCounter.get(orderedValue);

                while (counter < duplicated) {
//                    arr.add(orderedValue);
                    System.out.println(orderedValue);
                    counter++;
                }
            }
        }
    }

    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>();
//        arr.add(4);
//        arr.add(5);
//        arr.add(6);
//        arr.add(5);
//        arr.add(4);
//        arr.add(3);
//
//        customSort(arr);
//
//        System.out.println(arr);

        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(4);

        customSort(arr);

//        System.out.println(arr);
    }
}
