package view;

import java.util.Scanner;

public class Ex04UserValidationThrow {
	public static void main(String[] args) {
		
	
	Scanner ip = new Scanner(System.in);
	System.out.print("Enter password:");
	String password = ip.nextLine();
	if (validate(password)){
		System.out.println("Create account successful");
	}
			
	System.out.println("Finished ....");
}
	private static boolean validate (String password)
	{
		int length = password.length();
		if(length < 8 || length > 256) {
			throw new IllegalAccessException("At least 8 letters");
		}
		
		boolean atLowerLetter = false ; 
		for ( int i = 0 ; i < length ; i ++) {
			if (Character.isLowerCase(password.charAt(i)))
			{
				atLowerLetter = true;
				break;
			}
		}
		return atLowerLetter;
	}
}
