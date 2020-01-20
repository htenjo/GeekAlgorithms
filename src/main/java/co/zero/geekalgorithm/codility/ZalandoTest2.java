package co.zero.geekalgorithm.codility;

import java.util.Arrays;

public class ZalandoTest2 {



    private String getMaxAmplitudeSeason(int[] arrayAmplitud, int amplitudeWinter, int amplitudeSpring, int amplitudeSummer, int amplitudeAutumn) {
        if (arrayAmplitud[3] == amplitudeWinter) {
            return "WINTER";
        } else if (arrayAmplitud[3] == amplitudeSpring) {
            return "SPRING";
        } else if (arrayAmplitud[3] == amplitudeSummer) {
            return "SUMMER";
        } else {
            return "AUTUMN";
        }
    }

    private int getMinimum(int[] T, int minIndex, int maxIndex) {
        int min = Integer.MAX_VALUE;

        for (int i = minIndex; i < maxIndex; i++) {
            if (min > T[i]) {
                min = T[i];
            }
        }

        return min;
    }

    private int getMaximum(int[] T, int minIndex, int maxIndex) {
        int max = Integer.MIN_VALUE;

        for (int i = minIndex; i < maxIndex; i++) {
            if (max < T[i]) {
                max = T[i];
            }
        }

        return max;
    }

    public String solution(int[] T) {
        int seasonLength = T.length / 4;
        int minIndex = 0;
        int winterRightIndex = seasonLength;
        int springRightIndex = winterRightIndex + seasonLength;
        int summerRightIndex = springRightIndex + seasonLength;

        int amplitudeWinter = getMaximum(T, minIndex, winterRightIndex) - getMinimum(T, minIndex, winterRightIndex);
        int amplitudeSpring = getMaximum(T, winterRightIndex, springRightIndex) - getMinimum(T, winterRightIndex, springRightIndex);
        int amplitudeSummer = getMaximum(T, springRightIndex, summerRightIndex) - getMinimum(T, springRightIndex, summerRightIndex);
        int amplitudeAutumn = getMaximum(T, summerRightIndex, T.length) - getMinimum(T, summerRightIndex, T.length);
        int[] arrayAmplitud = new int[]{amplitudeWinter, amplitudeSpring, amplitudeSummer, amplitudeAutumn};
        Arrays.sort(arrayAmplitud);
        return getMaxAmplitudeSeason(arrayAmplitud, amplitudeWinter, amplitudeSpring, amplitudeSummer, amplitudeAutumn);
    }

    public static void main(String[] args) {
        ZalandoTest2 test = new ZalandoTest2();
        int[] T = new int[]{-3, -14, -5, 7, 8, 42, 8, 3};
        int[] T2 = new int[]{2, -3, 3, 1, 10, 8, 2, 5, 13, -5, 3, -18};
        System.out.println("ZalandoTest.main " + test.solution(T2));
    }
}
