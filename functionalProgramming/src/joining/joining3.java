package joining;

import java.util.List;
import java.util.stream.Collectors;

public class joining3 {
	public static void main(String[] args) {
		List<String> myList = List.of("Joining","Chi","Lam","Viec","Voi","Chuoi");
		System.out.println(myList.stream().collect(Collectors.joining()));
	}

}
