package loops_finalexercise;

public class reverseANumber {
	int number;
    public int reverseNumber(int number) {
        this.number = number;
        if(number>=0){
            if(number==0){
                return 0;
            }else{
                //123
                int reverseDigits = number%10;//3 
                int divideNumb = number/10;//12
                while(divideNumb>0){//12>0 
                    int temp = divideNumb%10;//2 -> 1
                    reverseDigits=reverseDigits*10+temp;//32 -> 321
                    divideNumb=divideNumb/10;//1 
                    
                }
                return reverseDigits;
                
            }
        }
        return -1;
    }
   public static void main(String[] args) {
	   reverseANumber test = new reverseANumber();
	   System.out.println(test.reverseNumber(100));
	
}
}
