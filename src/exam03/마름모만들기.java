package exam03;

import java.util.Scanner;

public class �����𸸵�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("�������� ���ݱ��� �Է� : ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = n + i; j >= n - i; j--) {
				System.out.print("@");
			}
			System.out.println();

		}
		for (int i = n; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = n + i; j >= n - i; j--) {
				System.out.print("@");
			}
			System.out.println();
		}
	}

}
