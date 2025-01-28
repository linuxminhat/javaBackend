package map;

import java.util.HashMap;

public class hashMap1 {
	public static void main(String[] args) {
		//unsorted, unordered
		//key's hashcode is used
		//HashTable => like Vector, thread safe
		//HashMap allow key = null, but HashTabe not allow key = null
		HashMap<String,Integer> hashMap1 = new HashMap<String,Integer>();
		hashMap1.put("Z", 6);
		hashMap1.put("A", 1212);
		hashMap1.put("B", 345);
		hashMap1.put("T", null);
		hashMap1.put("F", null);
		hashMap1.put("L", null);
		System.out.println(hashMap1);
		
	}

}
