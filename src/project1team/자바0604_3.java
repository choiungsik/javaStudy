package project1team;

import java.util.Scanner;

public class 자바0604_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("N 입력 >> ");
		int n = scan.nextInt();
		System.out.print("X 입력 >> ");
		int x = scan.nextInt();
		int list1[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "번째 정수입력 >> ");
			int y = scan.nextInt();
			if (x > y) {
				list1[i] = y;
			} else {
				list1[i] = 0;
			}
		}
		
		System.out.print("결과 >> ");
		for (int i = 0; i < n; i++) {
			if (list1[i] != 0) {
				System.out.print(list1[i] + " ");
			}
		}
		// 리스트 안 0이 아닌 수 출력
	}

}
