package map;

import java.util.HashMap;
import java.util.Map;

public class learningMap2 {
	public static void main(String[] args) {
		Map<String,Integer> myMap = new HashMap<>();
		myMap.put("A", 1);
		myMap.put("B", 12121);
		myMap.put("C", 1111);
		System.out.println(myMap);
		Map<String,Integer> myMap1 = Map.of("DangNhatMinh",121);
		System.out.println(myMap1);
		Map<String,Integer> myMap2 = Map.of("NguyenThiThanhThien",2810);
		System.out.println(myMap2);
//		myMap2.put("DangMinh", 2102);
//		System.out.println(myMap2); => Error !
		Map<String,Integer> myMap3 = new HashMap<>(myMap2);
		myMap3.put("DangMinh", 2102);
		System.out.println(myMap3);
		
		
	}

}
