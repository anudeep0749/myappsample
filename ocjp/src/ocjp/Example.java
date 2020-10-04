package ocjp;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
 
public class Example {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-80, 100, -40, 25, 200);
        Predicate<Integer> predicate = num -> {
            int ctr = 1;
            boolean result = num > 0;
            System.out.print(ctr++ + ".");
            return result;
        };
 
        list.stream().filter(predicate).sorted();
    }
}

//Streams are lazily evaluated and as sorted() is an intermediate operation, hence stream is not evaluated and you don't get any output on to the console.
