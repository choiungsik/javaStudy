package exam02;

import java.util.Scanner;

public class data�Է°��ۼ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("User : ");
		String data = scan.next();

		switch (data) {
		case "�ȳ��ϼ���.":
			System.out.println("PC : ��, �ȳ��ϼ���!");
			break;
		case "�ݰ�����.":
			System.out.println("PC : ��, �ݰ�����!");
			break;
		case "�����ϼ���.":
			System.out.println("PC : ��, �����ϼ���!");
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			break;
		}
	}

}
