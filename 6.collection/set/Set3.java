package Set;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class Set3 {
	public static void main(String[] args) {
		Set<Integer> mySet = new HashSet<>(Set.of(1,2,3,4,5,6));
		System.out.println(mySet);
		Set<String> mySet1 = new HashSet<>(Set.of("Dang","Nhat","Minh"));
		System.out.println(mySet1);
		Set<Character> mySet2 = new HashSet<>(Set.of('D','N','M'));
		System.out.println();
		Set<Integer> mySet3 = new HashSet<>(Set.of(1,2,3,4,5,6));
		System.out.println(mySet3);
	}
}
