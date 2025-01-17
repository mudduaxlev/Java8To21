package java8.dateandtime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;

public class ImplEx {
	
	public static void main(String[] args) {
		checkTime();
	}

	private static void checkTime() {
		
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.of(2025, 12, 23));
		System.out.println(LocalTime.now());
		System.out.println(LocalTime.of(6, 12, 32, 1234));
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.of(2025, 1, 16, 6, 12, 30));
		System.out.println(ZonedDateTime.now());
		System.out.println(Instant.now());
		System.out.println(Period.between(LocalDate.of(2024, 1, 1), LocalDate.of(2025, 2, 23)));
		System.out.println(Duration.between(LocalTime.of(1, 23), LocalTime.of(12, 1)));
	}

}
