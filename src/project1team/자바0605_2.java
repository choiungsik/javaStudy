package project1team;

import java.util.Scanner;

public class �ڹ�0605_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		int num = scan.nextInt();
		String str = "";
		int count = 0;

		// pow�� ����ؼ� �Է°����� ū 2�� i�� ���� ã��
		// i�� 10������ 2������ �ٲپ��� �� ������ ���� 10������ ũ��� �� �� ���� ex)10 < 16(2�� 4��) = 10�� 4�ڸ����� ǥ������
		for (int i = 0; i < num; i++) {
			if (num < Math.pow(2, i)) {
				// ���� �ڸ����� �� ���� �ۿ��� �� �� �ִ� ������ ��� ������ ����
				count = i;
				break;
			}
		}
		// 2�� ������ �������� 0, ������ 1�� ������ 1�� ǥ���ؼ� �� ���� ���°� �ڿ� �ֱ� ���� �������·� ����
		for (int i = 0; i < count; i++) {
			if (num % 2 == 0) {
				str = "0 " + str;
				num /= 2;
			} else if (num % 2 == 1) {
				str = "1 " + str;
				num /= 2;
			}
		}
		System.out.println(str);
	}
}
