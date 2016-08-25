package co.zero.geekalgorithm.hackerrank.booking.nearby_attractions;

import java.util.Scanner;

/**
 * Created by htenjo on 8/24/16.
 */
public class Main {
    public static void main(String[] args) {
        NearbyAttractions nearbyAttractions = new NearbyAttractions();
        nearbyAttractions.processInput();
        String result = nearbyAttractions.processClosestAttractions();
        System.out.println(result);
    }
}
