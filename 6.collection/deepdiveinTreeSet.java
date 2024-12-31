package Collection;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;
public class deepdiveinTreeSet {
	
	public static void main(String[] args) {
		TreeSet<Integer> myTreeSet = new TreeSet<>();
		Set<Integer> myTreeSet1 = new TreeSet<>(Set.of(1,233,5,23,6,34343));
		System.out.println(myTreeSet1);
		NavigableSet<Integer> myTreeSet2 = new TreeSet<>(Set.of(1,2,3,43,232,12534,5123));
		System.out.println(myTreeSet2.first());
		System.out.println(myTreeSet2.floor(43));
		
	}
}
