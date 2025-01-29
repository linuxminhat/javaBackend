package Finallykeyword;

import java.util.Scanner;

public class finally1 {
	public static void main(String[] args) {
		Scanner myScanner = null;
		try {
			myScanner = new Scanner(System.in);
			int[] numbers = {1,2,3,4};
			int number = numbers[5];
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Before Scanner Close ");
			if(myScanner !=null ) {
				myScanner.close();// Luon duoc thuc thi de dong Scanner 
			}
		}
	}

}
