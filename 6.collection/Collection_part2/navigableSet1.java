package Collection_part2;

import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Set;

public class navigableSet1 {
	public static void main(String[] args) {
		NavigableSet<Integer> myNavigableSet = new TreeSet<>(Set.of(1,23,55,22,121,44));
		System.out.println(myNavigableSet.isEmpty());
		System.out.println(myNavigableSet.lower(44));
		System.out.println(myNavigableSet.ceiling(12));
		System.out.println(myNavigableSet.lower(121));
		System.out.println(myNavigableSet.higher(33));
		System.out.println(myNavigableSet.subSet(20,80 ));
		System.out.println(myNavigableSet.tailSet(55));
		
	}
}
