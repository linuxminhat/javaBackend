package map;

import java.util.HashMap;
import java.util.Map;

public class learningMap4 {
	public static void main(String[] args) {
		Map<String,Integer> myMap = new HashMap<String,Integer>();
		myMap.put("A", 12);
		myMap.put("B", 1234);
		myMap.put("C", 12345);
		myMap.put("D", 123456);
		System.out.println(myMap);
	}

}
