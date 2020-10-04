package ocjp;


import java.util.Arrays;
import java.util.Comparator;
 
public class Test26 {
    public static void main(String[] args) {
        String [] arr = {"A5", "B4", "C3", "D2", "E1"};
        Arrays.sort(arr, Comparator.comparing(s -> s.substring(1)));
        for(String str : arr) {
            System.out.print(str + " ");
        }
    }
}

/*
 * Sorting is working on 2nd letter of the array elements, which means 5, 4, 3,
 * 2, 1.
 * 
 * Sorting is in ascending order (1, 2, 3, 4, 5) hence the output is: E1 D2 C3
 * B4 A5
 */