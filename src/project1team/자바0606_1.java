package project1team;

import java.util.Scanner;

public class 자바0606_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("정수 n 입력 :");
		int n = scan.nextInt();
		int list1[][] = new int[n][n];
		int num = 0;	
		
		// n x n 형태를 일반적인 형태로 만듬
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				num++;
				list1[i][j] = num;
			}
		}

		// 0번째 열(i)을 처음 고정시키고 행(j)이 n-1까지 반복하며 돌아가는 형태
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%2d ",list1[j][i]);
			}
			System.out.println();
		}
	}
}
