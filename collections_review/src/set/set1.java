package set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class set1 {
	//Unique things only - Does not allow duplication
	 
	public static void main(String[] args) {
	ArrayList<Integer> testArrayList = new ArrayList<Integer>(List.of(1,1,1,23,46,4,121,3));
	System.out.println(testArrayList);//Allow duplication
//	Set<Integer> testSet = new Set<Integer>(List.of(1,1,1,1));
//	Set<Integer> testSet = Set.of(1,1,1,1,2);
//	System.out.println(testSet);
	Set<Integer> testSet1 = Set.of(1,2,3,4);
	System.out.println(testSet1);
	testArrayList.add(100);
	System.out.println(testArrayList);
	testSet1.add(4);
	System.out.println(testSet1);
	
	}

}
