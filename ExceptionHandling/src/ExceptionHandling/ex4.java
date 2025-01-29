package ExceptionHandling;

public class ex4 {
	public static void main(String[] args) {
		method1();
		System.out.println("Method1() is working !");
	}
	public static void method1() {
		method2();
		System.out.println("Method2() is working !");
	}
	public static void method2() {
		try {
			String myString = null;
			System.out.println(myString);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	

}
