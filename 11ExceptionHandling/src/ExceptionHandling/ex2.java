package ExceptionHandling;

public class ex2 {
	public static void main(String[] args) {
		method1();
		System.out.println("method1 working !");
	}
	public static void method1() {
		method2();
		System.out.println("method2 working !");
	}
	public static void method2() {
		try {
			String myString = null;
			myString.length();
			System.out.println(myString.length());
			System.out.println("Let method2() working !");
		}catch(Exception ex) {
//			ex.printStackTrace();
		}
	}

}
