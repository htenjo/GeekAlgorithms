package co.zero.geekalgorithm.hackerrank.booking.nearby_attractions;

import co.zero.geekalgorithm.util.MathUtils;

/**
 * Created by hernan on 8/22/16.
 */
public class Point{
    private double latitude;
    private double longitude;

    public Point(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
