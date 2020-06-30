package project1team;

import java.util.Random;

public class 자바0604_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		System.out.print("배열에 있는 모든 값 : ");
		int list1[] = new int[8];
		int count = 0;
		int ra = 0;
		for (int i = count; i < list1.length; i++) {
			ra = 1 + rand.nextInt(45);
			for (int j = 0; j < 8; j++) {
				if (i != j) {
					if (ra == list1[j]) {
						i -= 1;
						break;
					}else {
						list1[i] = ra;
					}
				}
			}
		}
		
		for (int i = 0; i < list1.length; i++) {
			System.out.print(list1[i]+" ");
		}

		System.out.println();
		int max = list1[0];
		int min = list1[0];
		for (int k = 1; k < 8; k++) {
			if (max <= list1[k]) {
				max = list1[k];
			}
			if (min >= list1[k]) {
				min = list1[k];
			}
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}
}
