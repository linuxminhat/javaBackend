package for_loops_ex_by_while_loops;

public class myNumber {
	//Sum 1 -> N
	//Sum of divisors
	//Print Triangle
	int myNumb;
	myNumber(int myNumb){
		this.myNumb=myNumb;
	}
	public boolean checkPrime() {
		int i=1;
		while(i<myNumb-1) {
			++i;//truong hop sai la khi minh de i<=myNumb-1
			if((myNumb%i)==0) {
				return false;
			}		
		}
		return true;	
	}
	public int sumOfNumb() {
		//myNumb 5 => expect sum =1+2+3+4=10
		int i=1;
		int sum=0;
		while(i<=myNumb-1) {
			sum =sum+i; 
			++i;
		}
		return sum;
	}
 
	
}
