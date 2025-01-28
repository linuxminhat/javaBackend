package arrrayIntermediate;

import java.util.Arrays;

public class arrayCompare {
	static int[] array1 = {1,2,3,4,5};
	static int[] array2 = {6,7,8,9,10};
	static int[] array3 = {1,3,5,7,9};
	static int[] array4 = {1,3,5,7,9};
	public static void main(String[] args) {
		System.out.println(Arrays.equals(array1, array2));//->false
		System.out.println(Arrays.equals(array1, array3));//->true
		System.out.println(Arrays.equals(array3, array4));
	}
	 

}
