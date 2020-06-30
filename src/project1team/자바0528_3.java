package project1team;

import java.util.Scanner;

public class ÀÚ¹Ù0528_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("³âµµÀÔ·Â >>> ");
		int year = scan.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("À±³â");
		} else {
			System.out.println("À±³â ¾Æ´Ô");
		}
	}
}
