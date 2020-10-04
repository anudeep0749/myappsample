package ocjp;

	import java.io.*;
	import java.nio.file.Files;
	import java.nio.file.Paths;
	 
	public class Test7 {
	    public static void main(String[] args) throws IOException {
	        /*INSERT*/
	    }
	}

	//F: is accessible for reading and contains 'Book.java' file. 

	// Which of the following statements, if used to replace /*INSERT*/, will successfully print contents of 'Book.java' on to the console?
	// Select 3 options. 

/*
 * Below are the declarations of lines and readAllLines methods from Files
 * class:
 * 
 * public static Stream<String> lines(Path path) throws IOException {...}
 * 
 * public static List<String> readAllLines(Path path) throws IOException {...}
 * 
 * 
 * 
 * 'Files.lines(Paths.get("F:\\Book.java"))' returns Stream<String> object.
 * Hence forEach() can be invoked but stream() can't be invoked.
 * 
 * 
 * 
 * 'Files.readAllLines(Paths.get("F:\\Book.java"))' returns List<String> object.
 * Hence both forEach() and stream() methods can be invoked. List has both the
 * methods. But converting list to stream() and then invoking forEach() method
 * is not required but it is a legal syntax and prints the file contents.
 * 
 */