package functionalInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
class EvenNumberFiltering implements Predicate<Integer> {

	@Override
	public boolean test(Integer n) {
		// TODO Auto-generated method stub
		return n%2==0;
	}
	
}
class PrintingConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}
public class lambdaBTSrunner {
	public static void main(String[] args) {
		List<Integer> myList = List.of(23,43,34,45,36,48);
//		myList.stream().filter(n->n%2==0).forEach(e->System.out.println(e));
		myList.stream().filter(new EvenNumberFiltering()).forEach(e->System.out.println(e));
	}

} 
