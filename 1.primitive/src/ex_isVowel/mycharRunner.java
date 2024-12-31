package exercise_isVowel;

public class mycharRunner {
	public static void main(String[] args) {
		//Check Vowel Function
		mychar mychar = new mychar('q');
		System.out.println(mychar.isVowel());
		//Check Number Function
		mychar mychar1 = new mychar('1');
		System.out.println(mychar1.isNumber());
		//Check Alphabet Function
		mychar mychar2 = new mychar('[');
		System.out.println(mychar2.isAlphabet());
		//Upper Case
		mychar mychar3 = new mychar('c');
		System.out.println(mychar3.printUpperCaseAlphabet());
		//Lower Case
		mychar mychar4 = new mychar('D');
		System.out.println(mychar4.printLowerCaseAlphabet());
	}

}
