package project1team;

import java.util.Scanner;

public class �ڹ�0602_2�ٸ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� : ");
		int n = scan.nextInt();
		while (n > 0) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
			n--;
		}
	}
}
