package ocjp;


	 
	import java.util.Arrays;
	import java.util.List;
	import java.util.concurrent.*;
	 
	public class Test12 {
	    public static void main(String[] args) throws InterruptedException, ExecutionException {
	        Callable<String> c = new Callable<String>() {
	            @Override
	            public String call() throws Exception {
	                try {
	                    Thread.sleep(3000);
	                } catch(InterruptedException e) {}
	                return "HELLO";
	            }
	        };
	 
	        ExecutorService es = Executors.newFixedThreadPool(10);
	        List<Callable<String>> list = Arrays.asList(c,c,c,c,c);
	        List<Future<String>> futures = es.invokeAll(list);
	        System.out.println(futures.size());
	        es.shutdown();
	    }
	}

/*
 * There is a fixed thread pool of 10 threads, this means 10 threads can run in
 * parallel.
 * 
 * invokeAll() method causes the current thread (main) to wait, until all the
 * Callable instances finish their execution.
 * 
 * This means 'System.out.println(futures.size());' will execute once all the 5
 * tasks are complete.
 * 
 * 
 * 
 * Important point to note here is that all the Callable instances are executed
 * in parallel. Even if all the tasks start at one instant, there will always be
 * some overhead for sleeping thread to become running.
 * 
 * In most of the cases it will be in nanoseconds/milliseconds. Hence overall
 * time will be slightly greater than 3 secs.
 */