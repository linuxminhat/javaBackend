package set;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class treeSet2 {
	public static void main(String[] args) {
		TreeSet<Integer> myTreeSet1 = new TreeSet<Integer>(Set.of(1,2,3,4,5));
		TreeSet<Integer> myTreeSet2 = new TreeSet<Integer>(Set.of(10,9,8,7,6));
		TreeSet<Integer> testTreeSet = new TreeSet<Integer>(Set.of(20,65,54,34,12,99));
		System.out.println(testTreeSet);
		System.out.println(testTreeSet.lower(54));
		System.out.println(testTreeSet.floor(54));
		System.out.println(testTreeSet.ceiling(65));
		System.out.println(testTreeSet.higher(65));
		System.out.println(testTreeSet.higher(99));
		NavigableSet<Integer> testNavigable = new TreeSet<Integer>(Set.of(65,54,34,12,99));
		System.out.println(testTreeSet.subSet(20,false, 80,false));// => bo qua 20 co trong tap con 
		System.out.println(testTreeSet.subSet(20, true,80,true));//True => bat dau tu 20 neu 20 co trong tap con 
		
		//subSet(fromElement, fromInclusive, toElement, toInclusive)
		
	}
}
