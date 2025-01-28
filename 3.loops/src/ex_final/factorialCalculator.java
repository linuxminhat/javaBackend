package loops_finalexercise;

public class factorialCalculator {
    int number;
    int tempFactorial;
    public int factorialcalculator(int number) {
        this.number = number;
        if(number>=0){
            if(number==0){
                return 1;
            }else{//number = 5
            	tempFactorial = 1;
                for(int i=1;i<=number;i++){
                    tempFactorial=tempFactorial*i;
                }
                return tempFactorial;
            }
        }
        return -1;
    }
}
