package terminalOP;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class terminalOP3 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println(myList);
		System.out.println(myList.stream().max((numb1,numb2)->Integer.compare(numb1, numb2)));
		System.out.println(myList.stream().min((numb1,numb2)->Integer.compare(numb1,numb2)));
		System.out.println(myList.stream().filter(e->e%2!=0).max((num1,num2)->Integer.compare(num1, num2)));
		System.out.println(myList.stream().filter(e->e%2==0).min((num1,num2)->Integer.compare(num1, num2)));
		myList.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(myList.stream().filter(e->e%2==0).collect(Collectors.toList()));
	}

}
