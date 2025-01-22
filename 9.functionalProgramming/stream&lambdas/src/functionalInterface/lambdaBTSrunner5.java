package functionalInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class ForEach implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t);
		
	}
	
}
class EvenNumberFiltering5 implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t%2==0;
	}
	
}
public class lambdaBTSrunner5 {
	public static void main(String[] args) {
		List<Integer> myList = List.of(1,2,3,4,5,6,7,8,9,10);
		myList.stream().filter(new EvenNumberFiltering5()).forEach(new ForEach());
		
	}
}
