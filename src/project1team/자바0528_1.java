package project1team;

import java.util.Scanner;

public class �ڹ�0528_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݿø� �� �� : ");
		int num1 = scan.nextInt();

		if (num1 % 10 >= 5) {
			System.out.println("�ݿø� �� �� : " + (num1 + (10 - num1 % 10)));
		} else {
			System.out.println("�ݿø� �� �� : " + ((num1 / 10) * 10));
		}
	}

}
