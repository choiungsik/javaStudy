package exam02;

import java.util.Scanner;

public class ��ǰ������α׷� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("����� ��ǰ ������ �Է��ϼ���.");
		int num = scan.nextInt();
		int price = 10000;
		int res = 0;
		if (num <= 10) {
			res = price * num;
		} else {
			res = (price / 10 * 9) * num;
		}

		System.out.println("������" + res + "�� �Դϴ�.");
	}

	public static void main2(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����� ��ǰ ������ �Է��ϼ���.");
		int num2 = scan.nextInt();
		int price2 = 10000 * num2;
		if (num2 <= 10) {
			price2 = price2 - price2 / 10;
		} else {
			if (num2 % 10 != 0) {
				price2 = price2 - price2 / 10;
			} else {
				price2 = price2 - price2 / 20;
			}
		}
		String result = String.format("�߼�������Ʈ���� : %d", price2);
		System.out.println(result);
	}
}
