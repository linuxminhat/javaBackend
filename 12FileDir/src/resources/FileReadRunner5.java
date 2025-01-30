package resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner5 {
	public static void main(String[] args) throws IOException {
		Path filePath = Paths.get("./resources/data.txt");
		List<String> result = Files.readAllLines(filePath);
		System.out.println(result);
	}

}
