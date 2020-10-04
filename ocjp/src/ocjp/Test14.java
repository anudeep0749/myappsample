package ocjp;

	 
	interface Printer11 {
	    default void print() {
	        System.out.println("Printer1");
	    }
	}
	 
	class Printer12 {
	    public void print() {
	        System.out.println("Printer2");
	    }
	}
	 
	class Printer13 extends Printer12 implements Printer11 {
	 
	}
	 
	public class Test14 {
	    public static void main(String[] args) {
	        Printer13 printer = new Printer13();
	        printer.print();
	    }
	}

	
/*
 * print() method is defined in interface Printer1 and class Printer2.
 * 
 * class Printer inherits both the methods but there is no conflict in this case
 * as print() method defined in Printer2 class is used.
 * 
 * 'Printer2' is printed on to the console.
 */