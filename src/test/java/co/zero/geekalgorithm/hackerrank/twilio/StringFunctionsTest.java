package co.zero.geekalgorithm.hackerrank.twilio;

import org.junit.Assert;
import org.junit.Test;

/**
 * All test cases follow the GIVEN_WHEN_THEN naming convention
 */
public class StringFunctionsTest {
    @Test
    public void findLargestWordWithEvenLenght_null_empty(){
        String test = null;
        String response = StringFunctions.findLargestWordWithEvenLenght(test);
        Assert.assertEquals(StringFunctions.EMPTY, response);
    }

    @Test
    public void findLargestWordWithEvenLenght_empty_empty(){
        String test1 = "", test2 = "      ";
        String response = StringFunctions.findLargestWordWithEvenLenght(test1);
        Assert.assertEquals(StringFunctions.EMPTY, response);

        response = StringFunctions.findLargestWordWithEvenLenght(test2);
        Assert.assertEquals(StringFunctions.EMPTY, response);
    }

    @Test
    public void findLargestWordWithEvenLenght_singleWordOdd_empty(){
        String test = "asd";
        String response = StringFunctions.findLargestWordWithEvenLenght(test);
        Assert.assertEquals(StringFunctions.EMPTY, response);
    }

    @Test
    public void findLargestWordWithEvenLenght_singleWordEven_sameWord(){
        String test = "asdf";
        String response = StringFunctions.findLargestWordWithEvenLenght(test);
        Assert.assertEquals(test, response);
    }


    @Test
    public void findLargestWordWithEvenLenght_multipleWordsAllOdd_empty(){
        String test = "a asd asdsd asdasdd asdasdasdar";

        String response = StringFunctions.findLargestWordWithEvenLenght(test);
        Assert.assertEquals(StringFunctions.EMPTY, response);
    }

    @Test
    public void findLargestWordWithEvenLenght_multipleWordsAllEven_longestWord(){
        String test1 = "as asas asasas asasasas asasasasas";
        String test2 = "as asas asasas asasasas asasa asasasasas";
        String test3 = "asasasasas asas asasas asasasas as";
        String maxWord = "asasasasas";

        String response = StringFunctions.findLargestWordWithEvenLenght(test1);
        Assert.assertEquals(maxWord, response);

        response = StringFunctions.findLargestWordWithEvenLenght(test2);
        Assert.assertEquals(maxWord, response);

        response = StringFunctions.findLargestWordWithEvenLenght(test3);
        Assert.assertEquals(maxWord, response);
    }

    @Test
    public void findLargestWordWithEvenLenght_multipleWordsWithEvenAndOdd_longestEvenWord(){
        String test1 = "a asas asasas asasasas asasasasa";
        String test2 = "as asa asasasas asasasa asasa";
        String test3 = "asasasas asas asasa asasasa as asasasas";
        String maxWord = "asasasas";

        String response = StringFunctions.findLargestWordWithEvenLenght(test1);
        Assert.assertEquals(maxWord, response);

        response = StringFunctions.findLargestWordWithEvenLenght(test2);
        Assert.assertEquals(maxWord, response);

        response = StringFunctions.findLargestWordWithEvenLenght(test3);
        Assert.assertEquals(maxWord, response);
    }
}
