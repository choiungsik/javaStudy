package exam01;

import java.util.Scanner;

public class for���ݺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1���� 10���� ����ϴ� �ݺ���
		// i�� for�� �ȿ����� ��� ������ ��������
		for (int i = 2; i <= 9; i++) {
			System.out.println("====" + i + "��====");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (j * i));
			}
			System.out.println();
		}
	}

}
