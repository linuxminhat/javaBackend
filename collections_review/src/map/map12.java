package map;

import java.util.HashMap;

public class map12 {
	public static void main(String[] args) {
		String myString = "This is my java program for learning HashMap in Java";
		HashMap<Character,Integer> myMap12 = new HashMap<Character,Integer>();
		for(Character i: myString.toCharArray()) {
			if(myMap12.containsKey(i)==false) {
				myMap12.put(i, 1);
			}else {
				int appear_times = myMap12.get(i);
				appear_times++;
				myMap12.put(i, appear_times);
			}
		}
		System.out.println(myMap12);
	}

}
