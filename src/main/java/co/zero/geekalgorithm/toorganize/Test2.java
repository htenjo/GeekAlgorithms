package co.zero.geekalgorithm.toorganize;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Test2 {
    static int minimumNumberOfTrips(int tripMaxWeight, int[] packagesWeight) {
        LinkedList<Integer> weightList = new LinkedList<>();
        int minNumberOfTrips = 0;
        int lastWeight = 0, lastIndexMin=-1;

        for(int i : packagesWeight){
            weightList.add(i);
        }

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer d1, Integer d2) {
                return d1 < d2 ? -1 : 1;
            }
        };
        Collections.sort(weightList, c);


        while (weightList.size() > 0) {
            lastWeight = weightList.getLast();

            for(int i=0; i < weightList.size(); i++) {
                System.out.println(lastWeight + " - " + weightList.get(i));

                if(weightList.get(i) + lastWeight <= tripMaxWeight) {
                    lastIndexMin = i;
                } else {
                    break;
                }
            }

            minNumberOfTrips++;
            weightList.removeLast();

            if(weightList.size() > 0 && lastIndexMin >= 0) {
                weightList.remove(lastIndexMin);
            }

            lastIndexMin = -1;
        }

        return minNumberOfTrips;
    }

    // The first line of the input contains two decimal integers separated by space: the maximum weight ('W') that can be delivered in a single trip and the quantity of packages ('P') to be delivered.
    // The following 'P' lines contain a decimal integer representing the weight of each package.

    public static void main(String[] args) {
        int tripMaxWeight = 100;
        //int[] packagesWeight = new int[]{50, 70, 75, 90, 95, 1, 2, 15, 100};
        //int[] packagesWeight = new int[]{70, 10, 20};
        int[] packagesWeight = new int[]{70, 10, 20, 50};
        int minimumNumberOfTrips = minimumNumberOfTrips(tripMaxWeight, packagesWeight);
        System.out.println(minimumNumberOfTrips);
    }
}
