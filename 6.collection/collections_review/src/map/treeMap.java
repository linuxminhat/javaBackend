package map;

import java.util.TreeMap;

public class treeMap {
	public static void main(String[] args) {
		//natural sorted order is maintained
		//implemented NavigableMap
		TreeMap<String,Integer> treeMap1 = new TreeMap<String,Integer>();
		treeMap1.put("D", 12121);
		treeMap1.put("A", null);
		treeMap1.put("Z", null);
		System.out.println(treeMap1);
	}

}
