package datetime;

import java.util.Calendar;
import java.util.Locale;

public class Ex02DateTimeLoop {
	public static void main(String[] args) {
		Calendar now = getTime(2022, Calendar.OCTOBER, 19 );
		Calendar startDayOfWeek = getStartDayOfWeek(now);
		printTime(now);
		printTime(startDayOfWeek);
		
		for (int i = 0 ; i < 7 ; i ++) {
			printTime(startDayOfWeek);
			startDayOfWeek.add(Calendar.DAY_OF_MONTH, 1);
		}
		
	}
	
	private static Calendar getStartDayOfWeek(Calendar c ) {
		Calendar result = Calendar.getInstance();
		result.setTimeInMillis(c.getTimeInMillis());
		
//		System.out.println(result.getFirstDayOfWeek() - result.get(Calendar.DAY_OF_WEEK));
		
		result.add(Calendar.DAY_OF_MONTH, 
				result.getFirstDayOfWeek() - result.get(Calendar.DAY_OF_WEEK));
		
		return result ; 
	}
	
	private static Calendar getTime(int year, int month , int day) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day);
		return c ; 
	}
	
	private static void printTime(Calendar c) {
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month= c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.println(day +"/" + (month + 1 ) +"/"+ year);
	}
}
