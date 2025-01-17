package map;

import java.util.HashMap;

public class anagramChecker {
	public static HashMap<Character,Integer> convertString(String str){
		HashMap<Character,Integer> myMap = new HashMap<Character,Integer>();
		for(Character i:str.toCharArray()) {
			if(myMap.containsKey(i)==false) {
				myMap.put(i, 1);
			}else {
				int appear_times=myMap.get(i);
				appear_times++;
				myMap.put(i, appear_times);
			}
		}
		return myMap;
	}
	
	public static boolean areAnagrams(String str1, String str2) {
		if(str1==null || str2==null) {
			return false;
		}else {
			HashMap<Character, Integer> map1 = convertString(str1);
	        HashMap<Character, Integer> map2 = convertString(str2);
	        return map1.equals(map2);
		}
        
    }
	public static void main(String[] args) {
		String str1 = "Minhdeptrai";
		String str2 = "Minhdeptrai";
		String str3 = "Minhgiauco";
		System.out.println(areAnagrams(str1,str2));
	}
}
