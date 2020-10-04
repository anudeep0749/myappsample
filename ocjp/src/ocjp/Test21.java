package ocjp;

	
	import java.time.LocalDate;
	 
	public class Test21 {
	    public static void main(String [] args) {
	        LocalDate date = LocalDate.ofEpochDay(0);
	        System.out.println(date);
	    }
	}

/*
 * 0th day in epoch is: 1970-01-01, 1st day in epoch is: 1970-01-02 and so on.
 * 
 * 
 * 
 * as toString() method of LocalDate class prints the LocalDate object in
 * ISO-8601 format: "uuuu-MM-dd". Hence output is: '1970-01-01'.
 */