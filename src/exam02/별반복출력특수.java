package exam02;

import java.util.Scanner;

public class ���ݺ����Ư�� {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݺ��� Ƚ�� : ");
		int num = scan.nextInt();
		
		for (int  j = 1; j <= num; j++) {
			for (int i = num; i >= j; i--) {
				System.out.print("@");
			}
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
