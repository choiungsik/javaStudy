package project1team;

import java.util.Scanner;

public class �ڹ�0607_1�ٸ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���� n �Է� : ");
		int n = scan.nextInt();
		int[][] array = new int[n][n];
		int num = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				num++;
				array[i][j] = num;
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < array.length; j++) {
					System.out.printf("%2d ", array[i][j]);
				}
				System.out.println();
			} else {
				for (int j = n - 1; j >= 0; j--) {
					System.out.printf("%2d ", array[i][j]);
				}
				System.out.println();
			}
		}
	}

}
