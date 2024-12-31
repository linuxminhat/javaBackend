package for_loops;

public class printloop_function {
	public static void printOddNumber() {
		for(int i=1;i<=10;i=i+2) {
			System.out.println(i);
		}
	}
	public static void printEvenNumber() {
		for(int i=2;i<=10;i=i+2) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		printOddNumber();
		printEvenNumber();
	}

}
