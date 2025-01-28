package joining;

import java.util.List;
import java.util.stream.Collectors;

public class joining6 {
	public static void main(String[] args) {
		List<String> joining6 = List.of("Joining","Chi","Lam","Viec","Voi","Chuoi");
		System.out.println(joining6.stream().collect(Collectors.joining()));
		List<String> joining7 = List.of("Review","Joining","Chi","Lam","Viec","Voi","Chuoi");
		System.out.println(joining7.stream().collect(Collectors.joining(" ")));
		
	}

}
