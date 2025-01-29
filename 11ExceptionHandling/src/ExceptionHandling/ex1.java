package ExceptionHandling;

public class ex1 {
	public static void main(String[] args) throws NullPointerException  {
		method1();
		
	}
	public static void method1() throws NullPointerException  {
		method2();
		System.out.println("method1 ending !");
	}
	public static void method2() throws NullPointerException {
		String str = null;
		System.out.println(str.length());
		System.out.println("method2 ending !");
	}

}
