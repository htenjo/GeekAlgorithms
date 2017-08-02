package co.zero.geekalgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hernan on 8/1/17.
 */
public class Skillmetter {
    public static void main(String[] args) {
        List<Integer> data1 = Arrays.asList(1, 4, 7);
        List<Integer> data2 = Arrays.asList(123, -2, 477, 3, 14, 6551);

        Skillmetter obj = new Skillmetter();

        int result = obj.fold(data1);
        System.out.println(result);

        int yourAnswer = obj.fold(data2); //what is the answer for this one???
        System.out.println(yourAnswer);
    }

    private int fold(List<Integer> input) {
        if (input.size() == 1) {
            return input.get(0);
        } else if (input.size() > 1) {
            int firstNumber = input.get(0);
            List<Integer> newList = new ArrayList<>();

            for(int i=1; i < input.size(); i++){
                newList.add(input.get(i) + firstNumber);
            }

            return fold(newList);

        } else {
            throw new IllegalArgumentException("Invalid input size");
        }
    }
}
