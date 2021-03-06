package ocjp;

	 
	import java.util.Set;
	import java.util.stream.Collectors;
	import java.util.stream.Stream;
	 
	public class Test16 {
	    public static void main(String[] args) {
	        Stream<String> stream = Stream.of("java", "python", "c",
	                "c++", "java", "python");
	        Set<String> set = stream.collect(Collectors.toSet());
	        System.out.println(set.size());
	    }
	}
	
/*
 * Set doesn't allow duplicates, which means generated set will have 4 elements
 * ["java", "python", "c", "c++] and therefore set.size() will return 4.
 */