package project1team;

import java.util.Scanner;

public class �ڹ�0528_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� ��¥ : ");
		int a = scan.nextInt();
		// ������ �⵵�� ������ ������ �⵵�� �Ҹ����� ǥ����
		boolean b = !(a % 4 == 0 && a % 100 > 0) && a % 400 > 0;
		if (b) {
			System.out.println("���� �ƴ�");
		} else {
			System.out.println("����");
		}
	}

}
