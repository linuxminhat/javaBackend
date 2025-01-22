package joining;

import java.util.List;
import java.util.stream.Collectors;

public class joining2 {
	public static void main(String[] args) {
		List<String> groupPBL = List.of("DangNhatMinh", "NguyenDucChung", "TranLeMinh");
		System.out.println(groupPBL.stream().collect(Collectors.joining()));
	}

}
