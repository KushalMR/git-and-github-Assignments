package annotation;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class LocalDateTest {
	public static void main(String[] args) {
		LocalDate ld1 = LocalDate.now(); 
		System.out.println(ld1);
		System.out.println();
		Clock clock = Clock.systemDefaultZone();
		LocalDate ld2 = LocalDate.now(clock); 
		System.out.println(ld2);
		System.out.println();
		
		ZoneId zoneId= ZoneId.of("Europe/Paris");
		LocalDate ld3 = LocalDate.now(zoneId); 
		System.out.println(ld3);
		System.out.println();
		
		LocalDate ld4 = LocalDate.now().minusYears(2); 
		System.out.println(ld4.isLeapYear());
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		availableZoneIds.forEach(System.out::println);
		
		
	}

}
