package project1team;

import java.util.Scanner;

public class 자바0529_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자입력 >> ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자입력 >> ");
		int num2 = scan.nextInt();

		System.out.println(num1 * (num2 % 10));
		System.out.println(num1 * (num2 % 100 / 10));
		System.out.println(num1 * (num2 / 100));
		System.out.println(num1 * num2);
	}

}
