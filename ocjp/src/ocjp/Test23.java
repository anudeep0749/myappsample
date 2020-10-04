package ocjp;


	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	 
	public class Test23 {
	    public static void main(String[] args) {
	        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	        list.removeIf(i -> i % 2 == 1);
	        System.out.println(list);
	    }
	}


  /*Arrays.asList(...) method returns a list backed with array, so items cannot
 * be added to or removed from the list.
 * 
 * 
 * 
 * But if this list is passed to the constructor of ArrayList, then new
 * ArrayList instance is created which copies the elements of passed list and
 * elements can be added to or removed from this list.
 * 
 * 
 * 
 * List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)); =>
 * [1,2,3,4,5,6,7,8,9,10].
 * 
 * list.removeIf(i -> i % 2 == 1); => [2,4,6,8,10]. Remove the element for which
 * passed Predicate is true.
 */