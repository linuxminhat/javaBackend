package map;

import java.util.HashMap;
import java.util.Map;

public class map8 {
	public static void main(String[] args) {
		Map<String,Integer> map = Map.of("A",3,"B",5,"Z",10);
//		map.put("R", null);
		System.out.println(map);
		System.out.println(map.get("Z"));
		System.out.println(map.containsKey("A"));
		System.out.println(map.keySet());
		HashMap<String,Integer> hashmap8 = new HashMap<String,Integer>(map);
		hashmap8.put("R", null);
		System.out.println(hashmap8);
	}

}
