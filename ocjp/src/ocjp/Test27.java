package ocjp;


	import java.time.*;
	 
	public class Test27 {
	    public static void main(String[] args) {
	        Instant instant = Instant.now();
	        LocalDateTime obj = null; //Line n1
	    }
	}

/*
 * Instant class doesn't have any method to convert to LocalDate, LocalDateTime
 * or LocalTime and vice-versa. Hence, 'instant.toLocalDateTime();' and
 * 'LocalDateTime.of(instant);' cause compilation error.
 * 
 * '(LocalDateTime)instant' also causes compilation failure as LocalDateTime and
 * Instant are not related in multilevel inheritance.
 * 
 * 
 * 
 * Hence, the only option left is:
 * 'instant.atZone(ZoneId.systemDefault()).toLocalDateTime();'.
 * 
 * 
 * 
 * Let us understand what is happening with above statement:
 * 
 * ZonedDateTime class has methods to convert to LocalDate, LocalDateTime and
 * LocalTime instances. So, object of Instant is first converted to
 * ZonedDateTime.
 * 
 * An Instant object doesn't store any information about the time zone, so to
 * convert it to ZonedDateTime, the default zone (ZoneId.systemDefault()) is
 * passed to atZone method.
 * 
 * 'instant.atZone(ZoneId.systemDefault())' returns an instance of ZonedDateTime
 * and toLocalDateTime() method returns the corresponding instance of
 * LocalDateTime.
 */