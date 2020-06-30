package project1team;

import java.util.Scanner;

public class 자바0607_1 {

	public static void main(String[] args) {
		// 정수 n을 입력하면 n X n 형태의 다차원 배열 형성

		Scanner scan = new Scanner(System.in);
		System.out.println("정수 n 입력 :");
		int n = scan.nextInt();
		int list1[][] = new int[n][n];
		int num = 0;

		// 몇개의 배열이 나오든 0, 2, 4 등 짝수열(i)은 0부터 n-1행(j)까지 증가하는 형태로 나옴
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					num++;
					list1[i][j] = num;
				}
		// 몇개의 배열이 나오든 1, 3, 5 등 홀수열(i)은 n-1행부터 0행(j)까지 증가하는 형태로 나옴
			}else {
				for (int j = n-1; j >= 0; j--) {
					num++;
					list1[i][j] = num;
				}
			}
		}

		// 배열을 다 채우고나면 처음부터 끝까지 요소를 다 출력시 원하는 테이블 모양출력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(list1[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
