package joining;

import java.util.List;
import java.util.stream.Collectors;

public class joining7 {
	public static void main(String[] args) {
		List<String> joining7 = List.of("Joining","Chi","Lam","Viec","Voi","Chuoi");
		System.out.println(joining7.stream().collect(Collectors.joining()));
		
	}
}
