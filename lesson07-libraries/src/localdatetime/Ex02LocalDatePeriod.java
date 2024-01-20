package localdatetime;

import java.time.LocalDate;
import java.time.Period;

public class Ex02LocalDatePeriod {
	public static void main(String[] args) {
		
		//LocalDate : d/M/y
		// Period " find distance from star until end
		LocalDate start = LocalDate.now();
		LocalDate end = LocalDate.of(2022, 12, 31);
		
		Period period = Period.between(start, end);
		System.out.println(period);
		System.out.println(period.getMonths()+"/"+period.getDays());
	}
}
