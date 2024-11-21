package localDate_localTime_localDateTime;

import java.time.LocalDate;

public class localDate_extensions {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		//set the day of yesterday 
		LocalDate yesterday = LocalDate.of(2024, 06, 24);
		System.out.println(yesterday);
		System.out.println(today.withYear(2018));
		System.out.println(today.withDayOfMonth(10));
	}

}
