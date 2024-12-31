package map;

import java.util.Arrays;

public class StringMagic2 {
	 public void convertUpperCase(char[] myChar) {
	        for(int i = 0; i < myChar.length; i++) {
	            if(myChar[i] >= 'A' && myChar[i] <= 'Z') {
	                myChar[i] += 32;
	            }
	        }
	    }
	 public void bubbleSort(char[] myChar) {
	        for(int i = 0; i < myChar.length - 1; i++) {
	            for(int j = 0; j < myChar.length - i - 1; j++) {
	                if(myChar[j] > myChar[j + 1]) {
	                    char temp = myChar[j];
	                    myChar[j] = myChar[j + 1];
	                    myChar[j + 1] = temp;
	                }
	            }
	        }
	    }
    public  boolean areAnagrams(String str1, String str2) {
    	if(str1==null || str2==null) {
    		return false;
    	}
    	if(str1.length()!=str2.length()) {
    		return false;
    	}
    	char[] str1Char = str1.toCharArray();
    	char[] str2Char = str2.toCharArray();
    	convertUpperCase(str1Char);
    	convertUpperCase(str2Char);
    	bubbleSort(str1Char);
    	bubbleSort(str2Char);
    	return Arrays.equals(str1Char, str2Char);
    	 
    }
   
}