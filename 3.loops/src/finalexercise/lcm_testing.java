package loops_finalexercise;

public class lcm_testing {
    private int number1;
    private int number2;
    int gcd = 1;
    
    public lcm_testing(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }


    public int getNumber2() {
        return number2;
    }
    
    public int gcdImplementation(){
        for(int i=1;i<=number1 && i<=number2;i++){
            if(number1%i==0 && number2%i==0){
                gcd =i;
            }
        }
        return gcd;
    }
    public int calculateLCM() {
        if(number1 <0 || number2<0){
            return -1;
        }
        if(number1 ==0 || number2 ==0){
            return 0;
        }
        if(number1 >0 && number2>0) {
        	
        }
        return (number1*number2)/gcd;
    
        
    }
}