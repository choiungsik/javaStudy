package project1team;

import java.util.Scanner;

public class �ڹ�0606_3�ٸ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�迭 �ۼ� : ");
		int n = scan.nextInt();
		int[][] array = new int[n][n];
		int num = 0;
		int L = n / 2;

		for (int i = 0; i < n; i++) {
			if (i < n / 2) {
				for (int j = L; j < n - L; j++) {
					num++;
					array[i][j] = num;
				}
				L -= 1;
			} else {
				for (int j = L; j < n - L; j++) {
					num++;
					array[i][j] = num;
				}
				L += 1;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
		if (n % 2 == 0) {
			for (int i = 0; i < n; i++) {
				System.out.printf("%2d ", 0);
			}
		}

	}

}
