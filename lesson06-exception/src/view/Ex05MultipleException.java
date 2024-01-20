package view;

import java.util.Scanner;

public class Ex05MultipleException {
	public static void main(String[] args) {
		System.out.println("t = " + findX());
	}
	private static float findX() {
		Scanner ip = new Scanner(System.in);
		
		try {
			System.out.print("Enter a : ");
			int a = Integer.parseInt(ip.nextLine());
			System.out.print("Enter b : ");
			int b = Integer.parseInt(ip.nextLine());
			return (float)-b/a ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 1; 
	}
}
