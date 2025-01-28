//package loops_finalexercise;
//
//public class findingLCM {
//	int number1;
//	int number2;
//	int lcm;
//	public findingLCM(int number1,int number2) {
//		this.number1 = number1;
//		this.number2 = number2;
//	}
//	public int calculateLCM() {
//		// 5 and 6 
//		//maxNumber = 6 
//		int maxNumber = Math.max(number1, number2);
//		//6 -> 30 
//		for(int tempLCM = maxNumber; tempLCM<=number1*number2;tempLCM++) {
//			if((tempLCM%number1)==0 &&(tempLCM%number2)==0) {
////				lcm = tempLCM;
//				break;
//			}
//			lcm = tempLCM; 
//		}
//		return lcm;
//	}
//	public static void main(String[] args) {
//		findingLCM testcase = new findingLCM(6,2);
//		System.out.println(testcase.calculateLCM());
//	}
//
//}
