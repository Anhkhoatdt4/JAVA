package localdatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex01LocalDate {
	private static final String Pattern = "dd/MM/yyyy";
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern(Pattern);
		String text = df.format(now);
		System.out.println(text);
	}
	
	
	
}
