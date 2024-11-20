package arrrayIntermediate;

import java.util.Arrays;

public class fillingArray {
	public static void main(String[] args) {
		int[] array = new int[65];
		Arrays.fill(array, 14);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
