package exam02;

import java.util.Scanner;

public class ���׿�����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù ��° ���� �Է� : ");
		int num1 = scan.nextInt();
		System.out.println("�� ��° ���� �Է� : ");
		int num2 = scan.nextInt();
		
		int res = num1 > num2 ? num1-num2 : num2-num1;
		System.out.println("�� ���� �� : "+res);
	}

}
