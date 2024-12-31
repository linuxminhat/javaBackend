package paymentChoice;

import java.util.Scanner;

public class paymentSwitchCase {
	public static void main(String[] args) {
		System.out.println("Choose your type of paying : ");
		System.out.println("1 - PAYPAL");
		System.out.println("2 - Online Banking");
		System.out.println("3 - VISA CARD");
		System.out.println("4 - Cash");
		System.out.println("----------------------------");
		System.out.println("Enter your choice : ");
		Scanner yourInput = new Scanner(System.in);
		int yourChoice = yourInput.nextInt();
		switch (yourChoice)  {
		case 1 : System.out.println("you choose PAYPAL");break;
		case 2 : System.out.println("you choose Online Banking");break;
		case 3 : System.out.println("you choose VISA CARD");break;
		case 4 : System.out.println("you choose Cash");break;
		default : System.out.println("you choose nothing");break;
//		System.exit(0);
		}
		yourInput.close();
		System.exit(0);
	}
	

}
