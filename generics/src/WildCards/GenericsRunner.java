package WildCards;

import java.util.List;

public class GenericsRunner {
	static<X> X doubleValue(X value) {
		return value;
	}
	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}
	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for(Number number:numbers) {
			sum+=number.doubleValue();
			//doubleValue : phuong thuc cua Number => chuyen doi gia tri Number sang double
		}
		return sum;
	}

}
