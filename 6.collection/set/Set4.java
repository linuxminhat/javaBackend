package Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set4 {
	public static void main(String[] args) {
		Set<String> mySet = new HashSet<>(Set.of("Dang","Nhat"));
		System.out.println(mySet);
		mySet.add("Dang");
		System.out.println(mySet);
		List<String> myList = new ArrayList<>(Arrays.asList("Dang","Nhat"));
		System.out.println(myList);
		myList.add("Dang");
		System.out.println(myList);
	}
}
