package ocjp;

public class InnerClassesEx {

	 
	    class A {
	        void m() {
	            System.out.println("INNER");
	        }
	    }
	    
	    public static void main(String [] args) {
	        //Insert statement here
	    	A a1=new InnerClassesEx().new A();
	    	a1.m();
	    }
	}


/*
 * There are 2 parts: 1st one is referring the name of inner class, A and 2nd
 * one is creating the instance of inner class, A.
 * 
 * main method is inside Test class only, so inner class can be referred by 2
 * ways: A or Test.A.
 * 
 * 
 * 
 * As, A is Regular inner class, so instance of outer class is needed for
 * creating the instance of inner class. As keyword 'this' is not allowed inside
 * main method, so instance of outer class, Test can only be obtained by new
 * Test(). Instance of inner class can be created by: new Test().new A();
 * 
 * 
 * 
 * Also note, keyword 'this' is not allowed static main method.
 */