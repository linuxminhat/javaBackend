package collection_CodingExercise;

public class MyString {
	public String str;

    public MyString(String str) {
        this.str = str;
    }
    
    public boolean isHexadecimalChar(char ch) {
    	if((ch>=65&&ch<=70)||(ch>=97&&ch<=102)) {
    		return true;
    	}
       	return false;
    }

    public boolean isHexadecimal() {
    	String str = "GHIJKL";
    	char[] myChar = str.toCharArray();
    	for(char ch:myChar) {
    		if(isHexadecimalChar(ch)==true && Character.isDigit(ch)==true) {
    			return true;	
    		}
    	}
        return false;
    }

}
