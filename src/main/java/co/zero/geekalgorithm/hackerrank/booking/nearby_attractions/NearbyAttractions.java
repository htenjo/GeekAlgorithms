package co.zero.geekalgorithm.hackerrank.booking.nearby_attractions;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hernan on 8/22/16.
 */
public class NearbyAttractions {
    private static final double PI = 3.14159265359;
    private static final double EARTH_RADIUS = 6371;
    private List<Attraction> attractions;
    private List<TravelOption> options;

    public NearbyAttractions() {
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(int attractionId, double attractionLatitud, double attractionLongitude){
        Attraction attraction = new Attraction(attractionId, attractionLatitud, attractionLongitude);
        attractions.add(attraction);
    }

    public void addTravelOption(double attractionLatitude, double attractionLongitude,
                                int timeWilling, TransportType transportType){
        TravelOption option = new TravelOption(attractionLatitude, attractionLongitude, transportType, timeWilling);
        options.add(option);
    }

    public boolean isAcceptableOption(TravelOption option){

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NearbyAttractions nearbyAttractions = new NearbyAttractions();
        int numberOfAttractions = in.nextInt();

        for(int i=0; i < numberOfAttractions; i++){
            processAttractionLine(in, nearbyAttractions);
        }

        int numTestCases = in.nextInt();

        for (int i = 0; i < numTestCases; i++) {
            processTravelOption(in, nearbyAttractions);
        }
    }

    private static void processAttractionLine(Scanner in, NearbyAttractions nearbyAttractions){
        double attractionLatitude = in.nextDouble();
        double attractionLongitude = in.nextDouble();
        int attractionId = in.nextInt();
        nearbyAttractions.addAttraction(attractionId, attractionLatitude, attractionLongitude);
    }

    private static void processTravelOption(Scanner in, NearbyAttractions nearbyAttractions){
        double hotelLatitude = in.nextDouble();
        double hotelLongitude = in.nextDouble();
        String transport = in.next();
        TransportType transportType = TransportType.valueOf(transport);
        int timeWilling = in.nextInt();
        nearbyAttractions.addTravelOption(hotelLatitude, hotelLongitude, timeWilling, transportType);
    }

    /**
     *
     * @param pointA
     * @param pointB
     * @return
     */
    private static double distanceBetween(Point pointA, Point pointB){
        double pointALatitude = convertDegreesToRadians(pointA.getLatitude());
        double pointALongitude = convertDegreesToRadians(pointA.getLongitude());
        double pointBLatitude = convertDegreesToRadians(pointB.getLatitude());
        double pointBLongitude = convertDegreesToRadians(pointB.getLongitude());

        return Math.acos(
                Math.sin(pointALatitude) * Math.sin(pointBLatitude) +
                Math.cos(pointALatitude) * Math.cos(pointBLatitude) *
                        Math.cos(pointBLongitude - pointALongitude)) * EARTH_RADIUS;
    }

    /**
     *
     * @param number
     * @param minDecimals
     * @param maxDecimals
     * @return
     */
    private static String getDecimalRounded(double number, int minDecimals, int maxDecimals){
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(minDecimals);
        formatter.setMaximumFractionDigits(maxDecimals);
        formatter.setRoundingMode(RoundingMode.HALF_UP);
        return formatter.format(number);
    }

    /**
     * Transform the given degrees to radians
     * @param degrees
     * @return The equivalent in radians of the given degrees
     */
    private static double convertDegreesToRadians(double degrees){
        return PI * degrees / 180;
    }
}



