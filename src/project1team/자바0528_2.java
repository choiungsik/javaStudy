package project1team;

import java.util.Scanner;

public class �ڹ�0528_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("����ݾ� : ");
		int num1 = scan.nextInt();

		// ����� ���� �����ؼ� �̾�� ���������� ���� ���� ã��(�̰� ����ó�� ����)
		System.out.println("�ܵ���ȯ");
		System.out.println("10000�� : " + num1 / 10000 + "��");
		System.out.println("5000�� : " + num1 % 10000 / 5000 + "��");
		System.out.println("1000�� : " + num1 % 10000 % 5000 / 1000 + "��");
		System.out.println("500�� : " + num1 % 10000 % 5000 % 1000 / 500 + "��");
		System.out.println("100�� : " + num1 % 10000 % 5000 % 1000 % 500 / 100 + "��");
	}
}
