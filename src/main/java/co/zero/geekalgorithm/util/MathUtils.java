package co.zero.geekalgorithm.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by htenjo on 8/24/16.
 */
public class MathUtils {
    
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

}
