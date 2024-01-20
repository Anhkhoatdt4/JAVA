package declaration;

import until.ArrayUntils;

public class BulbleSort {
	public static void main(String[] args) {
		int[] digits = {4, 2 , 11 , 6 , 3 , 7 };
		ArrayUntils.printf("digits" , digits);
//		bulblesort(digits);
//		ArrayUntils.printf("digits1" , digits);
		sort(digits);
		ArrayUntils.printf("digits2" , digits);
	}
	private static void bulblesort(int[] digits )
	{
		for(int i = 0 ; i < digits.length ; i++)
		{
			for (int j = 0 ; j < digits.length - i - 1 ; j ++) {
				if ( digits[j] > digits[j+1] )
				{
					int t = digits[j];
					digits[j] = digits[j +1] ;
					digits[j+1] = t;
				}
			}	
		}
	}
	
	private static void sort(int [] digits)
	{
		for(int i = 0 ; i < digits.length ; i++)
		{
			for (int j = 0 ; j < digits.length - i - 1 ; j ++) {
				if ( digits[j] < digits[j+1] )
				{
					int t = digits[j];
					digits[j] = digits[j +1] ;
					digits[j+1] = t;
				}
			
	}
	}
	}
}
