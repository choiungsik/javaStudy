package exam02;

import java.util.Scanner;

public class loginprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String c_id = "Hello";
		int c_pw = 1234;
		String select = "";
		int count = 0;

		while (true) {
			System.out.print("���̵� �Է��ϼ��� >> ");
			String a_id = scan.next();
			System.out.print("��й�ȣ�� �Է��ϼ��� >> ");
			int a_pw = scan.nextInt();
			if (a_id.equals(c_id) && a_pw == c_pw) {
				System.out.println("�α��� ����!");
				break;
			} else {
				System.out.println("���̵�� ��й�ȣ�� �߸��Ǿ����ϴ�.");
				count++;
			}
			if (count == 3) {
				System.out.println("���̵�� ��й�ȣ�� 3ȸ Ʋ�Ƚ��ϴ�. ���������� ���ּ���.");
				break;
			}
			System.out.print("��� �Ͻðڽ��ϱ�? (Y/N) ");
			select = scan.next();
			if (select.equals("N")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}
}
