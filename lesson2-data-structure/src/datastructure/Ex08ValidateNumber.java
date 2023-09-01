package datastructure;

import java.util.Scanner;

public class Ex08ValidateNumber {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		int wrongTime = 0;
		do {
			String wrongTimeAsText = wrongTime > 0 ? "(" + wrongTime + ")" : "";
			System.out.println("Enter valid number" + wrongTimeAsText + ": ");
			numberAsText = ip.nextLine();
			if (!numberAsText.matches("\\d+")) {
				wrongTime++;
				if (wrongTime == 3) {
					System.out.println("Wrong times = 3 ==> EXIT");
					return;
				}
				continue;
			} else {
				break;
			}

		} while (true);
		int number = Integer.parseInt(numberAsText);
		System.out.println("value = " + number);
	}
}
