package map;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class map9 {
	public static void main(String[] args) {
		String myString = "This is a great thing";
		ArrayList<Character> myArrayList = new ArrayList<Character>();
		for(int i=0;i<myString.length();i++) {
			char tempChar = myString.charAt(i);
			myArrayList.add(tempChar);
		}
		//test
		System.out.println(myArrayList);
		LinkedHashMap<Character,Integer> map9 = new LinkedHashMap<Character,Integer>();
		for(Character i:myArrayList) {
			if(map9.containsKey(i)==false) {
				map9.put(i, 1);
			}else {
				int appear_times=map9.get(i);
				appear_times++;
				map9.put(i, appear_times);
			}
		}
		System.out.println(map9);
		
	}

}
