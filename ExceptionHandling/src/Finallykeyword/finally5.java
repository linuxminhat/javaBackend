package Finallykeyword;

import java.util.Scanner;

public class finally5 {
	public static void main(String[] args) {
		Scanner myScanner5 = null;
		try {
			myScanner5 = new Scanner(System.in);
			int[] myArray = {1,2,3,4,5};
			int myArrayNumber = myArray[6];
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Always printing it ");
			if(myScanner5 == null ) {
				myScanner5.close();
			}
		}
	}

}
