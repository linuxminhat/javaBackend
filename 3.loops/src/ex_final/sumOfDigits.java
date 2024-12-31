package loops_finalexercise;

public class sumOfDigits {
    public static int getSumOfDigits(int number) {
        if(number>=0){
            if(number==0){
                return 0;
            }else{
                //12345
                int sum=number%10;// sum -> 5 
                int temp=number/10;//temp -> 1234 
                while(temp>0){
                    sum=sum+(temp%10);// sum -> 5 + 4 = 9 -> 9 + 13 = 12 -> 12 + 2 = 14 -> 14 + 1 = 15     
                    temp=temp/10;// temp -> 123 -> 12 -> 1   
                    
                }
                return sum;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
		System.out.println(getSumOfDigits(222225)); 
	}
}
//have pass
