package map;

import java.util.Arrays;

public class anagramChecker2 {
	public boolean areAnagrams(String str1, String str2) {
		if(str1==null | str2==null) {
			return false;
		}else {
			char[] charArray1 = str1.toLowerCase().toCharArray();
			char[] charArray2 = str2.toLowerCase().toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			return Arrays.equals(charArray1, charArray2);
			
		}
    }
}
