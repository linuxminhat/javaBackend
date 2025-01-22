package optional;

import java.util.Optional;

public class optional1 {
	public static void main(String[] args) {
		/*
		 * Optional trong Java la lop gioi thieu trong Java8 
		 * Dai dien cho gia tri co the ton tai hoac khong ton tai
		 * Tranh loi pho bien lien quan den Null, NullPointerException
		 */
		Optional<String> myOptional = Optional.empty();
		System.out.println(myOptional);
		Optional<String> myOptional1 = Optional.of("Hello this is Dang Nhat Minh !");
		System.out.println(myOptional1);
		Optional<String> optionalNullable = Optional.ofNullable(null);
		System.out.println(optionalNullable);
	}
	

}
