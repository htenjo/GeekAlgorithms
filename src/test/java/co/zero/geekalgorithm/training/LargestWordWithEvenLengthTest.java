package co.zero.geekalgorithm.training;

import co.zero.geekalgorithm.algorithms.strings.LargestWordWithEvenLength;
import org.junit.Assert;
import org.junit.Test;

/**
 * All test cases follow the GIVEN_WHEN_THEN naming convention
 */
public class LargestWordWithEvenLengthTest {
    @Test
    public void findLargestWordWithEvenLenght_null_empty(){
        String test = null;
        String response = LargestWordWithEvenLength.findLargestWordWithEvenLength(test);
        Assert.assertEquals(LargestWordWithEvenLength.EMPTY, response);
    }

    @Test
    public void findLargestWordWithEvenLenght_empty_empty(){
        String test1 = "", test2 = "      ";
        String response = LargestWordWithEvenLength.findLargestWordWithEvenLength(test1);
        Assert.assertEquals(LargestWordWithEvenLength.EMPTY, response);

        response = LargestWordWithEvenLength.findLargestWordWithEvenLength(test2);
        Assert.assertEquals(LargestWordWithEvenLength.EMPTY, response);
    }

    @Test
    public void findLargestWordWithEvenLenght_singleWordOdd_empty(){
        String test = "asd";
        String response = LargestWordWithEvenLength.findLargestWordWithEvenLength(test);
        Assert.assertEquals(LargestWordWithEvenLength.EMPTY, response);
    }

    @Test
    public void findLargestWordWithEvenLenght_singleWordEven_sameWord(){
        String test = "asdf";
        String response = LargestWordWithEvenLength.findLargestWordWithEvenLength(test);
        Assert.assertEquals(test, response);
    }


    @Test
    public void findLargestWordWithEvenLenght_multipleWordsAllOdd_empty(){
        String test = "a asd asdsd asdasdd asdasdasdar";

        String response = LargestWordWithEvenLength.findLargestWordWithEvenLength(test);
        Assert.assertEquals(LargestWordWithEvenLength.EMPTY, response);
    }

    @Test
    public void findLargestWordWithEvenLenght_multipleWordsAllEven_longestWord(){
        String test1 = "as asas asasas asasasas asasasasas";
        String test2 = "as asas asasas asasasas asasa asasasasas";
        String test3 = "asasasasas asas asasas asasasas as";
        String maxWord = "asasasasas";

        String response = LargestWordWithEvenLength.findLargestWordWithEvenLength(test1);
        Assert.assertEquals(maxWord, response);

        response = LargestWordWithEvenLength.findLargestWordWithEvenLength(test2);
        Assert.assertEquals(maxWord, response);

        response = LargestWordWithEvenLength.findLargestWordWithEvenLength(test3);
        Assert.assertEquals(maxWord, response);
    }

    @Test
    public void findLargestWordWithEvenLenght_multipleWordsWithEvenAndOdd_longestEvenWord(){
        String test1 = "a asas asasas asasasas asasasasa";
        String test2 = "as asa asasasas asasasa asasa";
        String test3 = "asasasas asas asasa asasasa as asasasas";
        String maxWord = "asasasas";

        String response = LargestWordWithEvenLength.findLargestWordWithEvenLength(test1);
        Assert.assertEquals(maxWord, response);

        response = LargestWordWithEvenLength.findLargestWordWithEvenLength(test2);
        Assert.assertEquals(maxWord, response);

        response = LargestWordWithEvenLength.findLargestWordWithEvenLength(test3);
        Assert.assertEquals(maxWord, response);
    }
}
