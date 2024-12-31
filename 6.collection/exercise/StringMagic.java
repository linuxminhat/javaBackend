package collection_CodingExercise;

import java.util.Arrays;

public class StringMagic {
	public void convertToLowercase(char[] charArray) {
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]>=65&&charArray[i]<=90) {
				charArray[i]+=32;
			}
		}
	}
	public void bubbleSort(char[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					char temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	public boolean areAnagrams(String str1, String str2) {
 
		if(str1==null || str2==null) {
			return false;
		}else {
			if(str1.length()!=str2.length()) {
				return false;
			}else {
				char[] str1CharArray = str1.toCharArray();
				char[] str2CharArray = str2.toCharArray();
				convertToLowercase(str1CharArray);
				convertToLowercase(str2CharArray);
				bubbleSort(str1CharArray);
				bubbleSort(str2CharArray);
				return Arrays.equals(str1CharArray, str2CharArray);
			}
		}
    }
}
