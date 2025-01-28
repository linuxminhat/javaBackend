package countUppercaseLetters;

public class StringMagic {
	int count;
	String str;
	char temp_ch;
	// HeLlO 
	public int countUppercaseLetters(String str) {
		this.str = str;
		if(str.length()==0) {
			return 0;
		}else {
			for(int i=0;i<str.length();i++) {
				//HeLlo
				if(str.charAt(i)>=65 && str.charAt(i)<=91) {
					count++;
				}
			}	 
		}	
		return count;
	}
	public static void main(String[] args) {
		StringMagic testcase = new StringMagic();
		System.out.println(testcase.countUppercaseLetters("HellO"));
	}
}
