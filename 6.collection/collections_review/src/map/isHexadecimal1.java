package map;

public class isHexadecimal1 {
	public String str;

    public isHexadecimal1(String str) {
        this.str = str;
    }
    
    public boolean isHexadecimalChar(char ch) {
        if((ch>='a'&&ch<='f')||(ch>='A'&&ch<='F')) {
        	return true;
        }
        return false;
    }

    public boolean isHexadecimal() {
        if(str==null||str.isEmpty()) {
        	return false;
        }else {
        	char[] convertArray=str.toCharArray();
        	for(char i:convertArray) {
        		if(!isHexadecimalChar(i)&&!(i>='0'&&i<='9')) {
        			return false;
        		}
        	}
        }
        return true;
    
    }

}
