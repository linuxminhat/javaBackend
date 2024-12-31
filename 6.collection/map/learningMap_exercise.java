package map;

import java.util.HashMap;
import java.util.Map;

public class learningMap_exercise {
	public Map checkingWordPresent(String myString) {
		char[] stringCharArray = myString.toCharArray();
		Map<Character,Integer> myMap = new HashMap<>();
		for(char word : stringCharArray) {
			int myPresent=1;
			if(myMap.containsKey(word)==false) {
				//This word not present 
				myMap.put(word, myPresent);
			}else {
				myPresent++;
				myMap.put(word, myPresent);
			}
		}
		return myMap;
	}
	public static void main(String[] args) {
		learningMap_exercise testing = new learningMap_exercise();
		 System.out.println(testing.checkingWordPresent("Dang Nhat Minh"));
	}
}
