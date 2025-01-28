package switchcaseQuizz;

public class switchcaseQuizz {
	public static void main(String[] args) {
		quizz2();
	}
	private static void quizz1() {
		int number = 2;
		switch(number) {
		case 1 : 
			System.out.println(1);
		case 2 : 
			System.out.println(2);
		case 3 : 
			System.out.println(3); 
		case 4 :
			System.out.println("Default");
		}
	}
	private static void quizz2() {
		int number = 10;
		switch(number) {
		default : 
			System.out.println("Default");break;
		case 1 : 
			System.out.println("1");break;
		case 2 : 
			System.out.println("2");break;
	}

}
}
