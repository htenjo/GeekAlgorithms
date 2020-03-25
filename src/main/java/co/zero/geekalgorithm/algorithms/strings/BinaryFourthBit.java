package co.zero.geekalgorithm.algorithms.strings;

public class BinaryFourthBit {
    public static int fourthBit(int num) {
        String binaryNumber = Integer.toBinaryString(num);

        if (binaryNumber.length() < 4) {
            return 0;
        } else {
            if (binaryNumber.charAt(binaryNumber.length() - 4) == '0') {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static void main(String[] args) {
        //1000010110111010
        //1000010110111010
        System.out.println("Integer.toBinaryString(34234) = " + fourthBit(23));
    }
}
