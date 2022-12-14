package episode9.arraychallenges;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Java program to remove duplicates from this array. You don't
 * need to physically delete duplicate elements, replacing with null, or
 * empty or default value is ok.
 *
 * @author http://javarevisited.blogspot.com
 */

	
public class RemoveDuplicatefromArray {

	//private static final java.lang.System.Logger LOGGER = LoggerFactory.getLogger();
	
	public static void main(String[] args) {
		
		int [] [] test = new int [] [] {
			{1, 1, 2, 2, 3, 4, 5},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 2, 3, 4, 5, 6, 7},
            {1, 2, 1, 1, 1, 1, 1},};
	
            for(int[] input: test) {
            	System.out.println("Array with Duplicates : "+Arrays.toString(input) );
            	System.out.println("Array removing duplicates : "+ Arrays.toString(removeDuplicates(input)));
            }
            
	}
	
	/*
     * Method to remove duplicates from array in Java, without using
     * Collection classes e.g. Set or ArrayList. Algorithm for this
     * method is simple, it first sort the array and then compare adjacent
     * objects, leaving out duplicates, which is already in the result.
     */
	
	public static int[] removeDuplicates(int[] numbersWithDuplicates) {
		
		//Sorting te array to bring the duplicates together
		Arrays.sort(numbersWithDuplicates);
		
		int[]  result = new int[numbersWithDuplicates.length];
		int previous = numbersWithDuplicates[0];
		result[0] = previous;
		
		for(int i=1; i < numbersWithDuplicates.length; i++) {
			
			int ch = numbersWithDuplicates[i];
			
			if(previous != ch) {
				result[i] = ch;
			}
			previous = ch;
		}
		return result;
	}
	
}
