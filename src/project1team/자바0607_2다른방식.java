package project1team;

import java.util.Scanner;

public class �ڹ�0607_2�ٸ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�迭�� ũ�� �Է� : ");
		int n = scan.nextInt();
		
		System.out.println("90�� ȸ��");
		for (int i = n; i > 0 ; i--) {
			int num = i;
			for (int j = 0; j < n; j++) {
				System.out.printf("%2d ", num);
				num += n;
			}
			System.out.println();
		}
	}

}
