package countUppercaseLetters;
public class StringMagic1 {
    String str;
  
    public int countUppercaseLetters(String str) {
    	int count=0;
         this.str = str;
         if(str.length()==0){
             return 0;
         }else{
             for(int i=0;i<str.length();i++){
                 if(str.charAt(i)<=122&&str.charAt(i)>=97){
                     return 0;
                 }
                 if(str.charAt(i)>=65&&str.charAt(i)<=90){
                     count++;
                 }
             }
         }
         return count;
    }
    public static void main(String[] args) {
		StringMagic1 testcase = new StringMagic1();
		System.out.println(testcase.countUppercaseLetters("This String Has Five UPPERCASE"));
		//expected 13 -> 0
	}
}