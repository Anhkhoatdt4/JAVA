package declaration;

import java.util.Arrays;

public class Ex01CrudApp {
	public static void main(String[] args) {
		int[] numbers= {1, 9 , 5 , 36, 12, 33};
		System.out.println(sum(numbers));
		int[] resultArray = add(numbers,18,3);
		for (int result : resultArray)
			System.out.print(result+ "  ");
		System.out.println();
		int[] resultArrays = remove(numbers, 2);
		for (int result : resultArrays)
			System.out.print(result+ "  ");
	}
	
	private static int sum (int[] number)
	{
		int sum = 0; 
		for (int numbers : number)
			sum += numbers;
		return sum;
	}
	private static int[] add (int[] number, int value, int k)
	{
		int[] result = new int[number.length + 1 ];
		for(int i = 0 ; i < k ; i++)	result[i] = number[i];
//		for(int i = 0 ; i < number.length + 1 ; i++)
//		{
//			if (i == k ){
//				result[i] = value;
//				for(int j = k + 1 ; j < number.length +1; j++)
//				{
//					result[j] = number[j-1];
//				}
//			}
//		}
		result[k] = value;
		for(int i = k + 1 ; i < result.length ; i ++)
			result[i] = number[i-1];
		return result;
		
	}
	
	private static int[] remove(int[] source , int k)
	{
		for(int i = k ; i < source.length - 1 ; i++)
			source[i] = source[i+1];
		return Arrays.copyOfRange(source, 0, source.length-1);
	}
	
}
