package episode9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LearnArray {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] a= new int[4];
		
		a[0]=100;
		a[1]=300;
		a[2]=700;
		a[3]=1100;
		
		String[] guns = {"AKM","AUG","AWM","Groza","M416","scar"};
		
		System.out.println("guns = "+ guns);
		System.out.println("guns.toString = "+ guns.toString());
		System.out.println("Arrays.toString = "+ Arrays.toString(guns));
		System.out.println("Int Array = "+Arrays.toString(a));
		
		
	}
	
}
