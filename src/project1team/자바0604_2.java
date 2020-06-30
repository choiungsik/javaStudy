package project1team;

import java.util.Random;

public class 자바0604_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int list1[] = new int[6];
		int ra = 0;
		for (int i = 0; i < list1.length; i++) {
			ra = 1 + rand.nextInt(45);
			for (int j = 0; j < list1.length; j++) {
				if (i != j) {
					// 중복된 값이 있을 경우 i값을 줄여놓고 다시 돌아가서 중복값이 나온 i에 대해 랜덤을 돌린다.
					if (ra == list1[j]) {
						i -= 1;
						break;
					} else {
						list1[i] = ra;
					}
				}
			}
		}

		for (int i = 0; i < list1.length; i++) {
			System.out.println("행운의 숫자 : "+list1[i]);
		}
	}
}
