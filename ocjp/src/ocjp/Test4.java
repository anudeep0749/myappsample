package ocjp;

import java.util.stream.IntStream;

public class Test4 {
    public static void main(String[] args) {
        IntStream stream = "OCP".chars();
        stream.forEach(c -> System.out.print((char)c));
        System.out.println(stream.count()); //Line 9
    }
}

/*
 * forEach, count, toArray, reduce, collect, findFirst, findAny, anyMatch,
 * allMatch, sum, min, max, average etc. are considered as terminal operations.
 * 
 * 
 * 
 * Once the terminal operation is complete, all the elements of the stream are
 * considered as used.
 * 
 * Any attempt to use the stream again causes IllegalStateException.
 * 
 * 
 * 
 * In this example, count() is used after using forEach() method and hence
 * IllegalStateException is thrown.
 */