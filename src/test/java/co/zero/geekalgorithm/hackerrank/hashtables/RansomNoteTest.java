package co.zero.geekalgorithm.hackerrank.hashtables;

import org.junit.Test;

public class RansomNoteTest {

    @Test
    public void test1() {
        String[] magazine = "give me one grand today night".split(" ");
        String[] note = "give one grand today".split(" ");
        System.out.print("Expected1 => Yes :::: ");
        RansomNote.checkMagazine(magazine, note);
    }

    @Test
    public void test2() {
        String[] magazine = "two times three is not four".split(" ");
        String[] note = "two times two is four".split(" ");
        System.out.print("Expected2 => No :::: ");
        RansomNote.checkMagazine(magazine, note);
    }

    @Test
    public void test3() {
        String[] magazine = "ive got a lovely bunch of coconuts".split(" ");
        String[] note = "ive got some coconuts".split(" ");
        System.out.print("Expected3 => No :::: ");
        RansomNote.checkMagazine(magazine, note);
    }
}


