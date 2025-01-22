package joining;

import java.util.List;
import java.util.stream.Collectors;

public class joining5 {
	public static void main(String[] args) {
		List<String> joining5 = List.of("Joining","Chi","Lam","Viec","Voi","Chuoi");
		System.out.println(joining5.stream().collect(Collectors.joining()));
		
	}

}
