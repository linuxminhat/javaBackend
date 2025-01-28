package loops_test;

public class gcd_test {
	//finding GCD between 2 number 
	//GCD is greatest divisors of 2 number 
	int number1, number2;
	int gcd;
	gcd_test(int number1,int number2){
		this.number1=number1;
		this.number2=number2;
	}
	public int findingGCD() {
		for(int i=1;i<=number1 && i<=number2;i++) {
			if((number1%i==0)&&(number2%i==0)){
				gcd=i ;
			}
		}
		return gcd;
	}
	public static void main(String[] args) {
		gcd_test testcase = new gcd_test(123456,789012);
		System.out.println(testcase.findingGCD());
	}

}
