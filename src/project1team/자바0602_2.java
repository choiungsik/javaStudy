package project1team;

import java.util.Scanner;

public class �ڹ�0602_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� : ");
		int n = scan.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
