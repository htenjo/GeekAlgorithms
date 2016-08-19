package co.zero.geekalgorithm.util;

/**
 * Class that implements useful related time functions required in the algorithms study
 * Created by htenjo on 8/19/16.
 */
public class TimeUtils {
    /**
     * Prints the current time in millisecond by the standard output
     * @return the current time in millis (usually required to calculate time required by an algorithm)
     */
    public static long printCurrentTimeInMillis(){
        long currentTime = System.currentTimeMillis();
        System.out.println("::: CurrentTime = " + currentTime);
        return currentTime;
    }

    /**
     * Prints the current and the difference with the given time
     * @param startTime Initial time to compare with the current time
     * @return the difference between currentTime - startTime
     */
    public static long printDifferenceTimeInMillis(long startTime){
        long currentTime = System.currentTimeMillis();
        System.out.println("::: CurrentTime = " + currentTime + " ms");
        long differenceTime = currentTime - startTime;
        System.out.println("::: DifferenceTime = " + differenceTime  + " ms");
        return differenceTime;
    }
}
