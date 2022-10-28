package episode9.arraychallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatefromArrayList {

	

	
	public static void main(String[] args) {
			
		//ArrayList with duplicate string
		//List<String> duplicateList = (List<String>)Arrays.asList("Android","Android","ios","windows mobile");
		List<String> duplicateList = Arrays.asList("Android","Android","ios","windows mobile");
		
		System.out.println(" size of ArrayList with duplicates : "+ duplicateList.size());
		//should print 4 because of duplicates android
		
		System.out.println(duplicateList);
		
		//Convert ArrayList to hashSet to remove duplicates
		HashSet<String> listToSet = new HashSet<String> (duplicateList);
		
		//Creating ArrayList without duplicate value
		List<String> listWithoutDuplicates = new ArrayList<String>(listToSet);
		
		//Creating ArrayList without Duplicate but having list order
		LinkedHashSet<String> listWithoutDuplicatebutwithorder = new LinkedHashSet<String>(duplicateList); 
		
		System.out.println("Size of ArrayList wiht out duplicates: "+ listToSet.size());
		System.out.println(listWithoutDuplicates);
		System.out.println("List without duplicate but with order : "+ listWithoutDuplicatebutwithorder );
	}
}
