package sumFP;

import java.util.List;

public class sumFP1 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		myList.stream().forEach(element->System.out.println(element));
		//sum with FP
		//Phuong thuc reduce tong hop du lieu trong Stream thanh 1 gia tri duy nhat
		int sum = myList.stream().reduce(0,(number1,number2)->(number1+number2));
		//sum of number without FP
//		int sum=0;
//		for(Integer number:myList) {
//			sum+=number;
//			
//		}
//		System.out.println(sum);
	}
	 


}
