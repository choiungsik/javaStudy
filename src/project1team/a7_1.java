package project1team;

import java.util.Scanner;

public class a7_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�Է� : ");
		int n = scan.nextInt();
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		System.out.print("��� : ");
		System.out.println(result);
	}
}
