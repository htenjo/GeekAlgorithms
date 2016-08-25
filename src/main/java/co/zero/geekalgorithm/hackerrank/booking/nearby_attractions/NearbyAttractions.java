package co.zero.geekalgorithm.hackerrank.booking.nearby_attractions;

import co.zero.geekalgorithm.util.Constants;
import co.zero.geekalgorithm.util.MathUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by hernan on 8/22/16.
 */
public class NearbyAttractions {
    private List<Attraction> attractions;
    private List<TravelOption> options;
    private TreeSet<Attraction> reachableAttractions;

    /**
     *
     */
    public NearbyAttractions() {
        this.attractions = new ArrayList<>();
        this.options = new ArrayList<>();
        this.reachableAttractions = new TreeSet<>(new AttractionComparator());
    }

    /**
     *
     * @param attractionId
     * @param attractionLatitude
     * @param attractionLongitude
     */
    private void addAttraction(int attractionId, double attractionLatitude, double attractionLongitude){
        Attraction attraction = new Attraction(attractionId, attractionLatitude, attractionLongitude);
        attractions.add(attraction);
    }

    /**
     *
     * @param attractionLatitude
     * @param attractionLongitude
     * @param timeWilling
     * @param transportType
     */
    private void addTravelOption(double attractionLatitude, double attractionLongitude,
                                int timeWilling, TransportType transportType){
        TravelOption option = new TravelOption(attractionLatitude, attractionLongitude, transportType, timeWilling);
        options.add(option);
    }

    /**
     *
     * @param in
     */
    private void processAttractionLine(Scanner in){
        int attractionId = in.nextInt();
        double attractionLatitude = in.nextDouble();
        double attractionLongitude = in.nextDouble();
        addAttraction(attractionId, attractionLatitude, attractionLongitude);
    }

    /**
     *
     * @param in
     */
    private void processTravelOption(Scanner in){
        double hotelLatitude = in.nextDouble();
        double hotelLongitude = in.nextDouble();
        String transport = in.next();
        TransportType transportType = TransportType.valueOf(transport);
        int timeWilling = in.nextInt();
        addTravelOption(hotelLatitude, hotelLongitude, timeWilling, transportType);
    }

    /**
     *
     */
    public void processInput(){
        Scanner in = new Scanner(System.in);
        int numberOfAttractions = in.nextInt();

        for(int i=0; i < numberOfAttractions; i++){
            processAttractionLine(in);
        }

        int numTestCases = in.nextInt();

        for (int i = 0; i < numTestCases; i++) {
            processTravelOption(in);
        }
    }

    /**
     *
     * @return
     */
    public String processClosestAttractions(){
        StringBuilder query = new StringBuilder();
        double distance, speed, time;

        for (TravelOption option : options) {
            reachableAttractions.clear();

            for(Attraction attraction : attractions){
                distance = MathUtils.getCubeDistanceBetween(option.getPoint(), attraction.getPoint()); //KM
                distance = MathUtils.roundDecimal(distance, 2);
                speed = option.getTransportType().getSpeed(); // KM/H
                time = option.getTimeWilling() * 1.0 / Constants.TIME_MINUTES_IN_HOUR; //KM

                if(time >= distance / speed){
                    attraction.setDistance(distance);
                    reachableAttractions.add(attraction);
                }
            }

            for(Attraction attraction : reachableAttractions){
                query.append(attraction.getId());
                query.append(Constants.SPACE);
            }

            query.deleteCharAt(query.length() - 1);
            query.append(Constants.NEW_LINE);
        }

        return query.toString();
    }
}



