package loops_finalexercise;

public class lcm_implementation {
	private int number1;//10
    private int number2;//10
    int lcm = 2;
    public lcm_implementation(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public int getNumber1() {
        return number1;
    }
    public int getNumber2() {
        return number2;
    }

    public  int calculateLCM() {
        if(number1<0||number2<0){
            return -1;
        }
        if(number1==0||number2 ==0){
            return 0;
        }
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
		lcm_implementation testCase = new lcm_implementation(2,5);
		System.out.println(testCase.calculateLCM()); 
	}

}
