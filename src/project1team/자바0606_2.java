package project1team;

import java.util.Arrays;

public class �ڹ�0606_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list1[][] = new int[5][5];
		int num = 0;

		System.out.println("����");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				num++;
				list1[j][i] = num;
				System.out.printf("%2d ", list1[j][i]);
			}
			System.out.println();
		}
		// �������� 180�� ȸ���̸� 4��° ��(i)�� ó�� ������Ű�� ��(j)�� 4���� 0���� �ݺ��ϸ� ���ư��� ����
		// ����ϴ� ���� ������ ������ �������� �̴´ٰ� �����ϰ� �ؾ� Ȯ���ϱ� ����
		System.out.println();
		System.out.println("180�� ȸ��");
		for (int i = 4; i >= 0; i--) {
			for (int j = 4; j >= 0; j--) {
				System.out.printf("%2d ", list1[j][i]);
			}
			System.out.println();
		}

	}
}
