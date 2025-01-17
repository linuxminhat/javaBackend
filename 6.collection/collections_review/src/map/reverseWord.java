package map;

public class reverseWord {
	//"Hello World"
	public static String reverseWordsInSentence(String sentence) {
        if(sentence==null) {
        	return "INVALID";
        }
        if(sentence.isEmpty()) {
        	return "";
        }
        int index = sentence.length()-1;//10
        char[] newArray = new char[index+1];
        for(int i=0;i<=sentence.length()-1;i++) {
        	newArray[index]=sentence.charAt(i);
        	index--;
        }
       return new String(newArray);
        
    }
	public static void main(String[] args) {
		String sentence1 = "Hello World";
		System.out.println(sentence1.length());
		String test1 = reverseWordsInSentence("Welcome to OpenAI");
		System.out.println(test1);
	}
}
