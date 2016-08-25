package co.zero.geekalgorithm.util;

import co.zero.geekalgorithm.hackerrank.booking.nearby_attractions.Point;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

/**
 * Created by htenjo on 8/24/16.
 */
public class MathUtils {
    /**
     * This algorithm calculate the distance between two points using the
     * Law of Cosines for Spherical Trigonometry
     * @param pointA
     * @param pointB
     * @return The distance between the points
     */
    public static double getCubeDistanceBetween(Point pointA, Point pointB){
        double pointALatitude = convertDegreesToRadians(pointA.getLatitude());
        double pointALongitude = convertDegreesToRadians(pointA.getLongitude());
        double pointBLatitude = convertDegreesToRadians(pointB.getLatitude());
        double pointBLongitude = convertDegreesToRadians(pointB.getLongitude());

        return Math.acos(
                Math.sin(pointALatitude) * Math.sin(pointBLatitude) +
                        Math.cos(pointALatitude) * Math.cos(pointBLatitude) *
                                Math.cos(pointBLongitude - pointALongitude)) * Constants.MATH_EARTH_RADIUS_DEFAULT;
    }

    /**
     *
     * @param number
     * @param minDecimals
     * @param maxDecimals
     * @return
     */
    public static String formatDecimalRounded(double number, int minDecimals, int maxDecimals){
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(minDecimals);
        formatter.setMaximumFractionDigits(maxDecimals);
        formatter.setRoundingMode(RoundingMode.HALF_UP);
        return formatter.format(number);
    }

    public static double roundDecimal(double number, int decimals){
        BigDecimal bd = new BigDecimal(number);
        bd = bd.setScale(decimals, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    /**
     * Transform the given degrees to radians
     * @param degrees
     * @return The equivalent in radians of the given degrees
     */
    public static double convertDegreesToRadians(double degrees){
        return Constants.MATH_PI_DEFAULT * degrees / 180;
    }

    public static void main(String[] args) {
        System.out.println(MathUtils.roundDecimal(2.3467, 2));
        System.out.println(MathUtils.roundDecimal(3.4522, 2));
    }
}
