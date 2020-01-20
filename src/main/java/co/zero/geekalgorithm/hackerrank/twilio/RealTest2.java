package co.zero.geekalgorithm.hackerrank.twilio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RealTest2 {
    public static long kSub(int k, List<Integer> nums) {
        Map<Integer, List<Integer>> pairs = new HashMap<>();
        int currentSum = 0, numSize = nums.size(), subArrayCounter = 0;

        for (int i = 0; i < numSize; i++) {
            currentSum += nums.get(i);
            List<Integer> list = pairs.get(currentSum % k);

            if (null != list) {
                list.add(i);
            } else {
                list = new ArrayList<>();
                list.add(i);
            }

            pairs.put(currentSum % k, list);
        }

        for (Map.Entry<Integer, List<Integer>> entry : pairs.entrySet()) {
            Integer key = entry.getKey();
            Integer listSize = entry.getValue().size();

            if (key == 0) {
                subArrayCounter += (listSize * (listSize + 1)) / 2;
            } else {
                subArrayCounter += (listSize * (listSize - 1)) / 2;
            }
        }

        return subArrayCounter;
    }

    // Driver code
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
//        nums.add(5);
//        nums.add(10);
//        nums.add(11);
//        nums.add(9);
//        nums.add(5);
//        int k = 5;
        int k = 3;
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(1);


        int n = args.length;
        System.out.println(kSub(k, nums));
    }
}
