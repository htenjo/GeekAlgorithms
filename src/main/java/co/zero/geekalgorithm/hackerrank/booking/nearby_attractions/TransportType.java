package co.zero.geekalgorithm.hackerrank.booking.nearby_attractions;

/**
 * Created by hernan on 8/22/16.
 */
public enum TransportType{
    foot(){
        public double getSpeed(){
            return 5;
        }
    },
    bike(){
        public double getSpeed(){
            return 15;
        }
    },
    metro(){
        public double getSpeed(){
            return 20;
        }
    };

    public abstract double getSpeed();
}

