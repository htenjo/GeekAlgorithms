package co.zero.geekalgorithm.hackerrank.booking.nearby_attractions;

/**
 * Created by hernan on 8/22/16.
 */
public class Attraction{
    private int id;
    private Point point;
    private double distance;

    public Attraction(int id, double latitude, double longitude) {
        this.id = id;
        this.point = new Point(latitude, longitude);
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

    @Override
    public String toString() {
        return "Attraction{" +
                "id=" + id +
                ", distance=" + distance +
                '}';
    }
}
