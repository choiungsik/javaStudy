package project1team;

import java.util.Scanner;

public class �ڹ�0605_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int list1[] = new int[5];
		int change = 0;

		for (int i = 0; i < list1.length; i++) {
			System.out.print((i + 1) + "��° �� �Է� : ");
			list1[i] = scan.nextInt();
		}
		// �� ��Ҹ��� Ȯ���ؼ� ū���� �ڷ� ������ �ڿ� ���� ��(ū��)�� �������� �������� Ȯ����
		// ������� = �� �� ������ �ö󰡸鼭 Ŀ���°�ó�� ū������ ������ ����
		System.out.println();
		for (int i = 0; i < list1.length-1; i++) {
			for (int j = 0; j < list1.length-1; j++) {
				if (list1[j] > list1[j+1]) {
					change = list1[j];
					list1[j] = list1[j+1];
					list1[j+1] = change;
				}
			}
		}

		System.out.println("���� ��");
		for (int i = 0; i < list1.length; i++) {
			System.out.print(list1[i] + " ");
		}
	}
}
