package project1team;

import java.util.Scanner;

public class �ڹ�0530_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("�Է� : ");
		int num1 = scan.nextInt();
		int res = 1;
		for (int i = 1; i <= num1; i++) {
			res *= i;
		}
		System.out.println(res);
	}

}
