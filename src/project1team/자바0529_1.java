package project1team;

import java.util.Scanner;

public class �ڹ�0529_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° �����Է� >> ");
		int num1 = scan.nextInt();
		System.out.print("�ι�° �����Է� >> ");
		int num2 = scan.nextInt();

		System.out.println(num1 * (num2 % 10));
		System.out.println(num1 * (num2 % 100 / 10));
		System.out.println(num1 * (num2 / 100));
		System.out.println(num1 * num2);
	}

}
