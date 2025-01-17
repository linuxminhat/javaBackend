package map;

import java.util.HashMap;

public class map11 {
	public static void main(String[] args) {
		//Convert string "Hello my name is Dang Nhat Minh" to map 
		String myString = "Hello my name is Dang Nhat Minh";
		HashMap<Character,Integer> myMap = new HashMap<Character,Integer>();
//		System.out.println(myString.toCharArray());
		for(Character i:myString.toCharArray()) {
			if(myMap.containsKey(i)==false) {
				myMap.put(i, 1);
			}else {
				int appearance_times=myMap.get(i);
				appearance_times=+1;
				myMap.put(i, appearance_times);
			}
		}
		System.out.println(myMap);
	}

}
