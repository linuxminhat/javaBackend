package map;

import java.util.LinkedHashMap;

public class linkedHashMap1 {
	public static void main(String[] args) {
		//insertion ordered is maintain => Thu tu chen, khong phai thu tu tu nhien
		//slower insertion and deletion
		//faster iteration
		LinkedHashMap<String,Integer> linkedHashMap1 = new LinkedHashMap<String,Integer>();
		linkedHashMap1.put("L", 3434);
		linkedHashMap1.put("A", null);
		linkedHashMap1.put("B", 1);
		linkedHashMap1.put("C", 2);
		linkedHashMap1.put("Z", null);
		//ordered
		System.out.println(linkedHashMap1);//Ordered
		
	}

}
