package co.zero.geekalgorithm.hackerrank.booking.nearby_attractions;

/**
 * Created by hernan on 8/22/16.
 */
public class Attraction {
    private int id;
    private Point point;

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
}
