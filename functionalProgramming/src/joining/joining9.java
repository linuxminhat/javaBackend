package joining;

import java.util.List;
import java.util.stream.Collectors;

public class joining9 {
	public static void main(String[] args) {
		List<String> joining9 = List.of("Joining","Chi","Lam","Viec","Voi","Chuoi");
		System.out.println(joining9.stream().collect(Collectors.joining()));
		
	}

}
