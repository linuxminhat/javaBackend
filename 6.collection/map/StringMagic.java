package map;

import java.util.HashMap;
import java.util.Map;

public class StringMagic {
	public void convertUpperCase(char ch) {
		if(ch>=65 && ch<=90) {
			ch+=32;
		}
	}
    public boolean areAnagrams(String str1, String str2) {
    	if(str1==null || str2==null) {
    		return false;
    	}else {
    		char[] str1Char = str1.toCharArray();
    		char[] str2Char = str2.toCharArray();
    		HashMap<Character,Integer> str1Map = new HashMap<>();
    		HashMap<Character,Integer> str2Map = new HashMap<>();
    		if(str1.length()!=str2.length()) {
    			return false;
    		}
    		if(str1==null || str2==null) {
    			return false;
    		}else {
    			for(char char1Index : str1Char) {
    				convertUpperCase(char1Index);
    				int occur=1;
    				if(str1Map.containsKey(char1Index)==false) {
    					str1Map.put(char1Index, occur);
    				}else {
    					occur++;
    					str1Map.put(char1Index, occur);
    				}
    			}
    			for(char char2Index : str2Char) {
    				convertUpperCase(char2Index);
    				int occur=1;
    				if(str2Map.containsKey(char2Index)==false) {
    					str2Map.put(char2Index, occur);
    				}else {
    					occur++;
    					str2Map.put(char2Index, occur);
    				}
    			}
    			if(str1Map.equals(str2Map)==true) {
    				return true;
    			}
    		}
    	}
    	return false;
    }
}