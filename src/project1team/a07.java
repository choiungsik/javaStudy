package project1team;

import java.util.Scanner;

public class a07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ִ����� & �ּҰ���� ���ϱ�");
		Scanner scan = new Scanner(System.in);
		System.out.print("����1 �Է� >> ");
		int num1 = scan.nextInt();
		System.out.print("����2 �Է� >> ");
		int num2 = scan.nextInt();
		
		int max = 0;
		int min = 0;
		
		for (int i = num1; i >= 1; i--) {
			if (num1 % i == 0 && num2 % i ==0) {
				System.out.println("�ִ����� : "+i);
				max = i;
				break;
			}
		}
		System.out.println("�ּҰ���� : "+(num1*num2/max));
	}

}
