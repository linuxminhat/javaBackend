package paymentChoice;

import java.util.Scanner;

public class payment {
	public static void main(String[] args) {
		System.out.println("Choose type of payment : " );
		System.out.println("1 - VISA CARD");
		System.out.println("2 - Online banking");
		System.out.println("3 - Paying cash");
		System.out.println("4 - Crypto Currency");
		System.out.println("5 - Paypal");
		System.out.println("Insert number for choosing payment choice");
		Scanner yourInput1 = new Scanner(System.in);
		int yourChoice = yourInput1.nextInt();
		if(yourChoice ==1) {
			System.out.println("Please insert VISA CARD");
		}else {
			if(yourChoice ==2) {
				System.out.println("Please insert online banking number");
				Scanner yourInput2 = new Scanner(System.in);
				int yourOnlineBankingNumber = yourInput2.nextInt();
				System.out.println("Thanks for using our service");
			}else {
				if(yourChoice ==3) {
					System.out.println("Pay when you get product");
				}else {
					if(yourChoice ==4) {
						System.out.println("We are updating");
					}else {
						if(yourChoice ==5) {
							System.out.println("Please insert paypal number");
							Scanner yourInput3 = new Scanner(System.in);
							int yourOnlineBankingNumber = yourInput3.nextInt();
							System.out.println("Thanks for using our service");
						}
					}
				}
			}
		}
	}

}
