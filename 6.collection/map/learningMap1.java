package map;

import java.util.HashMap;
import java.util.Map;

public class learningMap1 {

	public static void main(String[] args) {
		Map<String,Integer> myMap = new HashMap<>();
		myMap.put("A",323);
		myMap.put("B", 12);
		System.out.println(myMap);
		Map<String,Integer> myMap1 = Map.of("DangNhatMinh",1,"NguyenThiThanhThien",1);
		System.out.println(myMap1);
		Map<String,Integer> myMap2 = new HashMap<>();
		myMap2.put("C", 12);
		myMap2.put("D", 1212);
		System.out.println(myMap2);
		Map<Integer,Boolean > myMap3 = new HashMap<>();
		myMap3.put(1, false);
		myMap3.put(2, true);
		System.out.println(myMap3);
		System.out.println(myMap3.get(1));
		System.out.println(myMap3.size());
		System.out.println(myMap.isEmpty());
		System.out.println(myMap1.isEmpty());
		System.out.println(myMap2.containsKey(1));
	}
}
