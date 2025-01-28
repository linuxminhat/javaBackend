package loops_finalexercise;

public class getLastDigit {
	int number;
    public int getLastDigit(int number) {
        this.number = number;
        if(number>=0){
            if(number==0){
                return 0;
            }else{
            	int temp = number%10;
                while(temp>10) {
                	temp = number%10;
                }
                return temp;
            } 
        }
        return -1;
    }
}
