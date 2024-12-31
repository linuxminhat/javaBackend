package shortCircuiting;

public class shortCircuiting {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println(a<9 && b++>4);
		System.out.println(b);
		System.out.println(a<9 & b++>4);
		System.out.println(b);
	}

}
