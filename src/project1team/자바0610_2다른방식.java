package project1team;

import java.util.Scanner;

public class �ڹ�0610_2�ٸ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		int num = scan.nextInt();
		int sum = 0;

		while (true) {
			int n = num % 10;
			if (num < 1) {     // break ������ �տ� �־�� ������ �ٸ� �۾� ���� �ٷ� ���� ���߿� ��������!
				System.out.println("���'-'�� �� �� >> " + sum);
				break;
			}
			if (n == 1) {
				sum += 2;
			} else if (n == 7) {
				sum += 3;
			} else if (n == 4) {
				sum += 4;
			} else if (n == 2 || n == 3 || n == 5) {
				sum += 5;
			} else if (n == 0 || n == 6 || n == 9) {
				sum += 6;
			} else {
				sum += 7;
			}
			num /= 10;
		}
	}

}
