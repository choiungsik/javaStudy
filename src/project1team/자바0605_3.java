package project1team;

import java.util.Scanner;

public class �ڹ�0605_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int list1[] = new int[5];
		int change = 0;

		for (int i = 0; i < list1.length; i++) {
			System.out.print((i + 1) + "��° �� �Է� : ");
			list1[i] = scan.nextInt();
		}

		System.out.println();
		for (int i = 0; i < list1.length - 1; i++) {
			int min = i;
			// min�� �ּҰ��� ���� ������ ������ �ּҰ� min�� index��ȣ(j) Ȯ��
			for (int j = i + 1; j < list1.length; j++) {
				if (list1[min] > list1[j]) {
					min = j;
				}
			}
			// Ȯ���� index��ȣ�� ������� �������� ���� ���� �� ���� �����ϵ��� ����
			change = list1[i];
			list1[i] = list1[min];
			list1[min] = change;
		}

		System.out.println("���� ��");
		for (int var : list1) {
			System.out.print(var + " ");
		}
	}
}
