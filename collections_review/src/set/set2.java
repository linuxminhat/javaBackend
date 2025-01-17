package set;

import java.util.HashSet;
import java.util.Set;

public class set2 {
	public static void main(String[] args) {
		Set<Integer> testSet1 = Set.of(1,2,3,4,5);
//		testSet1.add(6); => Cant add, like List
		System.out.println(testSet1);
		//List duy trì thứ tự chèn 
		HashSet<Integer> testHashSet1 = new HashSet<Integer>(testSet1);
		
	}

}
