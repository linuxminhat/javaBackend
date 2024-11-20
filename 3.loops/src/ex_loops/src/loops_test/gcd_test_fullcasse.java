package loops_test;

public class gcd_test_fullcasse {
	int number1,number2;
	int gcd;
	gcd_test_fullcasse(int number1,int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	//case number1 and number2 is negative 
	public int findingGCD() {
		if((number1<0) || (number2<0)) {
			return -1;
		}
		if((number1==0) || (number2==0)) {
			return 0;
		}else {
			for(int i=1;i<=number1 && i<=number2;i++) {
				if((number1%i==0)&&(number2%i==0)){
					gcd=i;
				}
			}
		}
		return gcd; 
	} 
	public static void main(String[] args) {
		gcd_test_fullcasse testcase = new gcd_test_fullcasse(112121,33420);
		System.out.println(testcase.findingGCD()); 
	}
	

}
