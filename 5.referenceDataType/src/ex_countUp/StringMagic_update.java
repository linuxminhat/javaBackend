package countUppercaseLetters;

public class StringMagic_update {
	//counting the number of uppercase letters present in method
	//string is empty -> 0
	//string does not contain uppercase -> 0
	String str;
	int count;
	public int countUpperCase(String str) {
		this.str = str;
		if(str.length()==0) {
			return 0;
		}else {
			for(int i=0;i<=(str.length()-1);i++) {
				if(str.charAt(i)>=97 && str.charAt(i)<=123) {
					return 0;
				}
				if(str.charAt(i)>=65 && str.charAt(i)<=91) {
					count++;
				}
				
			}
		}
		return count;
	}

}
