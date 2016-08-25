package co.zero.geekalgorithm.hackerrank.booking.nearby_attractions;

import java.util.Scanner;

/**
 * Created by htenjo on 8/24/16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NearbyAttractions nearbyAttractions = new NearbyAttractions();
        int numberOfAttractions = in.nextInt();

        for(int i=0; i < numberOfAttractions; i++){
            nearbyAttractions.processAttractionLine(in, nearbyAttractions);
        }

        int numTestCases = in.nextInt();

        for (int i = 0; i < numTestCases; i++) {
            nearbyAttractions.processTravelOption(in, nearbyAttractions);
        }
    }
}
