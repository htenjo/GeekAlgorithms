package co.zero.geekalgorithm.toorganize;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * John works at a clothing store. He has a large pile of socks that he must pair by color for sale.
 * Given an array of integers representing the color of each sock, determine how many pairs of socks
 * with matching colors there are.
 *
 * For example, there are n=7 socks with colors ar=[1,2,1,2,1,3,2].
 * There is one pair of color 1 and one of color 1. There are three odd socks left, one of each color.
 * The number of pairs is .
 */
public class SockMerchant {

    public static void main(String[] args) {
        //int sockColors[] = {1,2,1,2,1,3,2};
        int sockColors[] = {10,20,20,10,10,30,50,10,20, 20, 20, 20};
        int pairsWithMaps = sockMerchantWithMaps(sockColors.length, sockColors);
        int pairsWithSets = sockMerchantWithSets(sockColors.length, sockColors);
        System.out.println("pairsWithMaps = " + pairsWithMaps);
        System.out.println("pairsWithSets = " + pairsWithSets);
    }

    /**
     * Solution using maps
     * Time complexity ~ O(2N)
     * Space complexity ~ O(N)
     */
    private static int sockMerchantWithMaps(int n, int[] sockColors) {
        Map<Integer, Integer> counter = new HashMap<>();
        int pairs = 0;

        for (int color : sockColors) {
            if (counter.containsKey(color)) {
                counter.put(color, counter.get(color) + 1);
            } else {
                counter.put(color, 1);
            }
        }

        for (Entry<Integer, Integer> entry : counter.entrySet()) {
            pairs += entry.getValue() / 2;
        }

        return pairs;
    }

    /**
     * Solution using Sets (Better than using maps)
     * Time complexity ~ O(N)
     * Space complexity ~ O(N)
     */
    private static int sockMerchantWithSets(int n, int[] sockColors) {
        Set<Integer> colors = new HashSet<>();
        int pairs = 0;

        for (int color : sockColors) {
            if (colors.contains(color)) {
                pairs++;
                colors.remove(color);
            } else {
                colors.add(color);
            }
        }

        return pairs;
    }
}
