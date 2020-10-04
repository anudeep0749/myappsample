package ocjp;

	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.util.stream.Stream;
	 
	public class Test10 {
	    public static void main(String[] args) throws IOException {
	        Stream<Path> files = Files.list(Paths.get(System.getProperty("user.home")));
	        files.forEach(System.out::println);
	    }
	}

/*
 * Files.list(Path) returns the object of Stream<Path> containing all the paths
 * (files and directories) of current directory. It is not recursive.
 * 
 * 
 * 
 * For recursive access use overloaded Files.walk() methods.
 * 
 */
