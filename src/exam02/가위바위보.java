package exam02;

import java.util.Scanner;

public class ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("User1 �̸��Է� : ");
		String user1 = scan.next();
		System.out.print("User2 �̸��Է� : ");
		String user2 = scan.next();
		String replay = "";

		do {
			System.out.print(user1 + "�� ����, ����, �� �� �ϳ��� �Է��ϼ��� >>> ");
			String select1 = scan.next();
			System.out.print(user2 + "�� ����, ����, �� �� �ϳ��� �Է��ϼ��� >>> ");
			String select2 = scan.next();

			if (select2.equals(select1)) {
				System.out.println("�����ϴ�.");
			} else {
				if (select1.equals("����") && select2.equals("����")) {
					System.out.println(user1 + "���� �̰���ϴ�.");
				} else if (select1.equals("����") && select2.equals("��")) {
					System.out.println(user1 + "���� �̰���ϴ�.");
				} else if (select1.equals("��") && select2.equals("����")) {
					System.out.println(user1 + "���� �̰���ϴ�.");
				} else {
					System.out.println(user2 + "���� �̰���ϴ�.");
				}
			}
			System.out.print("�ٽ� �Ͻðڽ��ϱ�? (Y/N) ");
			replay = scan.next();
		} while (replay.equals("Y") || replay.equals("y"));
		System.out.println("���α׷��� �����մϴ�.");
	}

}
