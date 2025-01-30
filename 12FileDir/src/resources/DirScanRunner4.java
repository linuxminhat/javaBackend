package resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class DirScanRunner4 {
	public static void main(String[] args) throws IOException {
		Files.list(Paths.get(".")).forEach(System.out::println);
		Path currentDirectory = Paths.get(".");
		Files.walk(currentDirectory, 1000).forEach(e->System.out.println(e));
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		Files.walk(currentDirectory, 4).filter(predicate).forEach(e->System.out.println(e));
	}

}
