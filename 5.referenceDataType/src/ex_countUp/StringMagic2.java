package countUppercaseLetters;

public class StringMagic2 {
	String str;
    public boolean hasConsecutiveDuplicates(String str) {
    	this.str = str;
    	for(int i=1;i<str.length();i++) {
    		for(int j=0;j<i;j++) {
    			if(str.charAt(i)==str.charAt(j)) {
    				return true;
    			}  			
    		}
    	}
    	return false;
    }
    public static void main(String[] args) {
		StringMagic2 testcase = new StringMagic2();
		System.out.println(testcase.hasConsecutiveDuplicates("Caconc"));
	}
}