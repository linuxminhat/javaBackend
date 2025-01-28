package functionalInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class EvenNumberFiltering4 implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t%2==0;
	}
	
}
class PrintingConsumer4 implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t);
		
	}
	
}
public class lambdaBTSrunner4 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.print(myList);
		myList.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
		myList.stream().filter(new EvenNumberFiltering4()).forEach(e->System.out.println(e));
	}

}
