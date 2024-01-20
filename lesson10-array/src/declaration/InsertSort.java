package declaration;

import until.ArrayUntils;

public class InsertSort {
	public static void main(String[] args) 
	{
		int[] digits = {4, 2 , 11 , 6 , 3 , 7 };
		ArrayUntils.printf("digits" , digits);
		insertsort(digits);
		ArrayUntils.printf("digits1" , digits);
		
	}
	private static void insertsort(int[] a )
	{
		for(int i = 1 ; i < a.length ; i++)
		{
			int key = a[i], value = i - 1 ;
			while( value>=0 && a[value] > key )
			{
				a[value + 1] = a[value];
				value --;
			}
			a[value + 1] = key;
		}
	}
	
}
