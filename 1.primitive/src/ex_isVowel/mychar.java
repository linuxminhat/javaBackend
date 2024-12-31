package exercise_isVowel;

public class mychar {
	char ch;
	mychar(char ch){
		this.ch = ch;
	}
	//Check Vowel Function
//	boolean isVowel() {
//		if(ch=='a') {
//			if(ch=='A') {
//				if(ch=='u') {
//					if(ch=='U') {
//						if(ch=='i') {
//							if(ch=='I') {
//								if(ch=='e') {
//									if(ch=='E') {
//										if(ch=='o') {
//											if(ch=='O') {
//												return true;
//											}
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//		return false;
//	}
	boolean isVowel() {
		if(ch=='a'||ch=='A'||ch =='u'||ch=='U'||ch=='i'||ch=='I'||ch=='e'||ch=='E'||ch=='o'||ch=='O') {
			return true;
		}
		return false;
	}
	//Check Number Function
	boolean isNumber() {
		while(ch>=48 && ch<=57) {
			return true;
		}
		return false;
	}
	//Check Alphabet Function
	boolean isAlphabet() {
		while ((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) {
			return true;		
		}
		return false;
	}
	char printUpperCaseAlphabet() {
		while(ch>=97 && ch<=122) {
			return (char) (ch-32);
		}
			return ch;
	}
	char printLowerCaseAlphabet() {
		while(ch>=65 && ch<=90) {
			return (char) (ch+32);
		}
			return ch;
	}
	
}
