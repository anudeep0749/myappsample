package ocjp;

	
	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.nio.file.attribute.BasicFileAttributes;
	import java.util.function.BiPredicate;
	import java.util.stream.Stream;
	 
	public class Test20 {
	    public static void main(String[] args) throws IOException {
	        Path root = Paths.get("F:");
	        BiPredicate<Path, BasicFileAttributes> predicate = (p,a) -> p.toString().endsWith("txt");
	        try(Stream<Path> paths = Files.find(root, 2, predicate))
	        {
	            paths.forEach(System.out::println);
	        }
	    }
	}
	
/*
 * String class has endsWith method, and the lambda expression '(p,a) ->
 * p.toString().endsWith("txt")' will return all the paths ending with "txt".
 * 
 * 
 * 
 * Signature of find method is:
 * 
 * Stream<Path> find(Path start, int maxDepth, BiPredicate<Path,
 * BasicFileAttributes> matcher, FileVisitOption... options)
 * 
 * 
 * 
 * and in the code, following syntax is used: Files.find(root, 2, predicate).
 * 
 * 
 * 
 * root refers to 'F:' and maxDepth is 2. This means look out for all the files
 * under F: (depth 1) and all the files under the directories whose immediate
 * parent is F: (depth 2).
 * 
 * 
 * 
 * So in this case, F: and Parent directory are searched for the matching files.
 * 'F:Parent\a.txt' and 'F:Parent\b.txt' are printed on to the console.
 */