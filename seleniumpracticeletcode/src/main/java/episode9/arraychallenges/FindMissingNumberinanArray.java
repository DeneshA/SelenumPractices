package episode9.arraychallenges;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;

public class FindMissingNumberinanArray {
	/*
	 * Solution for find missing elements in Integer array containing numbers 1 to 100;
	 */
	public static void main(String[] args) {
		
		//Only one missing nubmer in array
		int[] iArray = new int[] {1,2,3,5};
		//printMissingNumber(iArray, 5);
		getMissingNumber(iArray, 5);
		
	}
	
	/** * A general method to find missing values from an integer array in Java. 
	 * * This method will work even if array has more than one missing element. */

	//Read more: https://javarevisited.blogspot.com/2014/11/how-to-find-missing-number-on-integer-array-java.html#ixzz7g5yMoKXT
	
	private static void printMissingNumber(int[] numbers,int count) {
		
		int missingCount = count - numbers.length;
		BitSet bitSet=new BitSet(count);
		
		for(int number:numbers) {
			
			//System.out.println(number);
			bitSet.set(number-1);
			//System.out.println(bitSet.get(number-1));
			
			System.out.printf("Missing numbers in integer array %s, with total number %d is %n",Arrays.toString(numbers), count); 
			int lastMissingIndex = 0;
			
			for(int i=0; i< missingCount;i++) {
				
				lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
				System.out.println(++lastMissingIndex);
				
			}		
		}
	
	}
	
	/**
	    * Java method to find missing number in array of size n containing
	    * numbers from 1 to n only.
	    * can be used to find missing elements on integer array of 
	    * numbers from 1 to 100 or 1 - 1000
	    */
	    private static int getMissingNumber(int[] numbers, int totalCount) {
	        int expectedSum = totalCount * ((totalCount + 1) / 2);
	        int actualSum = 0;
	        for (int i : numbers) {
	            actualSum += i;
	        }
	 
	        return expectedSum - actualSum;
	    }


	
}
