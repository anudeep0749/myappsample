package ocjp;


	 
	import java.util.stream.IntStream;
	 
	public class Test29 {
	    public static void main(String[] args) {
	        int sum = IntStream.rangeClosed(1,3).map(i -> i * i)
	                .map(i -> i * i).sum();
	        System.out.println(sum);
	    }
	}

/*
 * IntStream.rangeClosed(int start, int end) => Returns a sequential stream from
 * start to end, both inclusive and with a step of 1.
 * 
 * 
 * 
 * IntStream.map(IntUnaryOperator) => Returns a stream consisting of the results
 * of applying the given function to the elements of this stream.
 * 
 * 
 * 
 * IntStream.rangeClosed(1,3) => [1,2,3].
 * 
 * 
 * 
 * map(i -> i * i) => [1,4,9].
 * 
 * 
 * 
 * map(i -> i * i) => [1,16,81].
 * 
 * 
 * 
 * sum() => 1+16+81 = 98.
 */