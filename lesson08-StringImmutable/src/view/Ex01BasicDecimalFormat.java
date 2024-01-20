package view;

import java.text.DecimalFormat;

public class Ex01BasicDecimalFormat {
	private static final String Pattern = "#,###.##";
	public static void main(String[] args) {
		/*
		 *  # ky tu so - phan nguyen
		 *  0 ky tu so - phan thap phan 
		 *  , ngan cach phan nguyen
		 *  . : ngan cach phan thap phan 
		 */
		
		DecimalFormat df = new DecimalFormat(Pattern);
		String formatted = df.format(1234567.258d);
		System.out.println(formatted);
	}
}	
