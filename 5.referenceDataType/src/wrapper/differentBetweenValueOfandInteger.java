package wrapperClass;

public class differentBetweenValueOfandInteger {
	public static void main(String[] args) {
		Integer number1 = new Integer(5);
		Integer number2 = new Integer(5);
		System.out.println(number1 == number2);//its false
		//Explaining dau gach ngang : khong khuyen nen su dung 
		//Ke tu Java9, chung ta nen su dung value of
		Integer number3 = Integer.valueOf(5);
		Integer number4 = Integer.valueOf(5);
		System.out.println(number3 == number4);
		
	}

}
