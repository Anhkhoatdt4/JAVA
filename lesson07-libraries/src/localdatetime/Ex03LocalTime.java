package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex03LocalTime {
	private static final String Pattern = "hh:mm:ss a";
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern(Pattern);
		System.out.println(df.format(now));
	
		LocalTime end = LocalTime.of(21,20, 30);
		Duration duration = Duration.between(now, end);
		System.out.println(duration);
		System.out.println("toString -> \n" 
				+ duration.toHoursPart()
				+duration.toMinutesPart()
				+duration.toSecondsPart());
		
	}
}
