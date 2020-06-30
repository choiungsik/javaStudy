package project1team;

import java.util.Scanner;

public class 자바0528_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("반올림 전 값 : ");
		int num1 = scan.nextInt();

		if (num1 % 10 >= 5) {
			System.out.println("반올림 후 값 : " + (num1 + (10 - num1 % 10)));
		} else {
			System.out.println("반올림 후 값 : " + ((num1 / 10) * 10));
		}
	}

}
