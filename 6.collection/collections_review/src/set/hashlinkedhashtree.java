package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashlinkedhashtree {
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<Integer>(Set.of());
		System.out.println(numbers);
		numbers.add(2323);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println(numbers);//Not ordered
		LinkedHashSet<Integer> linkedNumbers = new LinkedHashSet<Integer>(Set.of());
		System.out.println(linkedNumbers);
		linkedNumbers.add(1);
		linkedNumbers.add(2);
		linkedNumbers.add(1212);
		linkedNumbers.add(111);
		System.out.println(linkedNumbers);//Ordered => quan tam thu tu chen
		TreeSet<Integer> treeNumbers = new TreeSet<Integer>(Set.of());
		treeNumbers.add(1212);
		treeNumbers.add(23232);
		treeNumbers.add(4545);
		System.out.println(treeNumbers);//quan tam thu tu sap xep
		
		
		
	}

}
