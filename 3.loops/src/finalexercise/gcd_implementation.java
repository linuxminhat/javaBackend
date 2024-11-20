package loops_finalexercise;

public class gcd_implementation {
	//Brute Force
	public static int gcd_implement(int number1,int number2) {
		int gcd = 1;
		for(int i=1;i<=number1 && i<=number2;i++) {
			//declarer i as index 
			if(number1%i==0 && number2%i==0) {
				gcd=i;
			}
		}
		return gcd;
	}
	public static void main(String[] args) {
		System.out.println(gcd_implement(48,18)) ;
	}

}
