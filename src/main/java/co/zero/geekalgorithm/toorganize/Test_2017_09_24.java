package co.zero.geekalgorithm.toorganize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test_2017_09_24 {
    static List<Integer> greatestFlightRangeDrones(Integer numberOfRequiredDrones, List<Drone> drones, List<Integer> inMaintenanceDrones) {
        // TODO: implement this function

        Map<Integer, Drone> droneMap = new HashMap<>();
        Drone currentDrone;

        //Fill a map with all drones
        for(int i=0; i<drones.size();i++){
            currentDrone = drones.get(i);
            droneMap.put(currentDrone.getId(), currentDrone);
        }

        //filter unavailable drones
        for(int i=0; i<inMaintenanceDrones.size(); i++) {
            droneMap.remove(inMaintenanceDrones.get(i));
        }


        Comparator<Drone> c = new Comparator<Drone>() {
            @Override
            public int compare(Drone d1, Drone d2) {
                return d2.getFlightRange() > d1.getFlightRange() ? 1 : -1;
            }
        };

        List<Drone> droneAvailable = new ArrayList<>(droneMap.values());
        Collections.sort(droneAvailable, c);
        List<Integer> availableDroneIds = new ArrayList<>();

        for(int i = 0; i < droneAvailable.size() && i < numberOfRequiredDrones ; i++){
            availableDroneIds.add(droneAvailable.get(i).getId());
        }

        return availableDroneIds;
    }


    private static class Drone {
        private int id;
        private int flightRange;

        public Drone(int id, int flightRange) {

            this.id = id;
            this.flightRange = flightRange;
        }

        public int getId() {
            return id;
        }

        public int getFlightRange() {
            return flightRange;
        }
    }

    // The first line of the input contains three decimal integers separated by space: total number of drones ('D'), number of drones to be selected ('G') and number of drones in maintenance ('M').
    // The following 'D' lines each contains two decimal integers separated by space with information about each drone: ID and flight range in kilometers.
    // The following 'M' lines each contains the numeric ID of a drone currently in maintenance.

    // Print the IDs of the 'G' selected drones to the standard output, one per line, sorted by flight range (greater first).
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfDrones = in.nextInt();
        int numberOfRequiredDrones = in.nextInt();
        int numberOfDronesInMaintenance = in.nextInt();

        List<Drone> drones = new ArrayList<>();
        List<Integer> inMaintenanceDrones = new ArrayList<>();

        for(int i=0; i< numberOfDrones; i++) {
            drones.add(new Drone(in.nextInt(), in.nextInt()));
        }

        for(int i=0; i< numberOfDronesInMaintenance; i++) {
            inMaintenanceDrones.add(in.nextInt());
        }

        List<Integer> greatestFlightRangeDrones = greatestFlightRangeDrones(numberOfRequiredDrones, drones, inMaintenanceDrones);

        for(int i=0; i < greatestFlightRangeDrones.size(); i++) {
            System.out.println(greatestFlightRangeDrones.get(i));
        }

    }
}
