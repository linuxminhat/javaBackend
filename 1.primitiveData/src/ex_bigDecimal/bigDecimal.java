package bigDecimal;

import java.math.BigDecimal;

public class bigDecimal {
	public static void main(String[] args) {
		BigDecimal number1 = new BigDecimal("34.2134569867442333");
		BigDecimal number2 = new BigDecimal("2.344326784532312232343452343535");
		BigDecimal number3 = (number1.add(number2));
		System.out.println(number3);
		
		
	}
}