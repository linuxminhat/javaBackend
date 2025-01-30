package resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class DirScanRunner3 {
	public static void main(String[] args) throws IOException {
		Files.list(Paths.get(".")).forEach(System.out::print);
		Path currentDir = Paths.get(".");
		Files.walk(currentDir, 100).forEach(e->System.out.println(e));
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		Files.walk(currentDir, 5).filter(predicate).forEach(e->System.out.println(e));
		
	}

}
