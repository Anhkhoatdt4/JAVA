package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01DateOfBirthTryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		String yobAsText = "";
		int yob = 0 ;
		try {
			System.out.println("Enter year of birth: ");
			yob = Integer.parseInt(ip.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("error");
		}

		int curYear = Year.now().getValue();
		System.out.println("He is " + (curYear - yob + 1 ) + " years old");
	}
}
