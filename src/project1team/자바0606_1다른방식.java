package project1team;

import java.util.Scanner;

public class �ڹ�0606_1�ٸ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("���� n �Է� : ");
		int n = scan.nextInt();
		int[][] array = new int[n][n];

		for (int i = 0; i < n; i++) {
			int num = i + 1;
			for (int j = 0; j < n; j++) {
				array[i][j] = num;
				System.out.printf("%2d ", array[i][j]);
				num += n;
			}
			System.out.println();
		}
	}

}
