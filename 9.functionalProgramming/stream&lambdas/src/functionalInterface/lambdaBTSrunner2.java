package functionalInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class EvenNumberFiltering2 implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return (t%2==0);
	}
	
}
class PrintingConsumer2 implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println("Minh dep trai");
		
	}
	
}
public class lambdaBTSrunner2 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(12,23,5454,323,121,5454);
//		myList.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
//		myList.stream().filter(new EvenNumberFiltering2()).forEach(e->System.out.println(e));
		myList.stream().filter(new EvenNumberFiltering2()).forEach(new PrintingConsumer2());
	}

}
