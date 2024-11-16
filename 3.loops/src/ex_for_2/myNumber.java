package for_loops_ex;
public class myNumber {
	int myNumb;
	//Declare a constructor
	myNumber(int myNumb){
		this.myNumb = myNumb;
	}
	//Check Prime Number Function -> its not optimal
	public boolean isPrimeUpdate() {
		for(int i=2;i<=(int)(myNumb/2);i++) {
			//Check if its an even number -> not prime
			if(((myNumb%2)==0)) {
				return false;
			}else if(((myNumb%i)==0)) {
				return false;
			}
		}
		return true;
	}
	//Sum Up to N Function
	//Sum of Digit Values
	public int sumUptoN() {
		//myNumb =7 
		int sum =0;
		for(int i=1;i<=myNumb;i++) {
			sum = sum+i;
			System.out.println("Digit Value:" + i);
			if(sum == myNumb) {
				return sum;	
				 
			}
		}
		System.out.println("There is no sum of digit values");
		return 0;//There is no
	}

	/*
	 * Hàm kiểm tra xem có phải là số hoàn hảo hay không 
	 * Nếu có => TRUE. Nếu không => FALSE
	 * Nếu có => In ra tổng các ước số của nó
	 * 
	 */
	public boolean sumOfDivisors() {
		int sum =1;
		for(int i=2;i<=myNumb-1;i++) {
			if((myNumb%i)==0) {
				sum=sum+i;
				if(sum==myNumb) {
					System.out.println("myNumb is perfect numb");
					return true;
				}
			}
		}
		return false;
	}
	public void printNumberTriangle() {
		for(int i=1;i<=myNumb;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"");
			}
			System.out.println();
		}
	}
	
}
