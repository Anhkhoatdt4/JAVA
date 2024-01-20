package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04SundayCounter {
	public static void main(String[] args) {
		System.out.println(count(Calendar.getInstance()));
	}
	
	private static final String Pattern ="dd/MM/yyyy";
	
	private static int count (Calendar c )
	{
		int count = 0 ; 
		
		Calendar startDate = getStartedOfMonth(c);
		Calendar endDate = getEndOfMonth(c);
		
		for (Calendar date = startDate ; date.before(endDate); date.add(Calendar.DAY_OF_MONTH, 1))
		{
			if ( date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
			{
				printTime(date, Pattern);
				count ++;
			}
		}
		
		return count ; 
	}
	
	private static Calendar getStartedOfMonth(Calendar c)
	{
		Calendar result = copy(c);
		result.set(Calendar.DAY_OF_MONTH, 1);
		return result ; 
	}
	
	private static Calendar getEndOfMonth(Calendar c)
	{
		Calendar result = copy(c);
		result.set(Calendar.DAY_OF_MONTH,
				result.getActualMaximum(Calendar.DAY_OF_MONTH));
		return result ; 
	}
	
	private static void printTime (Calendar c , String pattern)
	{
		DateFormat df = new SimpleDateFormat(pattern);
		System.out.println(df.format(c.getTime()));
	}
	
	private static Calendar copy (Calendar input)
	{
		Calendar output = Calendar.getInstance();
		output.setTime(input.getTime());
		return output;
	}
}
