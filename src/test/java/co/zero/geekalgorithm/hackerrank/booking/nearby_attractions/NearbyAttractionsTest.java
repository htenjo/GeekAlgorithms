package co.zero.geekalgorithm.hackerrank.booking.nearby_attractions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by htenjo on 8/25/16.
 */
public class NearbyAttractionsTest {
    private static InputStream stdin;

    @BeforeClass
    public static void setUp() throws Exception {
        stdin = System.in;
    }

    @AfterClass
    public static void tearDown() throws Exception{
        System.setIn(stdin);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void processClosestAttractions() throws Exception {
        String inputData =
                "10\n" +
                "1 52.378281 4.900070\n" +
                "2 52.373634 4.890289\n" +
                "3 52.375737 4.896547\n" +
                "4 52.372995 4.893096\n" +
                "5 52.376237 4.902860\n" +
                "6 52.367066 4.893381\n" +
                "7 52.366537 4.911348\n" +
                "14 52.368832 4.892744\n" +
                "15 52.357895 4.892835\n" +
                "35 52.342497 4.855094\n" +
                "5\n" +
                "52.379141 4.880590 metro 80\n" +
                "52.358835 4.893867 foot 60\n" +
                "52.375859 4.886006 foot 30\n" +
                "52.371700 4.899070 metro 30\n" +
                "52.364055 4.898446 foot 60\n";
        String outputData =
                "2 4 3 1 14 5 6 15 7 35\n" +
                "15 6 14 7 4 2 3 5 1 35\n" +
                "2 4 3 14 1 6 5 7 15\n" +
                "4 3 14 5 2 6 1 7 15 35\n" +
                "6 14 15 7 4 2 3 5 1 35\n";


        System.setIn(new ByteArrayInputStream(inputData.getBytes()));
        NearbyAttractions nearbyAttractions = new NearbyAttractions();
        nearbyAttractions.processInput();
        String result = nearbyAttractions.processClosestAttractions();
        assertEquals(outputData, result);
    }
}