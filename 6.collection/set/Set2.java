package Set;

import java.util.HashSet;
import java.util.Set;

public class Set2 {
	public static void main(String[] args) {
		Set<String> mySet = Set.of("Apple","Banana","Orange");
		System.out.println(mySet);
//		mySet.add("Apple"); => throw an exception
		Set<Integer> mySet2 = Set.of(1,2,3,4,5,6);
		System.out.println(mySet2);
		Set<Integer> mySet3 = new HashSet<>(Set.of(1,2,3,4,5));
		System.out.println(mySet3);
		Set<Character> mySet4 = new HashSet<>(Set.of('D','A','N','G'));
		System.out.println(mySet4);
		mySet4.add('A');
//		System.out.println(mySet4.add('A'));
		System.out.println(mySet4);
		
	}

}
