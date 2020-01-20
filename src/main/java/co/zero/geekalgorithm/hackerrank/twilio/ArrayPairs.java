package co.zero.geekalgorithm.hackerrank.twilio;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayPairs {
    public static int numberOfPairs(int[] array, int target) {
        Set<String> pairs = new HashSet<>();
        int op1, op2;
        Arrays.sort(array);

        if (array[array.length - 1] + array[array.length - 2] < target) {
            return 0;
        }

        for(int i=array.length - 1; i >= 0; i--) {
            op1 = array[i];

            if (op1 < target / 2) {
                break;
            }

            for (int j=i-1; j >= 0; j--){
                op2 = array[j];

                if (op1 + op2 == target) {
                    pairs.add("" + op1 + ", " + op2);
                }
            }
        }

        return pairs.size();
    }
}
