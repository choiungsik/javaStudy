package project1team;

import java.util.Scanner;

public class �ڹ�0531_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num_1;
		int num_2;
		int num_sum;
		while (true) {
			System.out.print("A�Է� >> ");
			num_1 = scan.nextInt();
			System.out.print("B�Է� >> ");
			num_2 = scan.nextInt();

			if (num_1 == 0 && num_2 == 0) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
			num_sum = num_1 - num_2;
			System.out.println("��� >> " + num_sum);
		}
	}

}
