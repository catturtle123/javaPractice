package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner2 {
	public static void main(String[] args) throws IOException {
		Path currentDirectory = Paths.get("./resource/data.txt");
		
		List<String> readAllLines = Files.readAllLines(currentDirectory);
		
		System.out.println(readAllLines);
		
		Files.lines(currentDirectory).map(String::toLowerCase).filter(str->str.contains("1")).forEach(System.out::println);
	}
}
