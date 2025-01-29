package ExceptionHandling;

public class ex3 {
	public static void main(String[] args) {
		method1();
		System.out.println("method1 is working !");
	}
	public static void method1() {
		method2();
		System.out.println("method2 is working !");
	}
	public static void method2() {
		try {
			String myString = null;
			System.out.println(myString);
			System.out.println("Let method2 working !");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	

}
