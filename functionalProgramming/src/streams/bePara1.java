package streams;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class bePara1 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		Predicate<Integer> evenFilerting = e->e%2==0;
		Function<Integer,Integer> mappingFunction = e->e*e;
		Consumer<Integer> sysoutFunction = e->System.out.println(e);
		BinaryOperator<Integer> sum = (x,y)->x+y;
		Supplier<Integer> mySupply = () -> 2810;
		UnaryOperator<Integer> ascendingX = x->x+10;
		
	}

}
