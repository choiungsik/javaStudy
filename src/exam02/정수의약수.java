package exam02;

import java.util.Scanner;

public class �����Ǿ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = scan.nextInt();
		
		System.out.print(num+"�� ��� : ");
		for (int i = 1; i < num+1; i++) {
			if (num%i == 0) {
				System.out.print(i+" ");
			}
		}

	}

}
