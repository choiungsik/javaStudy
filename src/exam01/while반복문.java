package exam01;

import java.util.Scanner;

public class while�ݺ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10���� ����ϴ� ���α׷�
		// 10���� ū ���� �Է��ϸ� ����Ǿ����ϴ�. ���

		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		while (num < 10) {
			System.out.print("�����Է� : ");
			num = scan.nextInt();
		}
		System.out.println("����Ǿ����ϴ�.");
	}
}
