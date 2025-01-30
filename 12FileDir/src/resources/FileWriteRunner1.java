package resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner1 {
	public static void main(String[] args) throws IOException {
		Path myPath = Paths.get("./resources/data.txt");
		List<String> myList = List.of("Pham Sy Dang Khoa"," Ngo Tran Thien An");
		Files.write(myPath, myList);
		
		
	}

}
