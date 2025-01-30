package resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner6 {
	public static void main(String[] args) throws IOException {
		Path myPath = Paths.get("./resources/data.txt");
		List<String> result = Files.readAllLines(myPath);
		System.out.println(result);
	}
}
