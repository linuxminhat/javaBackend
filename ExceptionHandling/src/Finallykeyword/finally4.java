package Finallykeyword;

import java.util.Scanner;

public class finally4 {
	public static void main(String[] args) {
		Scanner myScanner4 = null;
		try {
			myScanner4 = new Scanner(System.in);
			int[] myArray = {1,2,3,4,5,6};
			int myArrayNumber = myArray[7];
			
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Always printing it !");
			if(myScanner4 == null ) {
				myScanner4.close();
			}
		}
	}

}
