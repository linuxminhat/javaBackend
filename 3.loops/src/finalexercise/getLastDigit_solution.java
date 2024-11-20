package loops_finalexercise;

public class getLastDigit_solution {
	public static int getLastDigit(int number) {
		if(number<0) {
			return -1;
		}
		return number%10;
	}
	public static void main(String[] args) {
		getLastDigit(-3);
	}

}
