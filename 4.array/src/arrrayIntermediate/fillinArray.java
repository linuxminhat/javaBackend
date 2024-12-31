package arrrayIntermediate;

import java.util.Arrays;

public class fillinArray {
	 
	public static void main(String[] args) {
//		int[] array = new int[10];
//		Arrays.fill(array, 10);
//		for(int i:array) {
//			System.out.println(i);
		int[] array1 = new int[100];
		Arrays.fill(array1, 1,50,34);
		for(int i=1;i<array1.length-51;i++) {
			System.out.println(array1[i]);
		}
	}
	

}
