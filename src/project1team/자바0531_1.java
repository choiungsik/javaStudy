package project1team;

import java.util.Scanner;

public class 자바0531_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("소인수 분해할 수를 입력하세요. : ");
		int num1 = scan.nextInt();
		int flag = 0;
		System.out.print(num1 + "= ");
		for (int j = 2; j <= num1; j++) {
			while (num1 % j == 0) {
				if (flag == 0) {
					System.out.print(j);
					flag++;
					num1 /= j;
				} else {
					System.out.print("*" + j);
					num1 /= j;
				}
			}
		}
	}
}
