package joining;

import java.util.List;
import java.util.stream.Collectors;

public class joining8 {
	public static void main(String[] args) {
		List<String> joining8 = List.of("Joining","Chi","Lam","Viec","Voi","Chuoi");
		System.out.println(joining8.stream().collect(Collectors.joining()));
		
	}

}
