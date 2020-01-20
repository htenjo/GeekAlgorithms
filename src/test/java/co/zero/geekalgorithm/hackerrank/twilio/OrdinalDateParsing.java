package co.zero.geekalgorithm.hackerrank.twilio;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.util.Arrays;

public class OrdinalDateParsing {
    @Test
    public void test1() throws ParseException {
        String[] dates = new String[]{
                "20th Oct 2052",
                " 6th Jun 1933",
                " 26th May 1960",
                " 20th Sep 1958",
                " 16th Mar 2068",
                " 25th May 1912",
                " 16th Dec 2018",
                " 26th Dec 2061",
                " 4th Nov 2030",
                " 28th Jul 1963"
        };

        String[] expectedDates = new String[]{
                "2052-10-20",
                "1933-06-06",
                "1960-05-26",
                "1958-09-20",
                "2068-03-16",
                "1912-05-25",
                "2018-12-16",
                "2061-12-26",
                "2030-11-04",
                "1963-07-28"
        };

        String[] result = DateParsing.reformatDate(dates);
//        System.out.println(Arrays.toString(result));
        Assert.assertTrue(Arrays.deepEquals(expectedDates, result));
    }
}
