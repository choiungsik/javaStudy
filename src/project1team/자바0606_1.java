package project1team;

import java.util.Scanner;

public class �ڹ�0606_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("���� n �Է� :");
		int n = scan.nextInt();
		int list1[][] = new int[n][n];
		int num = 0;	
		
		// n x n ���¸� �Ϲ����� ���·� ����
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				num++;
				list1[i][j] = num;
			}
		}

		// 0��° ��(i)�� ó�� ������Ű�� ��(j)�� n-1���� �ݺ��ϸ� ���ư��� ����
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%2d ",list1[j][i]);
			}
			System.out.println();
		}
	}
}
