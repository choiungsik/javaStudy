package exam02;

import java.util.Random;

public class �ζǰ���Ȯ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ζǤ̤̤�
		// ��÷�� �غ�
		int[] lotto = new int[45];
		// ��÷�⿡ ���� �ִ´�.
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]); // pinrtf("%2d",lotto[i]) 2�ڸ� �������� ������������ ����
			if ((i + 1) % 10 == 0) { // 10 ������ �ٹٲ� ������
				System.out.println();
			}
		}
		System.out.println("\n=============������=============");

		// ��÷���� ���� ���´�.
		// lotto[0]�� ����� ���� lotto[1]~[44]������ ������ ��ġ�� ���� ��ȯ �Ѵ�.
		Random random = new Random();
		for (int i = 0; i < 1000000; i++) {
			int r = random.nextInt(44) + 1;
			int temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;

		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}

		}
		System.out.println("\n=============������=============");

		System.out.print("1�� ��ȣ : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println("���ʽ� : " + lotto[6]);
	}
}