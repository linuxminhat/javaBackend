package terminalOP;

import java.util.List;

public class terminalOP1 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		List<Integer> myList1 = List.of(1,1,1,1,1,1,1,1);
		myList.stream().max((n1,n2)->Integer.compare(n1, n2));
		System.out.println(myList.stream().max((n1,n2)->Integer.compare(n1, n2)).get());
		System.out.println(myList.stream().min((numb1,numb2)->Integer.compare(numb1, numb2)));
		
	}
	

}
