//=======================================================================
// ARCHIVO FibonacciFunction.java
// FECHA CREACIÓN: 22/04/2014
//=======================================================================
package co.zero.geekalgorithm.algorithms.math;

import java.util.HashMap;
import java.util.Map;

/**
 * Some algorithm to calculate the Fibonacci Numbers
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
	public static long calculateWithMemory(long number){
		if(number == 0){
			return 0;
		}else if (number == 1){
			return 1;
		}else{
			Long x, y;
			
			if((x = calculatedNumbers.get(number - 1)) == null){
				x = calculateWithMemory(number - 1);
				calculatedNumbers.put(number - 1, x);
			}
			
			if((y = calculatedNumbers.get(number - 2)) == null){
				y = calculateWithMemory(number - 2);
				calculatedNumbers.put(number - 2, y);
			} 
			
			return x + y;
		}
	}

	public static long calculateIteratively(long number){
		//TODO: Implement this in an iterative way
		return 0;
	}

	public static long calculateWithMatrixMultiplication(long number){
		//TODO: Implement this in an iterative way
		return 0;
	}
}