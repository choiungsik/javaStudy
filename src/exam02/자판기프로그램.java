package exam02;

import java.util.Scanner;

public class ���Ǳ����α׷� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���.");
		int money = scan.nextInt();

		System.out.println("�޴��� ������.");
		System.out.println("1. �ݶ�(800��) 2. ����(500��) 3. ��Ÿ�ο���(1500��) >> ");
		int menu = scan.nextInt();
		int cost = 0;
		switch (menu) {
		case 1:
			cost = 800;
			break;
		case 2:
			cost = 500;
			break;
		case 3:
			cost = 1500;
			break;
		}

		if (money >= cost) {
			System.out.println("�ܵ� : " + (money - cost));
		} else {
			System.out.println("�ܵ� : " + money);
			System.out.println("���� �����ؿ�.");
		}
	}

}
