package project1team;

import java.util.Scanner;

public class �ڹ�0610_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		int num = scan.nextInt();
		int sum = 0;

		while (true) {
			int n = num % 10;
			num /= 10;
			switch (n) {
			case 0:
			case 6:
			case 9:
				sum += 6;
				break;
			case 1:
				sum += 2;
				break;
			case 2:
			case 3:
			case 5:
				sum += 5;
				break;
			case 4:
				sum += 4;
				break;
			case 7:
				sum += 3;
				break;
			case 8:
				sum += 7;
				break;
			}
			if (num < 1) {
				System.out.print("���('-')�� �� �� >>" + sum);
				break;
			}
		}

	}

}
