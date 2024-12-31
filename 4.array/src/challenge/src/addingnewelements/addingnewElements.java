package addingnewelements;

import java.util.Arrays;

public class addingnewElements {
	public static int[] oldArray = {1,2,3,4,5};
	//I want to add an element = 6 in array[5];
	public int[] addingnewElements(int[] oldArray, int newValue) {
		this.oldArray = oldArray;
		int[] newArray = new int[oldArray.length+1];
		for(int i=0;i<oldArray.length;i++) {
			newArray[i] = oldArray[i];
			//newArray = {1,2,3,4,5}
			newArray[oldArray.length]=newValue;
		}
		return newArray;
	}
	public static void main(String[] args) {
//		System.out.println(Arrays.toString(array));
		addingnewElements testcase = new addingnewElements();
		System.out.println(Arrays.toString(testcase.addingnewElements(oldArray, 10)));
		
	}

}
