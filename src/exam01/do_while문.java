package exam01;

import java.util.Scanner;

public class do_while�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ݵ�� 1���� �����Ű�� while�� ���ǹ��� �����ؼ� ������

		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int p_m = 0;
		String select;

		do {
			System.out.print("ù ��° ������ �Է��ϼ��� >> ");
			num1 = scan.nextInt();
			System.out.print("�� ��° ������ �Է��ϼ��� >> ");
			num2 = scan.nextInt();
			System.out.print("[1]���ϱ� [2]���� >> ");
			p_m = scan.nextInt();
			if (p_m == 1) {
				System.out.println("���ϱ� ���� ����� " + (num1 + num2) + "�Դϴ�.");
			} else if (p_m == 2) {
				System.out.println("���� ���� ����� " + (num1 - num2) + "�Դϴ�.");
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			System.out.print("�ٽ� �����Ͻðڽ��ϱ�? (Y/N)");
			select = scan.next();
			// select�� ���ڿ��̹Ƿ� int���¿��� ����ϴ� == �� �ƴ� equals�� ����ؼ� �����ϴٴ� ������ Ȯ�ν��Ѿ��Ѵ�.
			// ���࿡ char ���·� ���������� ���ڴ� ''�� ǥ���ؾ� �ν��� �� �ִ�.
		} while (select.equals("Y") );
		System.out.println("�����մϴ�.");
	}

}
