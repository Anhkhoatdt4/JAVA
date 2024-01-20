package datetime;

import java.io.ObjectInputStream.GetField;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01DateTimeBasicDemo {
	public static void main(String[] args) {
//		//1. ngay gio thang nam hien tai 	
		Date now = new Date();
		System.out.println(now);
		Date notNow = new Date(7200);
		System.out.println(notNow);
		Calendar c = Calendar.getInstance();
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1 ;
		int year = c.get(Calendar.YEAR);
		String current = "" + dayOfMonth + "/" + month +"/"+year;
		System.out.println(current);
		
		Calendar cNotNow = Calendar.getInstance();
		cNotNow.set(1999, Calendar.AUGUST, 10);
		System.out.println(cNotNow);
		
		
		//2 . gio 12-24 
		cNotNow.set(Calendar.SECOND, Calendar.getInstance().get(Calendar.SECOND));
		String hms = "" + cNotNow.get(Calendar.HOUR_OF_DAY) +"/"+ cNotNow.get(Calendar.MINUTE)+"/"+cNotNow.get(Calendar.SECOND);
		System.out.println(hms);
		
		//3 . thu ngay , tuan thang trong nam 
		// 3. 1 in ra thu hien tai ; sunday : 1 -> saturday : 7
		
		int dow = c.get(Calendar.DAY_OF_WEEK);
		String[] days = {"Chu nhat","Thu Hai","BA","Tu","Nam","Sau","Bay"};
		System.out.println("Hom nay la: "+ days[dow-1] );
		
		//4 . Dem so ngay thang nam hien tai 
		int cMonth = c.get(Calendar.MONTH) + 1 ;
		int daysOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Month " + cMonth + " has " + daysOfMonth);
		
		//5. Nam hien tai co phai nam nhuan khong 
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear : " + gc.isLeapYear(2020));
		
		//6. ngay dau tien trong tuan la ngay thu may 
		Calendar c1 = Calendar.getInstance(new Locale("vi","VN"));
		System.out.println("VN : "+ c1.getFirstDayOfWeek() );
		
		//7. ngay dau tien hien tai trong tuan la ngay thu may 
		Calendar today = Calendar.getInstance();
		today.set(2023,Calendar.OCTOBER , 4);
		int tfdow = today.getFirstDayOfWeek();
		int tdow = today.get(Calendar.DAY_OF_WEEK);
		
		today.add(Calendar.DAY_OF_MONTH, tfdow- tdow);
		System.out.println();
	}
	
}
