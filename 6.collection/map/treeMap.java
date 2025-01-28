package map;

import java.util.TreeMap;

public class treeMap {
	public static void main(String[] args) {
		TreeMap<String,Integer> myTreeMap = new TreeMap<>();
		myTreeMap.put("F", 28);
		myTreeMap.put("L", 250);
		myTreeMap.put("A", 25);
		System.out.println(myTreeMap);
		System.out.println(myTreeMap.higherKey("A"));
		System.out.println(myTreeMap.higherEntry("B"));
		 
	}

}
