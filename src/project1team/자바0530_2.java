package project1team;

import java.util.Scanner;

public class 자바0530_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		int num1 = scan.nextInt();
		int res = 1;
		for (int i = 1; i <= num1; i++) {
			res *= i;
		}
		System.out.println(res);
	}

}
