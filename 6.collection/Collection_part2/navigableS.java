package Collection_part2;

import java.util.Set;
import java.util.TreeSet;

public class navigableS {

	public static void main(String[] args) {
		TreeSet<Integer> mySet = new TreeSet<>(Set.of(1,2,3,4,5));
		mySet.add(1);
		System.out.println(mySet);
		
	}
}
