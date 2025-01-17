package set;

import java.util.Set;
import java.util.TreeSet;

public class treeSet1 {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>(Set.of(99,78,54,65,12,34));
		System.out.println(treeSet);
		//treeSet cung cap NavigableSet
//		System.out.println(treeSet.floor(85));
		System.out.println(treeSet.floor(65));
		System.out.println(treeSet.lower(65));
	}

}
