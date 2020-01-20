package co.zero.geekalgorithm.codility;

import java.util.Arrays;

public class ZalandoTest {

    public String solution(int A, int B) {
        String letterA = "a";
        String letterB = "b";
        StringBuilder finalString = new StringBuilder();
        String currentLetter = letterA;
        boolean isA = true;
        int counter = 0;

        for (int i = 0; i < A + B; i++) {
            if (counter < 2) {
                finalString.append(currentLetter);
                counter++;
            } else {
                counter = 1;
                currentLetter = isA ? letterB : letterA;
                finalString.append(currentLetter);
                isA = !isA;

            }
        }

        return finalString.toString();
    }

    public String solution2(int A, int B) {
        int arrayLength = A + B;
        String[] word = new String[arrayLength];
        int index=2;

        for (int i=0; i<A; i++){
            word[i] = "a";
        }

        for (int i=0; i<B; i++) {
            if (arrayLength - index > 2) {
                word[index] = "b";
                word[arrayLength - 1] = "a";
                index = index + 2;
            }else {
                word[index] = "b";
                word[index+1] = "b";
                word[arrayLength - 1] = "a";
                word[arrayLength - 2] = "a";
            }
        }

        return Arrays.toString(word).substring(1, word.length);
    }

    public static void main(String[] args) {
        ZalandoTest test = new ZalandoTest();

        System.out.println("ZalandoTest.main 1 - " + test.solution(5, 3));
        System.out.println("ZalandoTest.main 2 - " + test.solution2(3, 3));
    }
}
