package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetImplement {
	public static void main(String[] args) {
		Set<Integer> mySet = new LinkedHashSet<>();
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		mySet.add(4);
		mySet.add(6);
		mySet.add(5);
		mySet.add(5);
		
		System.out.println(mySet);
		System.out.println(mySet.contains(1090));
	}
}
