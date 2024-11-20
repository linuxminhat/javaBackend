package ifelse_test;

public class quizz {
	public static void main(String[] args) {
		quizz5();
	}
	//quizz1
	private static void quizz1() {
		int m = 14;
		if (m>20) {
			System.out.println(1);
		}else if(m>10) {
			System.out.println(2);
		}else if(m<20) {
			System.out.println(3);
		}else {
			System.out.println(4);
		}
	}
	//quizz2
	private static void quizz2() {
		int l = 15;
		if(l<20) {
			System.out.println("l<20");
		} 
		if(l>20) {
			System.out.println("l>20");
		}else 
			System.out.println("Con cac");
	}
	//quizz3
	private static void quizz3() {
		int n = 15;
		if(n>30)
			if(n<20)
				System.out.println(n);
			else {
				System.out.println("Thanh Thanh");
			}
	}
	//quizz4
//	private static void quizz4() {
//		int b = 0;
//		if(b) {
//			System.out.println("b");
//		}
//	}
	//quizz5
	private static void quizz5() {
		int v = 5;
		if(v<0)
			v = v+10;
		v++;//v++ khong phai la lenh duoc boc trong ham if 
		System.out.println(v);
	}

}
