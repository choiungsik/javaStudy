package project1team;

import java.util.Scanner;

public class �ڹ�0528_1_�ݿø��̻� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner��� �Լ��� ���� �� �Է¹ޱ�
		// scan�̶�� ������ ����� ������ ���ο� Scanner�� �����ϵ��� ����
		// �ʿ��� ���� system���� in�Է� �޵��� ����
		Scanner scan = new Scanner(System.in);

		System.out.print("�ݿø� �� �� : ");
		int num1 = scan.nextInt();

		// Math.round�� 10���� ���� ���� �Ҽ��� �ݿø�
		// int�� ���ؼ� ������ �������·� ����, �ٽ� ���ؼ� ���������� ��ȯ
		System.out.println("�ݿø� �� �� : " + (int) Math.round(num1 / 10) * 10);

	}

}
