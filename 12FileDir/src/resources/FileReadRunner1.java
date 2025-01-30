package resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner1 {
	public static void main(String[] args) throws IOException {
		Path fileToRead = Paths.get("./resources/data.txt");
		List<String> lines = Files.readAllLines(fileToRead);
		System.out.println(lines);
		
	}

}
