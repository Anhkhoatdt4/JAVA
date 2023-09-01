package homework;

public class Ex03Symetric {
	public static void main(String[] args) {
		System.out.println(isSymetric(13231));
	}
	private static boolean isSymetric (int number)
	{
		int sym = 0, tmp  = number ;
		while (number != 0)
		{
		sym = sym*10 + number % 10 ; 
	    number /= 10 ;
		}
		return tmp == sym ; 
	}
}
