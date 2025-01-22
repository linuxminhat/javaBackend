package joining;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class flatMap2 {
	public static void main(String[] args) {
		Optional<String> s = Optional.of("DangNhatMinh");
		Optional<Integer> r = s.map(String::length);
		System.out.println(r);//12 => Optional[12]
		List<String> myList = List.of("DangNhatMinh","NguyenDucChung","TranLeMinh");
		System.out.println(myList.stream().map(e->e.length()));
		System.out.println(myList.stream().map(e->e.length()).collect(Collectors.toList()));
		
	}

}
