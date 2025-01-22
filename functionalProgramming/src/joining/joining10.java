package joining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class joining10 {
	public static void main(String[] args) {
		List<String> joining10 = List.of("Joining","Chi","Lam","Viec","Voi","Chuoi");
		System.out.println(joining10.stream().collect(Collectors.joining("->")));
		for(String stringIndex:joining10) {
			System.out.println(stringIndex.split(","));
		}
		System.out.println(Arrays.toString("String".split(",")));
	}

}
