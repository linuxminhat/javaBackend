package do_while_loops_ex;

import java.util.Scanner;

public class cubeWhileUser {
	public static void main(String[] args) {
		Scanner yourInput = new Scanner(System.in);
		int yourInputNumber =0;
		do {
			System.out.println("Cube is " + yourInputNumber*yourInputNumber*yourInputNumber);
			System.out.println("Enter a number");
			yourInputNumber = yourInput.nextInt();
			
		}while(yourInputNumber>=0);
		System.out.println("thank you ");
			 
	}
	
}
