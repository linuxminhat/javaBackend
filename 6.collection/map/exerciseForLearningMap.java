package map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class exerciseForLearningMap {
	public static void main(String[] args) {
		String myString = "This is a great thing";
		char[] myChar = myString.toCharArray();
		Map<Character,Integer> myMap = new HashMap<>();
		for(char indexChar : myChar) {
			int mapValue=1;
			 if(myMap.containsKey(indexChar)==false) {
				 myMap.put(indexChar, mapValue);
			 }else {
				 if(myMap.containsKey(indexChar)==true) {
					 mapValue++;
					 myMap.put(indexChar, mapValue);
				 }
			 }
		}
		System.out.println(myMap);
	}
}
