package co.zero.geekalgorithm.hackerrank.warmup;

public class CountingValleys {

    public static void main(String[] args) {
        String path1 = "DDUUUUDD"; //expected 1 valley
        String path2 = "UDDDUDUU"; //expected 1 valley
        String path3 = "UDDDUUUDDU"; //expected 2

        System.out.println("CountingValleys1 = " + countingValleys(path1.length(), path1));
        System.out.println("CountingValleys2 = " + countingValleys(path2.length(), path2));
        System.out.println("CountingValleys3 = " + countingValleys(path3.length(), path3));
    }

    private static int countingValleys(int n, String s) {
        int currentPosition = 0, lastPosition = 0;
        int valleys = 0;

        for (char c : s.toCharArray()) {
            if (c == 'D') {
                currentPosition--;
            } else {
                currentPosition++;
            }

            if (lastPosition == 0 && currentPosition < 0) {
                valleys++;
            }

            lastPosition = currentPosition;
        }

        return valleys;
    }
}
