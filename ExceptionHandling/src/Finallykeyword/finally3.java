package Finallykeyword;

import java.util.Scanner;

public class finally3 {
	public static void main(String[] args) {
		Scanner myScanner3 = null; 
		try {
			myScanner3 = new Scanner(System.in);
			int[] myArray = {1,2,3,4,5};
			int myArrayNumber = myArray[6];
		} catch (Exception ex) {
			 ex.printStackTrace();
		} finally {
			System.out.println("Always printing this line !");
			if(myScanner3 == null) {
				myScanner3.close();
			}
		}
		
	}

}
