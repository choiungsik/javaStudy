package project1team;

import java.util.Random;

public class 자바0604_1다른방식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int list1[] = new int[8];
		int max = 0;
		int min = 999;

		System.out.print("배열에 있는 수 : ");
		for (int i = 0; i < list1.length; i++) {
			list1[i] = 1 + rand.nextInt(100);
			for (int j = 0; j < i; j++) {
				if (list1[i] == list1[j]) {
					i -= 1;
					break;
				}
			}
			if (max < list1[i]) {
				max = list1[i];
			}
			if (min > list1[i]) {
				min = list1[i];
			}
		}

		for (int var : list1) {
			System.out.print(var + " ");
		}
		System.out.println();
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}

}
