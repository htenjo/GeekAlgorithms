package co.zero.geekalgorithm.hackerrank.booking.nearby_attractions;

import co.zero.geekalgorithm.util.Constants;
import co.zero.geekalgorithm.util.MathUtils;

import java.util.*;

/**
 * Created by hernan on 8/22/16.
 */
public class NearbyAttractions {
    private TreeSet<Attraction> attractions;
    private List<TravelOption> options;

    /**
     *
     */
    public NearbyAttractions() {
        this.attractions = new TreeSet<>(new AttractionComparator());
        this.options = new ArrayList<>();
    }

    /**
     *
     * @param attractionId
     * @param attractionLatitud
     * @param attractionLongitude
     */
    public void addAttraction(int attractionId, double attractionLatitud, double attractionLongitude){
        Attraction attraction = new Attraction(attractionId, attractionLatitud, attractionLongitude);
        attractions.add(attraction);
    }

    /**
     *
     * @param attractionLatitude
     * @param attractionLongitude
     * @param timeWilling
     * @param transportType
     */
    public void addTravelOption(double attractionLatitude, double attractionLongitude,
                                int timeWilling, TransportType transportType){
        TravelOption option = new TravelOption(attractionLatitude, attractionLongitude, transportType, timeWilling);
        options.add(option);
    }

    /**
     *
     * @param in
     */
    public void processAttractionLine(Scanner in){
        double attractionLatitude = in.nextDouble();
        double attractionLongitude = in.nextDouble();
        int attractionId = in.nextInt();
        addAttraction(attractionId, attractionLatitude, attractionLongitude);
    }

    /**
     *
     * @param in
     * @param nearbyAttractions
     */
    public void processTravelOption(Scanner in, NearbyAttractions nearbyAttractions){
        double hotelLatitude = in.nextDouble();
        double hotelLongitude = in.nextDouble();
        String transport = in.next();
        TransportType transportType = TransportType.valueOf(transport);
        int timeWilling = in.nextInt();
        addTravelOption(hotelLatitude, hotelLongitude, timeWilling, transportType);
    }

    /**
     *
     * @return
     */
    public String processClosestAttractions(){
        StringBuilder query = new StringBuilder();
        double distance, speed, time;

        for (TravelOption option : options) {
            for(Attraction attraction : attractions){
                distance = MathUtils.getCubeDistanceBetween(option.getPoint(), attraction.getPoint()); //KM
                speed = option.getTransportType().getSpeed(); // KM/H
                time = option.getTimeWilling() / Constants.TIME_MINUTES_IN_HOUR; //KM

                if(time <= distance / speed){
                    attraction.setReachable(true);
                    attraction.setDistance(distance);
                }
            }

            for(Attraction attraction : attractions){
                query.append(attraction.getId());
                query.append(Constants.SPACE);
            }

            query.append(Constants.NEW_LINE);
        }
    }
}



