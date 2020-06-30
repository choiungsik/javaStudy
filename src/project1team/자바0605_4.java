package project1team;

import java.util.Scanner;

public class 자바0605_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int list1[] = new int[5];
		int change = 0;

		for (int i = 0; i < list1.length; i++) {
			System.out.print((i + 1) + "번째 수 입력 : ");
			list1[i] = scan.nextInt();
		}
		// 각 요소마다 확인해서 큰수는 뒤로 보내서 뒤에 보낸 수(큰수)를 기준으로 다음수를 확인함
		// 버들수열 = 물 속 기포가 올라가면서 커지는것처럼 큰수부터 나오는 수열
		System.out.println();
		for (int i = 0; i < list1.length-1; i++) {
			for (int j = 0; j < list1.length-1; j++) {
				if (list1[j] > list1[j+1]) {
					change = list1[j];
					list1[j] = list1[j+1];
					list1[j+1] = change;
				}
			}
		}

		System.out.println("정렬 후");
		for (int i = 0; i < list1.length; i++) {
			System.out.print(list1[i] + " ");
		}
	}
}
