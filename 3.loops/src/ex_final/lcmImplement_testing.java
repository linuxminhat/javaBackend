package loops_finalexercise;

public class lcmImplement_testing {
	public static int lcmCalculator(int number1,int number2) {
		int lcm =number1;
		if(number1>=number2) {
			for(int i=number1;i>=number1;i++) {
				if(i%number1==0 && i%number2==0) {
					break;
				}
				lcm=i;
			}
		}
		return lcm;
	}
	public static void main(String[] args) {
		lcmCalculator(5,6);
	}

}
