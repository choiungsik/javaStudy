package frist;

import java.util.Scanner;

public class �պҽý��� {

	public static void main(String[] args) {
		// ����ó������� �� ������ ���䰳���� int�� Ÿ���� ���� 5���� �����ϰ� �Է¹�������.
//		      �� �����̶� 8�� �̸��� ���, �����հ��Դϴ�!���� ����ϰ� �� ������ 60�� 
//		      �̻��̸� ���հ��Դϴ�!���� ����ϴ� ���α׷��� ��������.

		Scanner sc = new Scanner(System.in);
		System.out.print("����Ʈ���� ���� >>");
		int a = sc.nextInt();
		System.out.print("����Ʈ���� ���� >>");
		int b = sc.nextInt();
		System.out.print("�����ͺ��̽� ���� >>");
		int c = sc.nextInt();
		System.out.print("���α׷��� ��� Ȱ�� >>");
		int d = sc.nextInt();
		System.out.print("�����ý��� ������� >>");
		int f = sc.nextInt();

		int sum = a + b + c + d + f;

		if (a < 8 || b < 8 || c < 8 || d < 8 || f < 8 || sum < 60) {
			System.out.println("���հ� �Դϴ�!");
		} else {
			System.out.println("�հ� �Դϴ�!");
		}
	}

}