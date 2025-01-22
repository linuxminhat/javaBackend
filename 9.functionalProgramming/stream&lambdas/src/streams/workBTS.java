package streams;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//custome class into function
class EvenNumberFiltering implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t%2==0;
	}
	
}
class MappingNumberintoNumber implements Function<Integer,Integer>{

	@Override
	public Integer apply(Integer t) {
		// TODO Auto-generated method stub
		return t*t;
	}
	
}

class forEachLooping implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}
	
}
public class workBTS {
	public static void main(String[] args) {
		//Implement using original function
		List<Integer> myList = List.of(12,23,34,45,56,67,78,89);
		System.out.println(myList);
		//Take Even Number -> Square it -> Printing it
		myList.stream().filter(e->e%2==0).map(e->e*e).forEach(e->System.out.println(e));
		//Custome this function
		myList.stream().filter(new EvenNumberFiltering()).map(new MappingNumberintoNumber()).forEach(new forEachLooping());

	}

}
