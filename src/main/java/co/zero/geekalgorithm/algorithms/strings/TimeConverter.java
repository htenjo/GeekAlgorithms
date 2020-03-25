package co.zero.geekalgorithm.algorithms.strings;

public class TimeConverter {
    
    public static String timeConversion(String s) {
        String timePostfix = s.substring(s.length() - 2).toUpperCase();
        String time24h;
        int hour = Integer.parseInt(s.substring(0, 2));
        
        if ("AM".equals(timePostfix) && hour == 12) {
            time24h = "00";
        } else if ("PM".equals(timePostfix) && hour != 12) {
            time24h = Integer.toString((hour + 12) % 24);
        } else {
            time24h = Integer.toString(hour);
        }
        
        time24h = time24h.length() < 2 ? "0" + time24h : time24h;
        return time24h + s.substring(2, s.length() - 2);
    }
}
