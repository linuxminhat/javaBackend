package collection_CodingExercise;

public class StringMagic1 {
	public static String reverseWordsInSentence(String sentence) {
        if(sentence==null) {
        	return "INVALID";
        }else {
        	if(sentence.length()==0) {
        		return sentence;
        	}else {
        		char[] sentenceChar = sentence.toCharArray();
        		for(int i=0;i<sentence.length()/2;i++) {
        			char temp=sentenceChar[i];
        			sentenceChar[i]=sentenceChar[sentence.length()-i-1];
        			sentenceChar[sentence.length()-i-1]=temp;
        		}
        		String reverseString = new String(sentenceChar);
        		return reverseString;
        	}
        }
    }
	public static void main(String[] args) {
        String test1 = new String("Hello world");
        System.out.println(reverseWordsInSentence(test1));
    }
}
	 
