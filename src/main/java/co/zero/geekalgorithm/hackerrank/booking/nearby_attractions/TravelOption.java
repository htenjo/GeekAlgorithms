package co.zero.geekalgorithm.hackerrank.booking.nearby_attractions;

import java.util.Comparator;

/**
 * Created by hernan on 8/22/16.
 */
public class TravelOption{
    private Point point;
    private TransportType transportType;
    private int timeWilling;

    public TravelOption(double latitud, double longitude, TransportType transportType, int timeWilling) {
        this.transportType = transportType;
        this.timeWilling = timeWilling;
        this.point = new Point(latitud, longitude);
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
}
