package project1team;

import java.util.Scanner;

public class �ڹ�0611_4�����̰� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("�پ ĭ�� �� �� : ");
		int n = scan.nextInt();
		System.out.println(jumpCase(n));

	}

	public static int jumpCase(int num) {

		// 2�� �� ���� ���ϱ� ���� num�� ���� ������ ���� 2�� �ڼ� j �� Ž��
		int two = num / 2;
		int result = 0;

		for (int j = two; j >= 0; j--) {
			double np = 1;
			double rp = 1;
			double n_rp = 1;
			// one�� 2�� �� ���� ������ �������� �� 1�� �� ���� �ǹ�
			int one = num - (j * 2);
			// 1�� �� �Ͱ� 2�� �� ���� ���ļ� ��� ���ؾ��ϹǷ� ���� �� n�� ����
			int n = one + j;
			// j�� �ۿ��� ���� ����? ���� �ʿ� ������ ������ ���� j�� for�� �ȿ��� Ȱ��
			//int r = j;

			// ����� ���� ���ϱ� ���� n�� ���丮��
			for (int i = n; i > 0; i--) {
				np *= i;
			}
			// ����� ���� ���ϱ� ���� 2�� �� j�� ���丮��
			for (int i = j; i > 0; i--) {
				rp *= i;
			}
			// ����� ���� ���ϱ� ���� 2�� ������ 1�� �� n-r�� ���丮��
			for (int i = n - j; i > 0; i--) {
				n_rp *= i;
			}
			result += np / rp / n_rp;
		}
		return result;
	}
}
