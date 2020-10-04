package ocjp;


import java.util.OptionalInt;

class MyException1 extends Exception{}

public class MyException {
   public static void main(String[] args) {
       OptionalInt optional = OptionalInt.empty();
       System.out.println(optional.orElseThrow(MyException1::new));
   }
}
/*
 * MyException is a checked exception, so 'handle or declare' rule must be
 * followed.
 * 
 * 
 * 
 * 'orElseThrow(MyException::new)' can throw checked exception at runtime, so it
 * must be surrounded by a try-catch block or main method should declare proper
 * throws clause.
 */