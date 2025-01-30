package resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class DirScanRunner6 {
	public static void main(String[] args) throws IOException {
		Files.list(Paths.get(".")).forEach(e->System.out.println(e));
		Path currentDirectory = Paths.get(".");
		Files.walk(currentDirectory, 3).forEach(e->System.out.println(e));
		Predicate<? super Path> predicate = path1 -> String.valueOf(path1).contains(".java");
		Files.walk(currentDirectory, 4).filter(predicate).forEach(e->System.out.println(e));
	}

}
