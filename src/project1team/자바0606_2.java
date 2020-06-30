package project1team;

import java.util.Arrays;

public class 자바0606_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list1[][] = new int[5][5];
		int num = 0;

		System.out.println("원본");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				num++;
				list1[j][i] = num;
				System.out.printf("%2d ", list1[j][i]);
			}
			System.out.println();
		}
		// 원본에서 180도 회전이면 4번째 열(i)을 처음 고정시키고 행(j)이 4부터 0까지 반복하며 돌아가는 형태
		// 출력하는 값은 기존에 만들어둔 원본에서 뽑는다고만 생각하고 해야 확인하기 쉬움
		System.out.println();
		System.out.println("180도 회전");
		for (int i = 4; i >= 0; i--) {
			for (int j = 4; j >= 0; j--) {
				System.out.printf("%2d ", list1[j][i]);
			}
			System.out.println();
		}

	}
}
