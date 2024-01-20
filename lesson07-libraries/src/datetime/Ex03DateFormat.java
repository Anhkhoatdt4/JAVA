package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormat {
	public static void main(String[] args) {
		
		String pattern = "dd/MM/yyyy EEEE HH:mm:ss a";
		DateFormat df = new SimpleDateFormat(pattern);
		
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		
		String formatted = df.format(date);
		System.out.println(formatted);
		String birthdayAsString = "18/7/1990";
		df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date parseDate = df.parse(birthdayAsString);
			System.out.println(parseDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}