package co.zero.geekalgorithm.hackerrank.booking.nearby_attractions;

import java.util.Comparator;

/**
 * Created by hernan on 8/22/16.
 */
public class TravelOption implements Comparator<TravelOption>{
    private Point point;
    private TransportType transportType;
    private int timeWilling;
    private boolean acceptable;
    private double distance;

    public TravelOption(double latitud, double longitude, TransportType transportType, int timeWilling) {
        this.transportType = transportType;
        this.timeWilling = timeWilling;
        this.point = new Point(latitud, longitude);
    }

    @Override
    public int compare(TravelOption opt1, TravelOption opt2) {
        if(opt1.distance > opt2.distance){
            return 1;
        }else if (opt1.distance < opt2.distance){
            return -1;
        }else{
            return 0;
        }
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public int getTimeWilling() {
        return timeWilling;
    }

    public void setTimeWilling(int timeWilling) {
        this.timeWilling = timeWilling;
    }

    public boolean isAcceptable() {
        return acceptable;
    }

    public void setAcceptable(boolean acceptable) {
        this.acceptable = acceptable;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
