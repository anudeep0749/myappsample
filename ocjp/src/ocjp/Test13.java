package ocjp;

	 
	import java.util.function.ToIntFunction;
	 
	public class Test13 {
	    public static void main(String[] args) {
	        String text = "Aa aA aB Ba aC Ca";
	        ToIntFunction<String> func = text::indexOf;
	        System.out.println(func.applyAsInt("a"));
	    }
	}
/*
 * 'text::indexOf' is equivalent to lambda expression 'search ->
 * text.indexOf(search)'.
 * 
 * 
 * 
 * ToIntFunction<T> has method: int applyAsInt(T value);.
 * 
 * 
 * 
 * In this case T is of String type.
 * 
 * 
 * 
 * func.applyAsInt("a") will invoke text.indexOf("a"), which returns the index
 * of first occurrence of "a". In the given text, it is 1.
 */