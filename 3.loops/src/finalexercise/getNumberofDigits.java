package loops_finalexercise;

public class getNumberofDigits{
	int number;
    public int getNumberDigits(int number) {
    	this.number = number;
        if(number>=0){
            if(number==0){
                return 1;
            }else{
            	//number = 245642
                int i=1;//digit : 1
                int temp = number/10;//temp : 24564
                do{
                    ++i;//digit : 2 -> 3 -> 4 -> 5  
                    temp = temp/10;//temp :2456 -> 245 -> 24 - >2   
                }while(temp>10);
                return i+1; 
            }
        }
        return -1;
    }
}
