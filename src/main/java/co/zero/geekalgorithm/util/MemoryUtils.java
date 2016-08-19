package co.zero.geekalgorithm.util;

/**
 * Class that implements useful functions required in the algorithms study
 * Created by htenjo on 8/19/16.
 */
public class MemoryUtils {
    public static final int MEGA_BYTE_SIZE = 1024;

    /**
     * Utility method to print the footprint information at the beginning of test
     */
    public static void printStartMemoryUse(){
        Runtime.getRuntime().gc();
        printMemoryUse("Init");
    }

    /**
     * Utility method to print the footprint information at the end of test
     */
    public static void printEndMemoryUse(){
        printMemoryUse("End");
    }

    private static void printMemoryUse(String prefix){
        long totalMemory = Runtime.getRuntime().totalMemory() / MEGA_BYTE_SIZE;
        long freeMemory = Runtime.getRuntime().freeMemory() / MEGA_BYTE_SIZE;
        long usedMemory = totalMemory - freeMemory;
        System.out.print(String.format("[%sTotalMemory = %d KB] ", prefix, totalMemory));
        System.out.print(String.format("[%sFreeMemory = %d KB] ", prefix, freeMemory));
        System.out.println(String.format("[%sUsedMemory = %d KB]", prefix, usedMemory));
    }
}
