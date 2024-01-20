package view;

public class Ex02MissingNumber {
	public static void main(String[] args) {
		int n = 6; 
		int[] numbers = { 3, 2, 1 ,5 ,6 };
		System.out.println("Missing element : " +  getMissingNumber(numbers, n));
	}
	
	private static int getMissingNumber (int[] numbers , int n ) {
		int sumAll = n* ( n + 1 ) / 2;
		int sum = 0 ; 
		for (int i = 0 ; i < n -1  ; i++) sum += numbers[i];
		return sumAll - sum;
	}
}
