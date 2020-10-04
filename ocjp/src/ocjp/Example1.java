package ocjp;
 
import java.util.Scanner;
 
public class Example1 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int i = scanner.nextInt();
            if(i % 2 != 0) {
                assert false;
            }
        } catch(Exception ex) {
            System.out.println("ONE");
        } catch(Error ex) {
            System.out.println("TWO");
        }
    }
}


/*
 * Assertions are disabled by default, so assert false; statement is not
 * executed.
 * 
 * 
 * 
 * No output is shown and program terminates successfully.
 * 
 * 
 * 
 * If above program is run with -ea option, the 'TWO' will be printed on to the
 * console as AssertionError extends Error.
 * 
 * 
 * 
 * NOTE: It is not a good programming practice to validate user input using
 * assertion.
 * 
 */