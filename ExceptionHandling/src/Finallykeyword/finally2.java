package Finallykeyword;

import java.util.Scanner;

public class finally2 {
	public static void main(String[] args) {
		Scanner myScanner1 = null;
		try {
			myScanner1 = new Scanner(System.in);
			int[] numbers = {1,2,3,4};
			int number = numbers[5];
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Before Scanner Close !");
			if(myScanner1 == null) {
				myScanner1.close();
			}
		}
	}

}
