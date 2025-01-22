package terminalOP;

import java.util.List;

public class terminalOP2 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println(myList);
		myList.stream().max((numb1,numb2)->Integer.compare(numb1, numb2)).get();
		myList.stream().min((numb1,numb2)->Integer.compare(numb1, numb2)).get();
		System.out.println(myList.stream().max((numb1,numb2)->Integer.compare(numb1, numb2)).get());
		System.out.println(myList.stream().min((numb1,numb2)->Integer.compare(numb1, numb2)).get());
	}

}
