package exam02;

import java.util.Scanner;

public class Ȧ¦���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = scan.nextInt();

		switch (num % 2) {
		case 1:
			System.out.println("Ȧ���Դϴ�!");
			break;

		default:
			System.out.println("¦���Դϴ�!");
			break;
		}

	}
}
