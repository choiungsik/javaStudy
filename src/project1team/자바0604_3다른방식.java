package project1team;

import java.util.Scanner;

public class �ڹ�0604_3�ٸ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("N �Է� >> ");
		int n = scan.nextInt();
		System.out.print("X �Է� >> ");
		int x = scan.nextInt();
		int list1[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "��° �����Է� >> ");
			int y = scan.nextInt();
				list1[i] = y;
			}
		
		System.out.print("��� >> ");
		for (int i = 0; i < n; i++) {
			if (list1[i] < x) {
				System.out.print(list1[i] + " ");
			}
		}
	}

}
