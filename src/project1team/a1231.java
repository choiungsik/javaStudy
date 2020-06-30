package project1team;

import java.util.Scanner;

public class a1231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		int num1 = sc.nextInt();
		System.out.println("숫자입력");
		int num2 = sc.nextInt();
		int min = 0;

		for (int i = 0; i < args.length; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				min = i;
				System.out.println("최소공약수" + min);
			}
		}

	}

}
