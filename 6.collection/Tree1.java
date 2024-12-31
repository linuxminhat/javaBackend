package Collection;

import java.util.HashSet;
import java.util.Set;

public class Tree1 {
	public static void main(String[] args) {
		Set<Integer> mySet = new HashSet<>();
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		mySet.add(100);
		mySet.add(1001);
		System.out.println(mySet);
		Set<Integer> mySet1 = new HashSet<>();
		mySet1.add(1000000);
		System.out.println(mySet.containsAll(mySet1));
	}
}
