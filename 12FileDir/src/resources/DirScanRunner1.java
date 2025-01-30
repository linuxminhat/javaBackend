package resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class DirScanRunner1 {
	public static void main(String[] args) throws IOException {
		Files.list(Paths.get(".")).forEach(System.out::println);
		//Path : Interface trong java 
		Path currentDirectory = Paths.get(".");
		//Duyet qua cay thu muc => start la currentDirectory, sau la 5
		Files.walk(currentDirectory, 5).forEach(System.out::print);
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		Files.walk(currentDirectory, 4).filter(predicate).forEach(e->System.out.println(e));
	}

}
