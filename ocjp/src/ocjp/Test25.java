package ocjp;

	 
	public class Test25 {
	    public static void main(String[] args) {
	        try { //outer
	            try { //inner
	                System.out.println(1/0);
	            } catch(ArithmeticException e) {
	                System.out.println("Inner");
	            } finally {
	                System.out.println("Finally 1");
	            }
	        } catch(ArithmeticException e) {
	            System.out.println("Outer");
	        } finally {
	            System.out.println("Finally 2");
	        }
	    }
	}

/*
 * System.out.println(1/0); throws ArithmeticException, handler is available in
 * inner catch block, it executes and prints "Inner" to the console.
 * 
 * 
 * 
 * Once we handled the exception, no other catch block will get executed unless
 * we re-throw the exception.
 * 
 * 
 * 
 * Inner finally gets executed and prints "Finally 1" to the console.
 * 
 * 
 * 
 * Rule is finally block always gets executed, so outer finally gets executed
 * and prints "Finally 2" to the console.
 */