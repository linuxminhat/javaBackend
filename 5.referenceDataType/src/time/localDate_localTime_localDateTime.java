package localDate_localTime_localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class localDate_localTime_localDateTime{
	public static void main(String[] args) {
		LocalDate dayNow = LocalDate.now();
		System.out.println(dayNow);
		LocalTime timeNow = LocalTime.now();
		System.out.println(timeNow);
		LocalDateTime daytimeNow = LocalDateTime.now();
		System.out.println(daytimeNow);
		
	}
} 