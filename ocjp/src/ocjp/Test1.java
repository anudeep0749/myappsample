package ocjp;
public class Test1 {
    public static void main(String[] args) {
        Operation o1 = (x, y) -> x + y; 
        System.out.println(o1.operate(5, 10));
    }
}
/*
 * From the given syntax inside main method, it is clear that interface name is
 * Operation and it has an abstract method operate which accepts 2 parameters of
 * numeric type and returns the numeric result (as result of adding 5 and 10 is
 * 15).
 * 
 * So, int and long versions can be easily applied here.
 * 
 * 
 * 
 * Operation<T> will not work here as inside main method, raw type is used,
 * which means x and y will be of Object type and x + y will cause compilation
 * error as + operator is not defined when both the operands are of Object type.
 * 
 * 
 * 
 * For Operation<T extends Integer>, even though main method uses raw type, but
 * x and y will be of Integer type and hence x + y will not cause any
 * compilation error.
 */