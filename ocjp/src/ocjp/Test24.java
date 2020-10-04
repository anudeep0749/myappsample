package ocjp;


	 
	import java.util.ArrayList;
	import java.util.List;
	 
	public class Test24 {
	    public static void main(String[] args) {
	        List<String> list = new ArrayList<>();
	        System.out.println(list.stream().anyMatch(s -> s.length() > 0));
	        System.out.println(list.stream().allMatch(s -> s.length() > 0));
	        System.out.println(list.stream().noneMatch(s -> s.length() > 0));
	    }
	}

/*
 * Method signatures:
 * 
 * boolean anyMatch(Predicate<? super T>) : Returns true if any of the stream
 * element matches the given Predicate. If stream is empty, it returns false and
 * predicate is not evaluated.
 * 
 * 
 * 
 * boolean allMatch(Predicate<? super T>) : Returns true if all the stream
 * elements match the given Predicate. If stream is empty, it returns true and
 * predicate is not evaluated.
 * 
 * 
 * 
 * boolean noneMatch(Predicate<? super T>) : Returns true if none of the stream
 * element matches the given Predicate. If stream is empty, it returns true and
 * predicate is not evaluated.
 * 
 * 
 * 
 * In this case, as stream is empty anyMatch returns false, whereas allMatch and
 * noneMatch both returns true.
 */