package homework;

public class Ex04mMMaxOdd {
	public static void main(String[] args) {
		int[] numbers = {2,4,6,8};
		System.out.println("so le lon nhat trong mang la : " + findMaxOddElement(numbers));
	}
	
	private static int findMaxOddElement ( int[] numbers) {
		int max = Integer.MIN_VALUE;
		int count = 0 ;
		for (int number : numbers ) {
			if (number %2 != 0) {
				if (max < number) {  max = number; 
					count ++ ;
				}
			}
		}
		if (count == 0) {
			System.out.println("khong co so le trong mang");
			System.exit(0);
		}
		return max ; 
	}
}
