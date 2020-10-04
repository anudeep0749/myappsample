package ocjp;


	 
	import java.nio.file.Path;
	import java.nio.file.Paths;
	 
	public class Test11 {
	    public static void main(String[] args) {
	        Path path = Paths.get("F:\\A\\B\\C\\Book.java");
	        System.out.println(path.subpath(1,4));
	    }
	}

/*
 * Root folder or drive is not considered in count and indexing. In the given
 * path A is at 0th index, B is at 1st index, C is at 2nd index and Book.java is
 * at 3rd index.
 * 
 * 
 * 
 * In 'subpath(int beginIndex, int endIndex)' method beginIndex in inclusive and
 * endIndex is exclusive. So, in the given question, starting index is 1 and end
 * index is 3.
 * 
 * 
 * 
 * So, 'path.subpath(1,4)' returns 'B\C\Book.java'.
 */