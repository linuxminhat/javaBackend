package resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileWriteRunner2 {
	public static void main(String[] args) throws IOException {
		Path myPath = Paths.get("./resources/data.txt");
		List<String> myList = List.of("Dang Nhat Minh", "NguyenDucChung"," Tran Le Minh");
		Files.write(myPath,myList, StandardOpenOption.APPEND);
		
	}

}
