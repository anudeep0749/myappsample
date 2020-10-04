package ocjp;


import java.time.*;

public class Test8 {
   public static void main(String [] args) {
       LocalTime t1 = LocalTime.now();
       LocalDateTime t2 = LocalDateTime.now();
       System.out.println(Duration.between(t2, t1));
   }
}

/*
 * Signature of between method defined in Duration class is: 'Duration
 * between(Temporal startInclusive, Temporal endExclusive)'.
 * 
 * 
 * 
 * As both LocalTime and LocalDateTime implement 'Temporal' interface, hence
 * there is no compilation error.
 * 
 * 
 * 
 * If the Temporal objects are of different types as in this case, calculation
 * is based on 1st argument and 2nd argument is converted to the type of 1st
 * argument.
 * 
 * 1st argument, 't2' is of LocalDateTime and 2nd argument, 't1' is of
 * LocalTime. At runtime it is not possible to convert LocalTime to
 * LocalDateTime and hence exception is thrown at runtime.
 */