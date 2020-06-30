package project1team;

import java.util.Scanner;

public class 자바0530_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자1 입력 >> ");
		int num1 = scan.nextInt();
		System.out.print("숫자2 입력 >> ");
		int num2 = scan.nextInt();
		int min = 0;

		for (int i = num1; i >= 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				min = i;
				System.out.println("최대공약수 : " + i);
				break;
			}
		}

		System.out.println("최소공배수 : " + (num1 * num2 / min));
	}

}
