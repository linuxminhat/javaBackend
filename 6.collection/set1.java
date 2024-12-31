package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class set1 {
	//Set la mot interface trong list 
	//Duy tri luu tru cac phan tu khong trung nhau 
	public static void main(String[] args) {
		Set<Integer> mySet = new HashSet<Integer>();
		mySet.add(1);
		System.out.println(mySet);
		List<String> myList = new ArrayList<>(Arrays.asList("1"));
		Set<String> myHashSet = new HashSet<>(Arrays.asList("1","2","2"));
		System.out.println(myHashSet);
//		List<String> myList2 = new HashSet<>(Arrays.asList("1"));
		List<Integer> myNumber = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> myNumber2 = new LinkedList<>(Arrays.asList(2,3,4,5,6));
		List<Integer> myNumber3 = new Vector<>(Arrays.asList(3,4,5,6,7,8,9));
		System.out.println(myNumber);
		System.out.println(myNumber2);
		System.out.println(myNumber3);
 	}

		

}
