package ocjp;


interface Printer1 {
    default void print() {
        System.out.println("Printer1");
    }
}
 
class Printer2 {
    public void print() {
        System.out.println("Printer2");
    }
}
 
class Printer extends Printer2 implements Printer1 {
 
}
 
public class Test5 {
    public static void main(String[] args) {
        Printer printer = new Printer();
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