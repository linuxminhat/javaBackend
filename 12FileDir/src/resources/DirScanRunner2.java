package resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class DirScanRunner2 {
	public static void main(String[] args) throws IOException {
		Files.list(Paths.get(".")).forEach(System.out::println);
		Path currentDir = Paths.get(".");
		Files.walk(currentDir, 10).forEach(e->System.out.print(e));
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		Files.walk(currentDir, 3).filter(predicate).forEach(System.out::print);
	}

}
