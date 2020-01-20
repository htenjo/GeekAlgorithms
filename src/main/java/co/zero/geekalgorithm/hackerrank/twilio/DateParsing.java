package co.zero.geekalgorithm.hackerrank.twilio;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateParsing {
    public static String[] reformatDate(String[] dates) throws ParseException {
        String cleanDate;
        String startPattern = "dd MMM yyyy";
        String endPattern = "yyyy-MM-dd";
        SimpleDateFormat startFormat = new SimpleDateFormat(startPattern);
        SimpleDateFormat endFormat = new SimpleDateFormat(endPattern);

        for(int i=0; i<dates.length; i++ ){
            cleanDate = removeOrdinalSufix(dates[i]);
            dates[i] = endFormat.format(startFormat.parse(cleanDate));
        }

        return dates;
    }

    private static String removeOrdinalSufix(String date){
        return date.replaceAll("(?<=\\d)(st|nd|rd|th)", "");
    }
}
