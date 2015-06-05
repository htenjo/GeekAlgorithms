//=======================================================================
// ARCHIVO FibonacciFunction.java
// FECHA CREACIÓN: 22/04/2014
//=======================================================================
package co.zero.recursive;

import java.util.HashMap;
import java.util.Map;

/**
 * Some algorithms to calculate the Fibonacci Numbers
 * @author Hernán Tenjo
 * @version 1.0
 */
public class FibonacciFunction {
	//Cache to avoid repeating calculations
	private static Map<Long, Long> calculatedNumbers = new HashMap<Long, Long>();
	
	/**
	 * This method calculates the fibonacci number in a standard way (simple recursion)
	 * @param number The paramater N for fibonacci function
	 * @return The fibonacci number
	 */
	public static int calculateRecursive(long number){
		if(number == 0){
			return 0;
		}else if (number == 1){
			return 1;
		}else{
			return calculateRecursive(number - 1) + calculateRecursive(number - 2);
		}
	}
	
	/**
	 * This method calculates the fibonacci number in a light way (using a cache structure) 
	 * @param number The parameter N for fibonacci function
	 * @return The fibonacci number
	 */
	public static long calculateFast(long number){
		if(number == 0){
			return 0;
		}else if (number == 1){
			return 1;
		}else{
			Long x, y;
			
			if((x = calculatedNumbers.get(number - 1)) == null){
				x = calculateFast(number - 1);
				calculatedNumbers.put(number - 1, x);
			}
			
			if((y = calculatedNumbers.get(number - 2)) == null){
				y = calculateFast(number - 2);
				calculatedNumbers.put(number - 2, y);
			} 
			
			return x + y;
		}
	}
	
	/**
	 * Utility method to print the footprint information
	 * @param prefix Useful string to label the information 
	 */
	private static void printCurrentMemoryUse(String prefix){
		int  megaByteFactor = 1024;
		long initTotalMemory = Runtime.getRuntime().totalMemory()/megaByteFactor;
		long initFreeMemory = Runtime.getRuntime().freeMemory()/megaByteFactor;
		long initMemory = initTotalMemory - initFreeMemory;
		
		System.out.print(String.format("[%sTotalMemory=%d] ", prefix, initTotalMemory));
		System.out.print(String.format("[%sFreeMemory=%d] ", prefix, initFreeMemory));
		System.out.println(String.format("[%sUsedMemory=%d]", prefix, initMemory));
	}
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 48;
		long result = 0;
		
		FibonacciFunction.printCurrentMemoryUse("Init");
		long initTime = System.currentTimeMillis();
		result = FibonacciFunction.calculateFast(number);
		long endTime = System.currentTimeMillis() - initTime;
		FibonacciFunction.printCurrentMemoryUse("End");
		
		String message = String.format("FibonacciLight = %d ::: Time = %dms", result, endTime);
		System.out.println(message);
		
		FibonacciFunction.printCurrentMemoryUse("Init");
		initTime = System.currentTimeMillis();
		result = FibonacciFunction.calculateRecursive(number);
		endTime = System.currentTimeMillis() - initTime;
		FibonacciFunction.printCurrentMemoryUse("End");
		
		message = String.format("FibonacciLight = %d ::: Time = %dms", result, endTime);
		System.out.println(message);
	}
}