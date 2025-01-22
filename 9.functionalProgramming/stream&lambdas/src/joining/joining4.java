package joining;

import java.util.List;
import java.util.stream.Collectors;

public class joining4 {
	public static void main(String[] args) {
		List<String> joining4 = List.of("Joining","Chi","Lam","Viec","Voi","Chuoi");
		System.out.println(joining4.stream().collect(Collectors.joining()));
		
	}

}
