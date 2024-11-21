package countUppercaseLetters;

public class StringMagic2_indian {
	String str;
	public boolean checkString(String str) {
		this.str = str;
		for(int i=0;i<str.length()-1;i++) {
			char currentCharacter = str.charAt(i);
			char nextCharacter = str.charAt(i+1);
			if(currentCharacter == nextCharacter) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		StringMagic2_indian testcase = new StringMagic2_indian();
		System.out.println(testcase.checkString("Ccacon"));
	}
	

}
