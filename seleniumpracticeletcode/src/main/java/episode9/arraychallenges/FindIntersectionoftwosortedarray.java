package episode9.arraychallenges;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindIntersectionoftwosortedarray {

	public static void main(String[] args) {
		
		List<Integer> a1 = Arrays.asList(21, 34, 41, 22, 35);
		List<Integer> a2 = Arrays.asList(61, 34, 45, 21, 11);
		 
		Set<Integer> array1 = new TreeSet<>(a1);
		Set<Integer> array2 = new TreeSet<>(a2);
		
		intersectionoftwoarrays(array1, array2);
		
	}
	
	

	public static void intersectionoftwoarrays(Set<Integer> onsortedArray1,Set<Integer> onsortedArray2) {
		
		Set<Integer> resultSet = new TreeSet<Integer>();
		
//		Iterator<Integer> itr1 =  onsortedArray1.iterator();
//		Iterator<Integer> itr2 =  onsortedArray2.iterator();
//		while(itr1.hasNext()) {
//			while(itr2.hasNext()) {
//				
//			}
//			
//		}
		for(Integer i:onsortedArray1) {
			for(Integer j:onsortedArray2) {
				if(i.equals(j)) {
					resultSet.add(j);
				}
			}
		}
		System.out.println(resultSet);
	}
	
	
}
