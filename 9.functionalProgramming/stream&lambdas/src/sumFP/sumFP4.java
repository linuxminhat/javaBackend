package sumFP;

import java.util.List;

public class sumFP4 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println(myList.stream().filter(e->e%2==0).reduce(0, (numb1,numb2)->(numb1+numb2)));
	}

}
