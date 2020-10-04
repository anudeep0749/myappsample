package ocjp;

	
/*Daylight saving time 2018 in United States (US) ends at 4-Nov-2018 2:00 AM. 
What will be the result of compiling and executing Test class?
*/
	 
	import java.time.*;
	 
	public class Test19 {
	    public static void main(String [] args) {
	        LocalDate date = LocalDate.of(2018, 11, 4);
	        LocalTime time = LocalTime.of(13, 59, 59);
	        ZonedDateTime dt = ZonedDateTime.of(date, time, ZoneId.of("America/New_York"));
	        dt = dt.plusSeconds(1);
	        System.out.println(dt.getHour() + ":" + dt.getMinute() + ":" + dt.getSecond());
	    }
	}

/*
 * You should be aware of Day light saving mechanism to answer this question.
 * 
 * Suppose daylight time starts at 2 AM on particular date.
 * 
 * Current time: 1:59:59 [Normal time].
 * 
 * Next second: 3:00:00 [Time is not 2:00:00 rather it is 3:00:00. It is
 * Daylight saving time].
 * 
 * Clock just jumped from 1:59:59 to 3:00:00.
 * 
 * 
 * 
 * Now Suppose daylight time ends at 2 AM on particular date.
 * 
 * Current time: 1:59:59 [Daylight saving time].
 * 
 * Next second: 1:00:00 [Time is not 2:00:00 rather it is 1:00:00. Clock
 * switched back to normal time].
 * 
 * Clock just went back from 1:59:59 to 1:00:00.
 * 
 * 
 * 
 * Now let's solve given code:
 * 
 * dt --> {2018-11-04T13:59:59}. Daylight saving time has already ended as it is
 * PM and not AM. This is acturally a normal time now.
 * 
 * 
 * 
 * dt.plusSeconds(1) => creates a new ZonedDateTime object {2018-11-04T14:00:00}
 * and dt refers to it.
 * 
 * 
 * 
 * dt.getHour() = 14, dt.getMinute() = 0 and dt.getSecond() = 0.
 * 
 */