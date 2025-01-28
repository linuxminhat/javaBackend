package streams;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class bePara {
	public static void main(String[] args) {
		//this is functional interfaces 
		List<Integer> numbers = List.of(12,23,34,45,56,67,78,89);
		//Predicate<T> - filter : functional interface trong java, dung de kiem tra 1 dieu kien tren doi tuong T
		Predicate<Integer> isEvenPredicate = x->x%2==0;
		//Function<T,R> - map : dung de bien doi mot doi tuong kieu T sang kieu R
		Function<Integer,Integer> squareFunction = x->x*x;
		//Consumer<T> : dung de thuc hien hanh dong tren doi tuong T ma khong tra ve gia tri
		Consumer<Integer> sysoutConsumer = x->System.out.println(x);
		//BinaryOperator<T> mo rong tu BinaryOperator<T,T,T> : thuc hien phep toan tren doi tuong T -> tra ve T
		BinaryOperator<Integer> sumBinaryOperator = (x,y) -> x+y;
		UnaryOperator<Integer> sumUnaryOperator = x->x+x;
		Supplier<Integer> mySupply = ()->2810;
		Supplier<Integer> mySupply1 = ()->59;
		Supplier<Integer> mySupply2 = ()->1972;
		Supplier<Integer> mySupply3 = ()->91;
		Supplier<Integer> mySupply4 = ()->19;
		System.out.println(mySupply.get());
		//Functional Interfaces bieu dien phep toan cu the 
		BiPredicate<String,Integer> isLengthLethal = (str,len)->str.length()==len;
		System.out.println(isLengthLethal.test("Hello", 5));
		BiPredicate<String,String> isContain = (str1,str2)->str1.contains(str2);
		System.out.println(isContain.test("DangNhatMinh", "NhatMinh"));
		BiPredicate<String,String> isContainCharacter = (str1,charac1)->str1.contains(charac1);
		BiPredicate<String,Character> isContainingCharacter = (str1,charac1)->str1.indexOf(charac1)!=-1;
		BiFunction<Integer,Integer,Boolean> filerChecking = (numb1,numb2)->numb2%numb1==0;
		BiConsumer<Integer,Integer> printing2Number = (numb1,numb2)->{
			System.out.println(numb1);
			System.out.println(numb2);
		};
		printing2Number.accept(2323, 3322);
//		Consumer<String> test1 = ()->{};
//		Consumer<String> test2 = (" ")->{" "};
		
		
		
		
		
	}

}
