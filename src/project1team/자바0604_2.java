package project1team;

import java.util.Random;

public class �ڹ�0604_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int list1[] = new int[6];
		int ra = 0;
		for (int i = 0; i < list1.length; i++) {
			ra = 1 + rand.nextInt(45);
			for (int j = 0; j < list1.length; j++) {
				if (i != j) {
					// �ߺ��� ���� ���� ��� i���� �ٿ����� �ٽ� ���ư��� �ߺ����� ���� i�� ���� ������ ������.
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
			System.out.println("����� ���� : "+list1[i]);
		}
	}
}
