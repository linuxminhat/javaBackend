package map;

import java.util.TreeMap;

public class treeMap1 {
	public static void main(String[] args) {
		TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();
		System.out.println(treeMap);
		treeMap.put("Ab", 23);
		treeMap.put("ZS", 1);
		treeMap.put("Lds", null);
		treeMap.put("Tds", 3232);
		treeMap.put("BDSD",25);
		treeMap.put("FF", null);
		treeMap.put("Go", 212);
		System.out.println(treeMap);
		System.out.println(treeMap.higherKey("BDSD"));
		System.out.println(treeMap.ceilingKey("BDSD"));
	}

}
