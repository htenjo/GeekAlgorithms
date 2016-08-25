package co.zero.geekalgorithm.hackerrank.booking.nearby_attractions;

/**
 * Created by hernan on 8/22/16.
 */
public class Attraction{
    private int id;
    private Point point;
    private double distance;
    private boolean reachable;

    public Attraction(int id, double latitud, double longitud) {
        this.id = id;
        this.point = new Point(latitud, longitud);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public boolean isReachable() {
        return reachable;
    }

    public void setReachable(boolean reachable) {
        this.reachable = reachable;
    }
}
