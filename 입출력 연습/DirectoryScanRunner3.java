package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner3 {
	public static void main(String[] args) throws IOException {
		Path currentDirectory = Paths.get("./resource/write.txt");
		
		List<String> list = List.of("Apple","Bat");
		
		Files.write(currentDirectory, list);
	}
}
