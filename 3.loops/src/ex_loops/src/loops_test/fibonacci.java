package loops_test;

public class fibonacci {
	//fibonacci sequence :0 1 1 2 3 5 8 13 21 
	int position;
	int finalNumber;
	public fibonacci(int position){
		this.position = position;
	}
	public int fibonacciCal() {
		int firstIndex=0;
		int firstNumber=1;
		//assume position = 5 
		for(int i=1;i<position-1;i++) {
			finalNumber = firstNumber+firstIndex;
			firstIndex = firstNumber;
			firstNumber = finalNumber;
		}
		return finalNumber;
	}
	public static void main(String[] args) {
		fibonacci testCase = new fibonacci(6);
		System.out.println(testCase.fibonacciCal());
	}
}
