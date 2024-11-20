package stringClass;

public class printStringinOddLine {
	public static void main(String[] args) {
		String str = new String("This is my experience with string");
		str.length();
//		System.out.println(str.length());//33
//		for(int i=1;i<=32;i++) {
//			System.out.println(str.charAt(i));
//		}
		//How to find an start index of an substring in a bigstring
//		System.out.println(str.indexOf("experience"));
		//How to find an last index of an substring in a bigstring 
//		System.out.println(str.lastIndexOf("experience with"));
		System.out.println(str.indexOf('i'));
		System.out.println(str.lastIndexOf('i'));
		System.out.println(str.startsWith("This"));//-> true
		System.out.println(str.startsWith("ngu"));//->false
		System.out.println(str.endsWith("string"));//->true
		System.out.println(str.endsWith("with"));//->false
	} 
}
