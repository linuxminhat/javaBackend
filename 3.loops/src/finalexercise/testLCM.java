package loops_finalexercise;

public class testLCM {

    private int number1;
    private int number2;
    public int lcm;

    public testLCM(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }
    
    public int getNumber2() {
        return number2;
    }
    
    public int calculateLCM() {
        if(number1<0||number2<0){
            return -1;
        }
        if(number1==0 || number2==0){
            return 0;
        }
        if(number1>0 && number2>0){
            int maxNumber = Math.max(number1,number2);
            //maxNumber < lcm <= number1 * number2 
            for(int tempLCM = maxNumber; tempLCM<=number1*number2;tempLCM++){
                if((tempLCM%number1==0)&&(tempLCM%number2==0)){
                    lcm = tempLCM;
                    break;
                }
            }
        }
        return lcm;
}
}