package co.zero.geekalgorithm.hackerrank.amazon;

public class Magic3 {

    public static void main(String[] args) {
        System.out.println("getMinOnlyOneMultiple(03) = " + getMinOnlyOneMultiple(3));
        System.out.println("getMinOnlyOneMultiple(13) = " + getMinOnlyOneMultiple(13));
        System.out.println("getMinOnlyOneMultiple(23) = " + getMinOnlyOneMultiple(23));
        System.out.println("getMinOnlyOneMultiple(33) = " + getMinOnlyOneMultiple(33));
        System.out.println("getMinOnlyOneMultiple(43) = " + getMinOnlyOneMultiple(43));
        System.out.println("getMinOnlyOneMultiple(53) = " + getMinOnlyOneMultiple(53));
        System.out.println("getMinOnlyOneMultiple(63) = " + getMinOnlyOneMultiple(63));
        System.out.println("getMinOnlyOneMultiple(73) = " + getMinOnlyOneMultiple(73));
        System.out.println("getMinOnlyOneMultiple(83) = " + getMinOnlyOneMultiple(83));
        System.out.println("getMinOnlyOneMultiple(93) = " + getMinOnlyOneMultiple(93));
        System.out.println("getMinOnlyOneMultiple(HUGE) = " + getMinOnlyOneMultiple(999999993));
    }

    private static double getMinOnlyOneMultiple(int N) {
        double i = 1;

        while (i % N != 0) {
            i = i * 10 + 1;
        }

        return i;
    }
}
