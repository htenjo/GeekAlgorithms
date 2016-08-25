package co.zero.geekalgorithm.hackerrank.booking.nearby_attractions;

import java.util.Comparator;

/**
 * Created by htenjo on 8/24/16.
 */
public class AttractionComparator implements Comparator<Attraction>{
    @Override
    public int compare(Attraction opt1, Attraction opt2) {
        if(opt1.getDistance() > opt2.getDistance()){
            return 1;
        }else if (opt1.getDistance() < opt2.getDistance()){
            return -1;
        }else{
            if(opt1.getId() > opt2.getId()) {
                return 1;
            }else if(opt1.getId() > opt2.getId()){
                return -1;
            }else{
                return 0;
            }
        }
    }
}
