package functionalInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class EvenNumberFiltering1 implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t%2==0;
	}
	
}
class PrintingConsumer1 implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}
	
}
public class lambdaBTSrunner1 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(23,54,7534,223);
		myList.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
		myList.stream().filter(new EvenNumberFiltering1()).forEach(e->System.out.println(e));
		
	}

}
