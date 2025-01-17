package map;

import java.util.Arrays;
import java.util.HashMap;

public class anagramChecker1 {
	public HashMap<Character,Integer> convertStringToHashMap(String str){
		HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
		for(Character i:str.toCharArray()) {
			if(hashMap.containsKey(i)==false) {
				hashMap.put(i, 1);
			}else {
				int times = hashMap.get(i);
				times++;
				hashMap.put(i, times);
			}
		}
		return hashMap;
	}
	public boolean areAnagrams(String str1, String str2) {
		if(str1 == null || str2==null) {
			return false;
		}else {
			String convertString1 = str1.toLowerCase();
			String convertString2 = str2.toLowerCase();
			HashMap<Character,Integer> map1 = convertStringToHashMap(convertString1);
			HashMap<Character,Integer> map2 = convertStringToHashMap(convertString2);
			return map1.equals(map2);
			 
		}   
    }

}
