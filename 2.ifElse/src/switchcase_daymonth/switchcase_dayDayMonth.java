package switchcase_dayDayMonth;

import java.util.Scanner;

public class switchcase_dayDayMonth {
	public static void checkDayOfWeek() {
		Scanner yourInput = new Scanner(System.in);
		int day = yourInput.nextInt();
		if(day>=2 && day<=8) {
			switch(day) {
				case 2 : 
					System.out.println("Monday");break;
				case 3 : 
					System.out.println("Tuesday");break;
				case 4 : 
					System.out.println("Wednesday");break;
				case 5 : 
					System.out.println("Thursday");break;
				case 6 : 
					System.out.println("Friday");break;
				case 7 : 
					System.out.println("Saturday");break;
				case 8 : 
					System.out.println("Sunday");break;
		} 
			}else{
				System.out.println("Not available day");
		}
		
	}
	public static void checkMonthOfYear() {
		Scanner yourInput2 = new Scanner(System.in);
		int month = yourInput2.nextInt();
		if(month>=1 && month<=12) {
			System.out.println("Insert your month");
			switch(month) {
			case 1 : 
				System.out.println("Jan");
			case 2 : 
				System.out.println("Feb");
			case 3 :
				System.out.println("March");
			case 4 : 
				System.out.println("April");
			case 5 : 
				System.out.println("May");
			case 6 : 
				System.out.println("June");
			case 7 : 
				System.out.println("July");
			case 8 : 
				System.out.println("August");
			case 9 : 
				System.out.println("Sep");
			case 10 : 
				System.out.println("Oct");
			case 11 : 
				System.out.println("Nov");
			case 12 : 
				System.out.println("Dec");
			}
		}else {
			System.out.println("Not available month");
		}
	}
	
	
	public static void main(String[] args) {
		 checkDayOfWeek();//Gọi thẳng luôn không cần tạo đối tượng nên mới cần khai báo phương thức static 
//		 checkMonthOfYear instance = new checkMonthOfYear();
//		 instance.checkMonthOfYear; => viet ngu, vi mot object la the hien mot class chu khong phai la mot ham 
		 checkMonthOfYear();
	}

}
