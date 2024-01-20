package declaration;

import until.ArrayUntils;

public class SelectionSort
{
	public static void main(String[] args) 
	{
		int[] digits = {4, 2 , 11 , 6 , 3 , 7 };
		ArrayUntils.printf("digits" , digits);
		selectionsort(digits);
		ArrayUntils.printf("digits1" , digits);
		sort(digits);
		ArrayUntils.printf("digits2" , digits);
	}
	private static void selectionsort(int[] a )
	{
		for(int i = 0 ; i < a.length - 1; i++)
		{
			int min = i;
			for (int j = i + 1; j < a.length ; j++)
			{
				if(a[min] > a[j]) min = j;
			}
			int t = a[min];
			a[min] = a[i];
			a[i] = t ;
				
		}
	}
	
	private static void sort(int [] digits)
	{
		for(int i = 0 ; i < digits.length ; i++)
		{
			for (int j = 0 ; j < digits.length - i - 1 ; j ++) 
			{
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
