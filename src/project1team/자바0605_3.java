package project1team;

import java.util.Scanner;

public class 자바0605_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int list1[] = new int[5];
		int change = 0;

		for (int i = 0; i < list1.length; i++) {
			System.out.print((i + 1) + "번째 수 입력 : ");
			list1[i] = scan.nextInt();
		}

		System.out.println();
		for (int i = 0; i < list1.length - 1; i++) {
			int min = i;
			// min이 최소값을 가질 때까지 돌려서 최소값 min의 index번호(j) 확보
			for (int j = i + 1; j < list1.length; j++) {
				if (list1[min] > list1[j]) {
					min = j;
				}
			}
			// 확보한 index번호를 기반으로 수정되지 않은 제일 앞 값을 수정하도록 정렬
			change = list1[i];
			list1[i] = list1[min];
			list1[min] = change;
		}

		System.out.println("정렬 후");
		for (int var : list1) {
			System.out.print(var + " ");
		}
	}
}
