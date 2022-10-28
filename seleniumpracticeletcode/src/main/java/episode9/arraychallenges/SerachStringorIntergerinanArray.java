package episode9.arraychallenges;

import java.util.Arrays;

public class SerachStringorIntergerinanArray {
	/** * Java Program to check if an array contains a value or not. 
	 * Basically this program tells you * how to search for an element in array,
	 *  it could be an integer number or String value. * * @author Javin Paul */

	
	public static void main(String[] args) {
		
		Integer[] input = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		
		System.out.printf("Does array %s has %s?  %b %n ",Arrays.toString(input),6,isExists(input,5));
		System.out.println(forLoopVerify(input, 5));
	}
	
	/** * Function to test if Array contains a certain value or not. 
	 * * This method take advantage of * contains() method of ArrayList class, by converting array to ArrayList.
	 * * * @return true if array contains */

	public static <T> boolean isExists(final T[] array ,final T object ) {
		return Arrays.asList(array).contains(object);
	}
	
	public static <T> boolean forLoopVerify(final T[] array,final T object) {
		
		for(T x: array) {
			if(object.equals(x)) {
				return true;
			}
		}
		
		return false;
	}
}
