package project1team;

import java.util.Scanner;

public class �ڹ�0607_1 {

	public static void main(String[] args) {
		// ���� n�� �Է��ϸ� n X n ������ ������ �迭 ����

		Scanner scan = new Scanner(System.in);
		System.out.println("���� n �Է� :");
		int n = scan.nextInt();
		int list1[][] = new int[n][n];
		int num = 0;

		// ��� �迭�� ������ 0, 2, 4 �� ¦����(i)�� 0���� n-1��(j)���� �����ϴ� ���·� ����
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					num++;
					list1[i][j] = num;
				}
		// ��� �迭�� ������ 1, 3, 5 �� Ȧ����(i)�� n-1����� 0��(j)���� �����ϴ� ���·� ����
			}else {
				for (int j = n-1; j >= 0; j--) {
					num++;
					list1[i][j] = num;
				}
			}
		}

		// �迭�� �� ä����� ó������ ������ ��Ҹ� �� ��½� ���ϴ� ���̺� ������
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(list1[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
