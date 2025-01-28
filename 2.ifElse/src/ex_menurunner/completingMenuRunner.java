package completingMenuRunner;

import java.util.Scanner;

public class completingMenuRunner {
	public static void main(String[] args) {
		System.out.println("This is a Menu");
		System.out.println("1 - Chicken");
		System.out.println("2 - Fish");
		System.out.println("3 - Omlette");
		System.out.println("4 - Sushi");
		System.out.println("Enter your choice");
		Scanner yourInput = new Scanner(System.in);
		int yourNumber = yourInput.nextInt();
		if(yourNumber == 1) {
			System.out.println("Your food is Chicken");
		}else {
			if(yourNumber == 2) {
				System.out.println("Your food is Fish");
			}else {
				if(yourNumber == 3) {
					System.out.println("Your food is Omlette");
				}else {
					System.out.println("Your food is Sushi");
				}
			}
		}
		
	}

}
