package map;

import java.util.Map;

public class learningMap {
	public static void main(String[] args) {
		Map<String,Integer> myMap = Map.of("A",3,"B",5,"Z",10);
		System.out.println(myMap);
		System.out.println(myMap.get("A"));
		System.out.println(myMap.get("B"));
		System.out.println(myMap.get("C"));
		
		
	}

}
